package Data;

import java.util.*;
import java.io.*;
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
                celsToKelv();
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
        
        float temp = 0;
        
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in celsius: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            celsToFahr();

        }

        float convertedTemp = (temp * 9/5) + 32;
        System.out.println("(Temperature X 9/5) + 32");
        System.out.println("Your temperature is: "+convertedTemp+"°F. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°F. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    static void fahrToCels(){

        float temp = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in fahrenheit: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            fahrToCels();
        }

        float convertedTemp = (temp - 32) * 5/9;

        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°C. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kelvToFahr(){

        float temp = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in kelvin: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kelvToFahr();
        }
        ;

        double convertedTemp = (temp - 273.15) * 9/5 + 32;

        System.out.println("Your temperature is: "+convertedTemp+"°F. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°F. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void fahrToKelv(){

        float temp = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in fahrenheit: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            fahrToKelv();
        }


        double convertedTemp = (temp - 32) * 5/9 + 273.15;

        System.out.println("Your temperature is: "+convertedTemp+"°K. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°K. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kelvToCels(){

        float temp = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in kelvin: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kelvToFahr();
        }

        double convertedTemp = temp - 273.15;
        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°C. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void celsToKelv(){

        float temp = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your temperature in celsius: ");
            temp = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            celsToKelv();
        }

        double convertedTemp = temp + 273.15;
        System.out.println("Your temperature is: "+convertedTemp+"°C. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedTemp+"°C. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
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
        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in metres/second: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            mpsToKph();
        }

        double convertedSpeed = speed * 3.6;
        System.out.println("Your speed is: "+convertedSpeed+"kph. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"kph. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }

    }

    public static void kphToMps(){

        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in kilometres/hour: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kphToMps();
        }

        double convertedSpeed = speed / 3.6;
        System.out.println("Your speed is: "+convertedSpeed+"m/s. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"m/s. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void mphToMps(){

        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in miles/hour: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            mphToMps();
        }

        double convertedSpeed = speed / 2.237;
        System.out.println("Your speed is: "+convertedSpeed+"m/s. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"m/s. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void mpsToMph(){

        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in metres/second: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            mpsToMph();
        }

        double convertedSpeed = speed * 2.237;
        System.out.println("Your speed is: "+convertedSpeed+"mph. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"mph. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kphToMph(){

        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in kilometres/hour: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kphToMph();
        }

        double convertedSpeed = speed / 1.609;
        System.out.println("Your speed is: "+convertedSpeed+"mph. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"mph. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void mphToKph(){

        float speed = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your speed in miles/hour: ");
            speed = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            mphToKph();
        }

        double convertedSpeed = speed * 1.609;
        System.out.println("Your speed is: "+convertedSpeed+"kph. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedSpeed+"mph. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
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

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in metres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            metres2ToCm2();
        }

        double convertedArea = area * 10000;
        System.out.println("Your area is: "+convertedArea+"cm^2. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"cm^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void cm2ToMetres2(){

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in centimetres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            cm2ToMetres2();
        }

        double convertedArea = area / 10000.0;
        System.out.println("Your area is: "+convertedArea+"m^2. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"m^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void metres2ToKm2(){

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in metres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            metres2ToKm2();
        }

        double convertedArea = area / 1000000.0;
        System.out.println("Your area is: "+convertedArea+"km^2. Your conversion has been stored in a file.");
        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"km^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void km2toMetres2(){

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in kilometres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            km2toMetres2();
        }

        double convertedArea = area * 1000000;
        System.out.println("Your area is: "+convertedArea+"m^2. Your conversion has been stored in a file.");
        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"m^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void cm2ToKm2(){

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in centimetres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            cm2ToKm2();
        }

        double convertedArea = area / 10000000000.0;
        System.out.println("Your area is: "+convertedArea+"km^2. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"km^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void km2ToCm2(){

        float area = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your area in kilometres^2: ");
            area = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            km2ToCm2();
        }

        double convertedArea = area * 10000000000.0;
        System.out.println("Your area is: "+convertedArea+"cm^2. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedArea+"cm^2. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
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
                volumeSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void metres3ToCm3(){

        float volume = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your volume in metres^3: ");
            volume = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            metres3ToCm3();
        }

        double convertedVolume = volume * 1000000.0;
        System.out.println("Your volume is: "+convertedVolume+"cm^3. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedVolume+"cm^3. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void cm3ToMetres3(){

        float volume = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your volume in centimetres^3: ");
            volume = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            cm3ToMetres3();
        }

        double convertedVolume = volume / 1000000.0;
        System.out.println("Your volume is: "+convertedVolume+"m^3. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedVolume+"m^3. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
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
                lengthSheet();
            default:
                System.out.print("Invalid input. Please try again.\n") ;
                tempMode();
                break;
        }
    }

    public static void metresToCm(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in metres: ");
            length = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            metresToCm();
        }

        double convertedLength = length * 100;
        System.out.println("Your length is: "+convertedLength+"cm. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"cm. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void cmToMetres(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in centimetres: ");
            length = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            cmToMetres();
        }

        double convertedLength = length / 100.00;
        System.out.println("Your length is: "+convertedLength+"m. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"m. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kmToMetres(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in kilometres: ");
            length = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kmToMetres();
        }

        double convertedLength = length * 1000;
        System.out.println("Your length is: "+convertedLength+"m. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"m. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void metresToKm(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in metres: ");
            length = input.nextInt();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            metresToKm();
        }

        double convertedLength = length * 100;
        System.out.println("Your length is: "+convertedLength+"km. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"km. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kmToCm(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in kilometres: ");
            length = input.nextInt();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kmToCm();
        }

        double convertedLength = length * 100000;
        System.out.println("Your length is: "+convertedLength+"cm. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"cm. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void cmToKm(){

        float length = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your length in centimetres: ");
            length = input.nextInt();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            cmToKm();
        }

        double convertedLength = length / 100000;
        System.out.println("Your length is: "+convertedLength+"km. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedLength+"km. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
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

        float energy = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your energy in joules: ");
            energy = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            joulesToKj();
        }

        double convertedEnergy = energy / 1000.00;
        System.out.println("Your energy measurement is: "+convertedEnergy+"kj. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedEnergy+"kj. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void kjToJoules(){

        float energy = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("\n Please enter your energy in joules: ");
            energy = input.nextFloat();
            input.close();
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again.");
            kjToJoules();
        }

        double convertedEnergy = energy / 1000.00;
        System.out.println("Your energy measurement is: "+convertedEnergy+"j. Your conversion has been stored in a file.");

        try {
            FileWriter out = new FileWriter("Logs/ConvertedMeasurement.txt");
            out.write("Your converted measurement is "+convertedEnergy+"j. Thank you for using the Convertinator!");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
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
