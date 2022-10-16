
import uulib.Console;
import java.util.Formatter;

public class Main {

    public static void convTypeSelection() {

        //user enters required conversion type
        String convType = Console.getString("Enter conversion type: ");
        //print a new line
        System.out.println("\n");

        //call conversion method that corresponds to user's conversion type selection
        if (convType.equals("CF") || convType.equals("cf")) {
            celsiusToFahrenheit();
        } else if (convType.equals("FC") || convType.equals("fc")) {
            fahrenheitToCelsius();
        } else if (convType.equals("CK") || convType.equals("ck")) {
            celsiusToKelvin();
        } else if (convType.equals("KC") || convType.equals("kc")) {
            kelvinToCelsius();
        } else if (convType.equals("FK") || convType.equals("fk")) {
            fahrenheitToKelvin();
        } else if (convType.equals("KF") || convType.equals("kf")) {
            kelvinToFahrenheit();
        } else {
            System.out.println("invalid conversion type"); 
        }
    }

    public static void celsiusToFahrenheit() {
        //print conversion type header
        System.out.println("----CELSIUS TO FAHRENHEIT----");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in celsius: ");
        System.out.println("\n");

        double outputValue = 0;
        String inputFormat = "°C";
        String outputFormat = "°F";

        //perform conversion
        outputValue = (inputValue * 1.8) + 32;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
    }

    public static void fahrenheitToCelsius() {
        //print conversion type header
        System.out.println("----FAHRENHEIT TO CELSIUS----");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in fahrenheit: ");
        System.out.println("\n");
        
        double outputValue = 0;
        String inputFormat = "°F";
        String outputFormat = "°C";

        //perform conversion
        outputValue = (inputValue - 32) * 0.5556;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
    }

    public static void celsiusToKelvin() {
        //print conversion type header
        System.out.println("----CELSIUS TO KELVIN----" + "\n");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in celsius: ");
        System.out.println("\n");
        
        double outputValue = 0;
        String inputFormat = "°C";
        String outputFormat = "K";

        //perform conversion
        outputValue = inputValue + 273.15;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
    }

    public static void kelvinToCelsius() {
        //print conversion type header
        System.out.println("----KELVIN TO CELSIUS---" + "\n");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in kelvin: ");
        System.out.println("\n");
        
        double outputValue = 0;
        String inputFormat = "K";
        String outputFormat = "°C";

        //perform conversion
        outputValue = inputValue - 273.15;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
        
    }

    public static void fahrenheitToKelvin() {
        //print conversion type header
        System.out.println("----FAHRENHEIT TO KELVIN----" + "\n");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in fahrenheit: ");
        System.out.println("\n");
        
        double outputValue = 0;
        String inputFormat = "°F";
        String outputFormat = "K";

        //perform conversion
        outputValue = inputValue + 273.15;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
    }

    public static void kelvinToFahrenheit() {
        //print conversion type header
        System.out.println("----KELVIN TO FAHRENHEIT----" + "\n");

        //user enters input value
        double inputValue = Console.getDouble("Enter value in kelvin: ");
        System.out.println("\n");
        
        double outputValue = 0;
        String inputFormat = "K";
        String outputFormat = "°F";

        //perform conversion
        outputValue = inputValue + 273.15;
        //call printOutput method and pass parameters to print the converted value
        printOutput(inputFormat, outputFormat, inputValue, outputValue);
    }

    public static void printOutput(String inputFormat, String outputFormat, double inputValue, double outputValue) { 
        //round output value to 2dp
        Formatter formatter = new Formatter();
        formatter.format("%.2f", outputValue);=
        //print the final output
        System.out.println(inputValue + inputFormat + " equals " + formatter.toString() + outputFormat);
        formatter.close();
    }
    
    public static void main(String[] args) {
        //print program title
        System.out.println("------TEMPERATURE CONVERTER------" + "\n");
        //print a list of conversion types
        System.out.println("Conversion Types:" + "\n");
        System.out.println("• CF = Celsius to Fahrenheit"); 
        System.out.println("• FC = Fahrenheit to Celsius");
        System.out.println("• CK = Celsius to Kelvin");
        System.out.println("• KC = Kelvin to Celsius");
        System.out.println("• KF = Kelvin to Fahrenheit");
        System.out.println("• FK = Fahrenheit to Kelvin" + "\n");
        //call the conversion type selection method
        convTypeSelection();
    }
}