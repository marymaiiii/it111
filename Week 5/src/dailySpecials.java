import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends(Monday - Friday only!)");
        specials = input.next();


// in the world of coffee, I need a name of a coffee beverage and a price
        String coffee = null;
        double price = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

        }

        switch (specials) {
            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            default -> System.out.println("Please enter a valid day, or check your spelling!");
        }

        System.out.println("How many " + coffee + " would you like to order?");
            int number = input.nextInt();
            double money = number * price;
            if (number == 0) {
                System.out.println("Look like you don't like " + coffee + " So sad!");
            } else if (number == 1) {
                System.out.println("Look like you will be ordering only 1 " + coffee + " today!");
            } else {
                System.out.println(number + " " + coffee + " have been ordered totalling ");
               System.out.printf("$%.2f", money, " dollars!");
            }
//            switch (number) {
//                case 0: {
//                    System.out.println("Look like you don't like " + coffee + " So sad!");
//                }
//                case 1: {
//                    System.out.println("Look like you will be ordering only 1 " + coffee + " today!");
//                }
//                default -> System.out.println(number+ +coffee + " have been ordered totalling ");
//                System.out.printf("$%.2f", money);
//                System.out.println(" dollars!");
//            }
        }
    }