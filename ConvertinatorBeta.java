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
            case "C2F" -> celsiusToFahrenheit();
            case "F2C" -> fahrToCels();
            case "K2F" -> kelvToFahr();
            case "F2K" -> fahrToKelv();
        }

    }

    public static void celsiusToFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n Please enter your temperature in celsius: ");

    }

    static void fahrToCels(){

    }

    public static void kelvToFahr(){

    }

    public static void fahrToKelv(){

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
