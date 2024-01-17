import java.util.*;
public class ConvertinatorBeta {

    public static void main(String[] args) {
        startScreen();
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
                tempSheet();
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
    }

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
        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");
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
                speedSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void mpsToKph(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in metres/second: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed * 3.6;
        System.out.println("Your speed is: "+convertedSpeed+"kph. Your conversion has been stored in a file.");
    }

    public static void kphToMps(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in kilometres/hour: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed / 3.6;
        System.out.println("Your speed is: "+convertedSpeed+"m/s. Your conversion has been stored in a file.");
    }

    public static void mphToMps(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in miles/hour: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed / 2.237;
        System.out.println("Your speed is: "+convertedSpeed+"m/s. Your conversion has been stored in a file.");
    }

    public static void mpsToMph(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in metres/second: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed * 2.237;
        System.out.println("Your speed is: "+convertedSpeed+"mph. Your conversion has been stored in a file.");
    }

    public static void kphToMph(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in kilometres/hour: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed / 1.609;
        System.out.println("Your speed is: "+convertedSpeed+"mph. Your conversion has been stored in a file.");
    }

    public static void mphToKph(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your speed in miles/hour: ");
        float speed = input.nextFloat();

        double convertedSpeed = speed * 1.609;
        System.out.println("Your speed is: "+convertedSpeed+"kph. Your conversion has been stored in a file.");
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
                km2toMetres2();
                break;
            case "CM2SKM":
                cm2ToKm2();
                break;
            case "SKM2CM":
                km2ToCm2();
                break;
            case "HELP":
                areaSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }
    public static void metres2ToCm2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in metres^2: ");
        float length = input.nextFloat();

