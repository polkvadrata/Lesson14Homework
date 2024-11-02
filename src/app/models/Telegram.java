package app.models;

import app.services.Printer;

public class Telegram implements Printer {

    public static class Message{

        private String text;
        private String sender;

        public Message(String sender,String text) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public void send() {

            System.out.printf("Користувач %s відправив повідомлення: %s%n", sender, text);

        }
    }

    @Override
    public void print(String sender, String text) {

        if (sender == "" || sender == null) {
            if (text == null) {
                Printer errorMessage = new Printer() {
                    @Override
                    public void print(String sender, String text) {
                        System.out.printf("Опрацьовується пусте повідомлення від анонімного користувача...%n");
                    }
                };
                errorMessage.print("","");
            } else System.out.printf("Анонімний користувач відправив повідомлення: %s%n", text);

        } else {
            Message message = new Message(sender,text);
            message.send();
        }

    }
}
