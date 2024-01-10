import java.util.*;
public class ConvertinatorBeta {

    public static void main(String[] args) {
        startScreen();;
    }
    public static void startScreen(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Convert-inator!\n");
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("What type of units would you like to convert today? ");
        String unitClass = input.next();

        switch (unitClass.toUpperCase()) {
            case "TEMPERATURE" -> tempMode();
            case "SPEED" -> speedMode();
            case "AREA" -> areaMode();
            case "VOLUME" -> volumeMode();
            case "LENGTH" -> lengthMode();
            case "ENERGY" -> energyMode();
            case "HELP" -> helpSheet();
            default -> errScreen();
        }

    }

    public static void tempMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nType \"help\" for a list of commands.");
        System.out.print("Which units of temperature would you like to convert? ");
        String tempUnits = input.next();

        switch (tempUnits.toUpperCase()){
            case "C2F":
                celsToFahr();
                break;
            case "F2C":
                fahrToCels();
                break;
            case "K2F":
                kelvToFahr();
                break;
            case "F2K":
                fahrToKelv();
                break;
            case "K2C":
                kelvToCels();
                break;
            case "C2K":
                CelsToKelv();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }

    }

    public static void celsToFahr(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in celsius: ");
        float temp = input.nextFloat();

        float convertedTemp = (temp * 9/5) + 32;

        System.out.println("Your temperature is: "+convertedTemp+"°F. Your conversion has been stored in a file.");
    }

    static void fahrToCels(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in fahrenheit: ");
        float temp = input.nextFloat();

        float convertedTemp = (temp - 32) * 5/9;

        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");
    }

    public static void kelvToFahr(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in kelvin: ");
        float temp = input.nextFloat();

        double convertedTemp = (temp - 273.15) * 9/5 + 32;

        System.out.println("Your temperature is: "+convertedTemp+"°F. Your conversion has been stored in a file.");
    };

    public static void fahrToKelv(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in fahrenheit: ");
        float temp = input.nextFloat();

        double convertedTemp = (temp - 32) * 5/9 + 273.15;

        System.out.println("Your temperature is: "+convertedTemp+"°K. Your conversion has been stored in a file.");
    }

    public static void kelvToCels(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in kelvin: ");
        float temp = input.nextFloat();

        double convertedTemp = temp - 273.15;
    }

    public static void CelsToKelv(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your temperature in celsius: ");
        float temp = input.nextFloat();

        double convertedTemp = temp + 273.15;
    }
    public static void speedMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of speed would you like to convert? ");
        String speedUnits = input.next();
    }

    public static void areaMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of area would you like to convert? ");
        String areaUnits = input.next();
    }

    public static void volumeMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of volume would you like to convert? ");
        String volumeUnits = input.next();
    }

    public static void lengthMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of length would you like to convert? ");
        String lengthUnits = input.next();
    }

    public static void energyMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of energy would you like to convert? ");
        String energyUnits = input.next();
    }

    public static void helpSheet(){
        System.out.print("\n There are six commands that can currently be used: \n - Temperature: enables temperature conversion \n - Speed: enables speed conversion \n - Area: enables area conversion \n - Volume: enables volume conversion \n - Length: enables length conversion \n - Energy: enables energy conversion \n \n");
        startScreen();
    }

    public static void errScreen(){
        System.out.print("Invalid input. Please try again.\n");
        startScreen();
    }
}
