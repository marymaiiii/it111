import java.util.Scanner;

public class dailyspecial {
    public static void main(String[] args) {
        String special = null;

        Scanner input = new Scanner(System.in);

        String coffee = null;
        double price = 0;
        boolean weekenddays = true;

        while (weekenddays == true) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            special = input.next();


            switch (special) {
                case "Monday" -> {
                    weekenddays = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(special + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Tuesday" -> {
                    weekenddays = false;
                    coffee = "Frapp";
                    price = 5.95;
                    System.out.println(special + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Wednesday" -> {
                    weekenddays = false;
                    coffee = "Cappucino";
                    price = 4.35;
                    System.out.println(special + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Thursday" -> {
                    weekenddays = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(special + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Friday" -> {
                    weekenddays = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(special + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
            }
        }
            System.out.println("How many " + coffee + " would you like to order?");
            int number = input.nextInt();
            double money = number * price;
            if (number == 0) {
                System.out.println("Look like you don't like " + coffee + " So sad!");
            } else if (number == 1) {
                System.out.println("Look like you will be ordering only 1 " + coffee + " today!");
                System.out.println("Your total is " +money);
            } else if (number >= 2 && number <= 4) {
                System.out.printf("Thank you for your order, " + number + " orders of " + coffee + "total is ");
                System.out.printf("$%.2f", money);
            } else if (number >= 5 && number < 10) {
                System.out.println("You get 10% discount with an order of " +number+ " " +coffee+ "s");
                System.out.printf("Your regular price is $" +money+ ", and your total after discount is ");
                System.out.printf("$%.2f", 0.9*money);
            } else if (number >= 10) {
                System.out.println("You get 20% discount with an order of " +number+ " " +coffee+ "s");
                System.out.printf("Your regular price is $" +money+ ", and your total after discount is ");
                System.out.printf("$%.2f", 0.8*money);
            }
    }
}