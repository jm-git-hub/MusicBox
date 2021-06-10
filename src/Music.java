import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        String choice = "";

        final String classic = "classic";
        final String classicOne = "song 1";
        final String classicTwo = "song 2";
        final String classicThree = "song 3";
        final String classicFour = "song 4";

        final String pop = "pop";
        final String popOne = "song 5";
        final String popTwo = "song 6";
        final String popThree = "song 7";
        final String popFour = "song 8";

        final String rock = "rock";
        final String rockOne = "song 9";
        final String rockTwo = "song 10";
        final String rockThree = "song 11";
        final String rockFour = "song 12";

        Scanner scan = new Scanner(System.in);

        boolean isValid = true;
        String fistQuestion = "";

        System.out.println("Available music types are Classic, Pop, and Rock. \nPlease enter the music type ");

        while (isValid) {
            fistQuestion = fistQuestion.toLowerCase().trim();

            if (scan.hasNextDouble()) {
                System.out.println("You entered a number. Please enter Classic, Pop, or Rock");
                scan.reset();
                fistQuestion = scan.nextLine();
            } else {

                fistQuestion = scan.nextLine();

                switch (fistQuestion) {
                    case classic -> {
                        System.out.println("song 1, song 2, song 3, song 4 \nWhich one do you want to listen?");
                        isValid = false;
                    }
                    case pop -> {
                        System.out.println("song 5, song 6, song 7, song 8 \nWhich one do you want to listen?");
                        isValid = false;
                    }
                    case rock -> {
                        System.out.println("song 9, song 10, song 11, song 12 \nWhich one do you want to listen?");
                        isValid = false;
                    }
                    default -> System.out.println("The " + fistQuestion + " music category is not available\nAvailable music types are Classic, Pop, and Rock.\nPlease enter the music type");

                }
            }
        }
        isValid = true;

        while (isValid) {
            String secondQuestion = scan.nextLine();
            secondQuestion = secondQuestion.toLowerCase();

            if (fistQuestion.contains(classic)) {
                switch (secondQuestion) {
                    case classicOne -> {
                        choice = classicOne;
                        System.out.println("Please enter the 2$ for this music");
                        isValid = false;
                    }
                    case classicTwo -> {
                        choice = classicTwo;
                        System.out.println("Please enter the 2$ for this music");
                        isValid = false;
                    }
                    case classicThree -> {
                        choice = classicThree;
                        System.out.println("Please enter the 2$ for this music");
                        isValid = false;
                    }
                    case classicFour -> {
                        choice = classicFour;
                        System.out.println("Please enter the 2$ for this music");
                        isValid = false;
                    }
                    default -> {
                        System.out.println(secondQuestion + " is not available. Try again:");
                    }
                }
            } else if (fistQuestion.contains(pop)) {
                switch (secondQuestion) {
                    case popOne -> {
                        choice = popOne;
                        System.out.println("Please enter the 5$ for this music");
                        isValid = false;
                    }
                    case popTwo -> {
                        choice = popTwo;
                        System.out.println("Please enter the 5$ for this music");
                        isValid = false;
                    }
                    case popThree -> {
                        choice = popThree;
                        System.out.println("Please enter the 5$ for this music");
                        isValid = false;
                    }
                    case popFour -> {
                        choice = popFour;
                        System.out.println("Please enter the 5$ for this music");
                        isValid = false;
                    }
                    default -> {
                        System.out.println(secondQuestion + " is not available. Try again:");
                    }
                }
            } else {
                switch (secondQuestion) {
                    case rockOne -> {
                        choice = rockOne;
                        System.out.println("Please enter the 8$ for this music");
                        isValid = false;
                    }
                    case rockTwo -> {
                        choice = rockTwo;
                        System.out.println("Please enter the 8$ for this music");
                        isValid = false;
                    }
                    case rockThree -> {
                        choice = rockThree;
                        System.out.println("Please enter the 8$ for this music");
                        isValid = false;
                    }
                    case rockFour -> {
                        choice = rockFour;
                        System.out.println("Please enter the 8$ for this music");
                        isValid = false;
                    }
                    default -> {
                        System.out.println(secondQuestion + " is not available. Try again:");
                    }
                }
            }
        }

        isValid = true;

        double price = 0;
        while (isValid) {
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                if (price >= 0) {
                    isValid = false;
                } else {
                    System.out.println("Invalid value");
                }
            }else if (!scan.hasNextDouble()){
                System.out.println("Invalid value");
                System.exit(-1);
            }
        }

            if (fistQuestion.contains(classic)) {
                if (price > 2) {
                    System.out.println("You have entered " + (price - 2) + " dollar more. Please wait for change. " + choice.toUpperCase() + " is playing. Enjoy the music");
                } else if (price == 2) {
                    System.out.println(choice + " is playing");
                } else {
                    System.out.println(price + " is not enough");
                }
                scan.close();
            } else if (fistQuestion.contains(pop)) {
                if (price > 5) {
                    System.out.println("You have entered " + (price - 5) + " dollar more. Please wait for change. " + choice.toUpperCase() + " is playing. Enjoy the music");
                } else if (price == 5) {
                    System.out.println(choice + " is playing");
                } else {
                    System.out.println(price + " is not enough");
                }
                scan.close();
            } else {
                if (price > 8) {
                    System.out.println("You have entered " + (price - 8) + " dollar more. Please wait for change. " + choice.toUpperCase() + " is playing. Enjoy the music");
                } else if (price == 8) {
                    System.out.println(choice + " is playing");
                } else {
                    System.out.println(price + " is not enough");
                }
                scan.close();
            }
        }
    }