        double convertedLength = length * 10000;
        System.out.println("Your length is: "+convertedLength+"cm^2. Your conversion has been stored in a file.");
    }

    public static void cm2ToMetres2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in centimetres^2: ");
        float length = input.nextFloat();

        double convertedLength = length / 10000.0;
        System.out.println("Your length is: "+convertedLength+"m^2. Your conversion has been stored in a file.");
    }

    public static void metres2ToKm2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in metres^2: ");
        float length = input.nextFloat();

        double convertedLength = length / 1000000.0;
        System.out.println("Your length is: "+convertedLength+"km^2. Your conversion has been stored in a file.");
    }

    public static void km2toMetres2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in kilometres^2: ");
        float length = input.nextFloat();

        double convertedLength = length * 1000000;
        System.out.println("Your length is: "+convertedLength+"m^2. Your conversion has been stored in a file.");
    }

    public static void cm2ToKm2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in centimetres^2: ");
        float length = input.nextFloat();

        double convertedLength = length / 10000000000.0;
        System.out.println("Your length is: "+convertedLength+"km^2. Your conversion has been stored in a file.");
    }

    public static void km2ToCm2(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your area in kilometres^2: ");
        float length = input.nextFloat();

        double convertedLength = length * 10000000000.0;
        System.out.println("Your length is: "+convertedLength+"m^2. Your conversion has been stored in a file.");
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
                volumeSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void metres3ToCm3(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your volume in metres^3: ");
        float length = input.nextFloat();

        double convertedLength = length * 1000000.0;
        System.out.println("Your length is: "+convertedLength+"cm^3. Your conversion has been stored in a file.");
    }

    public static void cm3ToMetres3(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your volume in centimetres^3: ");
        float length = input.nextFloat();

        double convertedLength = length / 1000000.0;
        System.out.println("Your length is: "+convertedLength+"m^3. Your conversion has been stored in a file.");
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
                lengthSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void metresToCm(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in metres: ");
        float length = input.nextFloat();

        double convertedLength = length * 100;
        System.out.println("Your length is: "+convertedLength+"cm. Your conversion has been stored in a file.");
    }

    public static void cmToMetres(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in centimetres: ");
        float length = input.nextFloat();

        double convertedLength = length / 100.00;
        System.out.println("Your length is: "+convertedLength+"m. Your conversion has been stored in a file.");
    }

    public static void kmToMetres(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in metres: ");
        float length = input.nextFloat();

        double convertedLength = length * 1000;
        System.out.println("Your length is: "+convertedLength+"m. Your conversion has been stored in a file.");
    }

    public static void metresToKm(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in metres: ");
        float length = input.nextInt();

        double convertedLength = length * 100;
        System.out.println("Your length is: "+convertedLength+"km. Your conversion has been stored in a file.");
    }

    public static void kmToCm(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in kilometres: ");
        float length = input.nextInt();

        double convertedLength = length * 100000;
        System.out.println("Your length is: "+convertedLength+"cm. Your conversion has been stored in a file.");
    }

    public static void cmToKm(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your length in centimetres: ");
        float length = input.nextInt();

        double convertedLength = length / 100000;
        System.out.println("Your length is: "+convertedLength+"km. Your conversion has been stored in a file.");
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
                kjToJoules();
                break;
            case "HELP":
                energySheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void joulesToKj(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your energy in joules: ");
        float energy = input.nextFloat();

        double convertedEnergy = energy / 1000.00;
        System.out.println("Your length is: "+convertedEnergy+"kj. Your conversion has been stored in a file.");
    }

    public static void kjToJoules(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter your energy in joules: ");
        float energy = input.nextFloat();

        double convertedEnergy = energy / 1000.00;
        System.out.println("Your length is: "+convertedEnergy+"j. Your conversion has been stored in a file.");
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
        System.out.print("\n There are six commands that can currently be used" +
                "\n - c2f: Celsius to Fahrenheit conversion" +
                "\n - f2c: Fahrenheit to Celsius conversion" +
                "\n - k2f: Kelvin to Fahrenheit conversion" +
                "\n - f2k: Fahrenheit to Kelvin conversion" +
                "\n - k2c: Kelvin to Celsius conversion" +
                "\n - c2k: Celsius to Kelvin conversion");
        tempMode();
    }
    // speed helpsheet - displays conversion options for speed
    public static void speedSheet(){
        System.out.print("\n There are six commands that can currently be used" +
                "\n - mps2kph: Metres/s to Kilometres/h conversion" +
                "\n - kph2mps: Kilometres/h to Metres/s conversion" +
                "\n - mph2mps: Miles/h to Metres/s conversion" +
                "\n - mps2mph: Metres/s to Miles/h conversion" +
                "\n - kph2mph: Kilometres/h to Miles/h conversion" +
                "\n - mph2kps: Miles/h to Kilometres/h conversion");
    }
    // area helpsheet - displays conversion options for area
    public static void areaSheet(){
        System.out.print("\n There are six commands that can currently be used" +
                "\n - m2cm: Metres^2 to Centimetres^2 conversion" +
                "\n - cm2m: Centimetres^2 to Metres^2 conversion" +
                "\n - m2skm: Metres^2 to Square Kilometre conversion" +
                "\n - skm2m: Square Kilometre to Metres^2 conversion" +
                "\n - cm2skm: Centimetres^2 to Square Kilometre conversion" +
                "\n - skm2cm: Square Kilometre to Centimetres^2 conversion");
    }
    // volume helpsheet - displays conversion options for volume
    public static void volumeSheet(){
        System.out.print("\n There are two commands that can currently be used" +
                "\n - m2cm: Metres^3 to Centimetres^3 conversion" +
                "\n - cm2m: Centimetres^3 to Metres^3 conversion");
    }
    // length helpsheet - displays conversion options for length
    public static void lengthSheet(){
        System.out.print("\n There are six commands that can currently be used" +
                "\n - m2cm: Metres to Centimetres conversion" +
                "\n - cm2m: Centimetres to Metres conversion" +
                "\n - km2m: Metres to Kilometres conversion" +
                "\n - m2km: Kilometres to Metres conversion" +
                "\n - km2cm: Centimetres to Kilometres conversion" +
                "\n - cm2km: Kilometres to Centimetres conversion");
    }
    // energy helpsheet - displays conversion options for energy

    public static void energySheet(){
        System.out.print("\n There are two commands that can currently be used" +
                "\n j2kj: Joules to Kilojoules conversion" +
                "\n - kj2j: Kilojoules to Joules conversion");
    }

    // --------ERROR SCREENS--------
    public static void errScreen(){
        System.out.print("Invalid input. Please try again.\n");
        startScreen();
    }
}
