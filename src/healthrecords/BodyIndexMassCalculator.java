package healthrecords;

public class BodyIndexMassCalculator {

    private double weight;
    private double height;

    public BodyIndexMassCalculator(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void bodyIndexCal() {
        System.out.printf("Your weight is %.2f in kilogram, while your height is %.2f in meters%n", getWeight(), getHeight());
        double bmi = getWeight() / (getHeight() * getHeight());
        System.out.printf("Your Body Index Mass is: %f%n", bmi);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "BMI VALUES", "Underweight: less than 18.5", "Normal: between 18.5 and 24.9",
                "Overweight: between 25 and 29.9", "Obese: 30 or greater");
    }

}
