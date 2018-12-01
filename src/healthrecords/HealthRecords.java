package healthrecords;

import java.util.Scanner;

public class HealthRecords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your month of birth");
        int month = input.nextInt();
        System.out.println("Enter your day of birth");
        int day = input.nextInt();
        System.out.println("Enter your year of birth");
        int year = input.nextInt();
        System.out.println("Enter your weight in kg");
        double weight = input.nextDouble();
        System.out.println("Enter your height in meters");
        double height = input.nextDouble();
        HeartRate heartRate = new HeartRate(firstName, lastName, month, day, year);
        BodyIndexMassCalculator indexMass = new  BodyIndexMassCalculator(weight, height);
        heartRate.HeartRateCal();
        indexMass.bodyIndexCal();
        

    }

}
