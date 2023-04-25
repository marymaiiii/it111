public class LiterstoGallonsConverter {
    public static void main(String[] args) {
        double lit, gal;
        int counter = 0;
        for(gal = 1; gal <= 100; gal = gal + 4) {
           lit =(gal * 3.79);
           // System.out.printf("$%.2f", lit);
            if (gal == 1) {
                System.out.printf("%.2f", lit);
                System.out.println(" Liters = " +gal+ " Gallon");
            } else {
                System.out.printf("%.2f", lit);
                System.out.println(" Liters = " +gal+ " Gallons");
            }
           counter += 1;
            if (counter == 5) {
                System.out.println();
            counter = 0;
            }

        } // end for loop
        System.out.println("We are done!");
    }
}
