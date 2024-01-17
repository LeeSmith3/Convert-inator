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
        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");
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

        switch (speedUnits.toUpperCase()){
            case "MPS2KPH":
                mpsToKph();
                break;
            case "KPH2MPS":
                kphToMps();
                break;
            case "MPH2MPS":
                mphToMps();
                break;
            case "MPS2MPH":
                mpsToMph();
                break;
            case "KPH2MPH":
                kphToMph();
                break;
            case "MPH2KPH":
                mphToKph();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void areaMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of area would you like to convert? ");
        String areaUnits = input.next();

        switch (areaUnits.toUpperCase()){
            case "M2CM":
                metres2ToCm2();
                break;
            case "CM2M":
                cm2ToMetres2();
                break;
            case "M2SKM":
                metres2ToKm2();
                break;
            case "SKM2M":
                Km2toMetres2();
                break;
            case "CM2SKM":
                cm2ToKm2();
                break;
            case "SKM2CM":
                Km2ToCm2();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void volumeMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of volume would you like to convert? ");
        String volumeUnits = input.next();

        switch (volumeUnits.toUpperCase()){
            case "M2CM":
                metres3ToCm3();
                break;
            case "CM2M":
                cm3ToMetres3();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void lengthMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of length would you like to convert? ");
        String lengthUnits = input.next();

        switch (lengthUnits.toUpperCase()){
            case "M2CM":
                metresToCm();
                break;
            case "CM2M":
                cmToMetres();
                break;
            case "KM2M":
                kmToMetres();
                break;
            case "M2KM":
                metresToKm();
                break;
            case "KM2CM":
                kmToCm();
            case "CM2KM":
                cmToKm();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void energyMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"help\" for a list of commands.");
        System.out.print("\nWhich units of energy would you like to convert? ");
        String energyUnits = input.next();

        switch (energyUnits.toUpperCase()){
            case "J2KJ":
                joulesToKj();
                break;
            case "KJ2J":
                cmToMetres();
                break;
            case "HELP":
                System.out.println();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    // --------Help-sheets--------

    // main helpsheet - displays unit types that can be converted
    public static void helpSheet(){
        System.out.print("\n There are six commands that can currently be used: " +
                "\n - Temperature: enables temperature conversion " +
                "\n - Speed: enables speed conversion " +
                "\n - Area: enables area conversion " +
                "\n - Volume: enables volume conversion " +
                "\n - Length: enables length conversion " +
                "\n - Energy: enables energy conversion " +
                "\n \n");
        startScreen();
    }

    // temperature helpsheet - displays conversion options for temperature
    public static void tempSheet(){
        System.out.print("\n There are six commands that can currently be used");
    }
    // speed helpsheet - displays conversion options for speed
    public static void speedSheet(){

    }
    // area helpsheet - displays conversion options for area
    public static void areaSheet(){

    }
    // volume helpsheet - displays conversion options for volume
    public static void volumeSheet(){

    }
    // length helpsheet - displays conversion options for length
    public static void lengthSheet(){

    }
    // energy helpsheet - displays conversion options for energy

    public static void energySheet(){

    }

    // --------ERROR SCREENS--------
    public static void errScreen(){
        System.out.print("Invalid input. Please try again.\n");
        startScreen();
    }
}
