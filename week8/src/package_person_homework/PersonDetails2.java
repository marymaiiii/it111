package package_person_homework;

public class PersonDetails2 {
    // this file will have a main method
    public static void main(String[] args) {
        package_person_homework.Person2 firstPerson;
        package_person_homework.Person2 secondPerson;
        package_person_homework.Person2 thirdPerson;
        // in the process of creating an object from my Person class

        firstPerson = new package_person_homework.Person2();
        secondPerson = new package_person_homework.Person2();
        thirdPerson = new package_person_homework.Person2();

        // we will be entering the info, assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2001;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;


        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2000;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2021;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRate2 = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments for Age and Gender: " + firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments for year of car: " +firstPerson.assumeYear(adjustedRate2)+ " dollars");
        System.out.print("Here is " + firstPerson.name + "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.assumeYear(adjustedRate2));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments for Age and Gender: " + secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments for year of car: " +secondPerson.assumeYear(adjustedRate2)+ " dollars");
        System.out.print("Here is " + secondPerson.name + "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.assumeYear(adjustedRate2));

        System.out.println();


        thirdPerson.display();
        System.out.println("Preliminary Rate for " + thirdPerson.name + ": " + thirdPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments for Age and Gender: " + thirdPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments for year of car: " +thirdPerson.assumeYear(adjustedRate2)+ " dollars");
        System.out.print("Here is " + thirdPerson.name + "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate)+ thirdPerson.assumeYear(adjustedRate2));

    }
}