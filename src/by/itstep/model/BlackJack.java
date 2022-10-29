package by.itstep.model;

import java.util.Scanner;

public class BlackJack extends Game{

    public static final String BLACK_JACK = "Black Jack";

    public  BlackJack() {
        super(BLACK_JACK);
    }

    @Override
    public void start(User user) {
        System.out.println("Hello " + user.name + " lets play in " + BLACK_JACK);

        int userCard1, userCard2, userPoints;

        //Todo each card can be 1-11
        userCard1 = getCard();
        userCard2 = getCard();
        userPoints = userCard1 + userCard2;

        System.out.println("Your card 1 is " + userCard1);
        System.out.println("Your card 2 is " + userCard2);
        System.out.println("Your points is " + userPoints);

        Scanner sc = new Scanner(System.in);
        int answer = 1;

        int complex = 2;


        while (answer == 1) {
            System.out.println("What next card? 1 (yes) / 2 (no)");
            answer = sc.nextInt();


            if (answer == 1) {
                int newcard = getCard();
                System.out.println(newcard);
                userPoints += newcard;
                System.out.println(userPoints);

            }
        }

        System.out.println("Bot logic start");

        int botResult = 0;

        if (complex == 1) {
            while (botResult <= 16) {
                int botCard = getCard();
                System.out.println("Bot card : "  + botCard);
                botResult += botCard;
            }
        } else if (complex == 2 ) {
            while (botResult <= 16) {
                int botCard = getCard();
                System.out.println("Bot card : "  + botCard);
                botResult += botCard;
            }

            if (userPoints < 22 && botResult < userPoints) {
                int botCard = getCard();
                System.out.println("Bot card : "  + botCard);
                botResult += botCard;
            }
        }



        if (userPoints > botResult) {
            if (userPoints <= 21) {
                System.out.println("win");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            } else if (botResult <= 21) {
                System.out.println("lose");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            } else {
                System.out.println("draw");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            }
        } else if (userPoints < botResult) {
            if (botResult <= 21) {
                System.out.println("lose");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            } else if (userPoints <= 21) {
                System.out.println("win");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            } else {
                System.out.println("draw");
                System.out.println("bot: " + botResult);
                System.out.println("user: " + userPoints);
            }
        }


        sc.close();
    }

    int getCard() {
        //ToDo take from array of cards
        return (int)(Math.random() * 10) + 1;
    }

    int botLogic() {
        int botPoints = 0;

        while (botPoints <= 16) {
            botPoints += getCard();
        }

        return botPoints;
    }
}
