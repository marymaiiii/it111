package package_person_homework;

public class Person2 {
        String name;
        char gender;
        int age;
        int car;

        boolean violations;
        double creditScore;

        public void display() {
            System.out.println("Customer name: " +name);
            System.out.println("Age: " +age);
            System.out.println("Gender: " +gender);
            System.out.println("Car: " +car);
            System.out.println("Violation: " +violations);
            System.out.println("Credit Score: " +creditScore);
        }
        // our logic is regarding our credit score and violation
        public double getRate(double monthlyRate) {
            if(violations == true && creditScore <= 700){
                monthlyRate = 500.00;
            } else {
                monthlyRate = 100.00;
            }
            return monthlyRate;
        }
        public double assumeGender(double adjustedRate){
            if(gender == 'M' && age <= 25){
                adjustedRate = 100;

            } else {
                adjustedRate = 0;

            }
            return adjustedRate;
        }
        public double assumeYear (double adjustedRate2){
            if(car <= 2000 && violations == true && age <= 25){
                adjustedRate2 = 500;
            } else {
                adjustedRate2 = 200;
            }
            return adjustedRate2;
        }





    }


