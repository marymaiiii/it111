package package_person_input;

public class Person {
    // no main method
    //declaring our fields
    String name;
    char gender;
    int age;
   String zipCode;

   // we have several booleans for our specific violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;
    double baseLineRate = 300;

    // now we are going to create a method to display our inputs

    public void display() {
        System.out.println("This is what you have entered!");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Your baseline rate:" +baseLineRate+ " dollars");
        System.out.println("Your baseline rate is calculated without taking into consideration the following: Age, Credit Score, Violations and residence");
    }
}
