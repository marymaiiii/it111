public class celciusFarConverter {
    public static void main(String[] args) {
        //  far = (cel * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel+3) {
            far = (cel * 9/5) + 32;
            System.out.println(cel + " degrees Celcius is equal to " +far+ " degress Farenheit");
        } //end for loop
        System.out.println("All done!");
    }
}
