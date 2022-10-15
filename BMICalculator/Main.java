import uulib.Console;

class Main {
    public static double inputWeight() {
        //prompt user to enter their weight in kg 
        double weight = Console.getDouble("Please enter your weight in KG: ");
        //return the weight that has been entered
        return weight;
    }

    public static double inputHeight() {
        //prompt user to enter their height in metres
        double height = Console.getDouble("Please enter your height in metres: ");
        //return the height that has been entered
        return height;
    }

    public static double calculateBmi(double weight, double height) {
        //calculate bmi value
        double bmi = weight / (height*height);
        //return calculated bmi value 
        return bmi;
    }

    public static String determineWeightStatus(double bmi) {
        //blank string to store weight status 
        String weightStatus = "";

        //determine weight status based on bmi 
        if(bmi < 18.5) {
            weightStatus = "You are underweight";
        } else if(bmi > 18.5 && bmi < 25) {
            weightStatus = "You are of a healthy weight";
        } else if(bmi > 25 && bmi < 30) {
            weightStatus = "You are overweight";
        } else if(bmi > 30) {
            weightStatus = "You are obese";
        }

        return weightStatus;
    }

    public static void main(String[] args) {
        System.out.println("----------BMI CALCULATOR----------");
        //call input and calculation variables
        double weight = inputWeight();
        double height = inputHeight();
        double bmi = calculateBmi(weight, height);
        String weightStatus = determineWeightStatus(bmi);

        //output the result of these calculations 
        System.out.println("BMI = " + String.format("%.1f" , bmi));
        System.out.println(weightStatus);

    }
}