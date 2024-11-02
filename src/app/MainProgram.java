package app;

import app.models.Telegram;

public class MainProgram {

    public static void main(String[] args) {

        Telegram telegram = new Telegram();

        telegram.print("Igor","Hello");
        telegram.print("","Hi");
        telegram.print(null,null);

    }

}
