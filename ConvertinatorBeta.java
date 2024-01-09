import java.util.*;
public class ConvertinatorBeta {

    List<String> unitClass = new ArrayList<>(Arrays.asList("Temperature", "Speed", "Area", "Volume", "Length", "Energy"));
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n░░      ░░░      ░░   ░░░  ░  ░░░░  ░        ░       ░░        ░        ░   ░░░  ░░      ░░        ░░      ░░       ░░\n" +
                "▒  ▒▒▒▒  ▒  ▒▒▒▒  ▒    ▒▒  ▒  ▒▒▒▒  ▒  ▒▒▒▒▒▒▒  ▒▒▒▒  ▒▒▒▒  ▒▒▒▒▒▒▒  ▒▒▒▒    ▒▒  ▒  ▒▒▒▒  ▒▒▒▒  ▒▒▒▒  ▒▒▒▒  ▒  ▒▒▒▒  ▒\n" +
                "▓  ▓▓▓▓▓▓▓  ▓▓▓▓  ▓  ▓  ▓  ▓▓  ▓▓  ▓▓      ▓▓▓       ▓▓▓▓▓  ▓▓▓▓▓▓▓  ▓▓▓▓  ▓  ▓  ▓  ▓▓▓▓  ▓▓▓▓  ▓▓▓▓  ▓▓▓▓  ▓       ▓▓\n" +
                "█  ████  █  ████  █  ██    ███    ███  ███████  ███  █████  ███████  ████  ██    █        ████  ████  ████  █  ███  ██\n" +
                "██      ███      ██  ███   ████  ████        █  ████  ████  ████        █  ███   █  ████  ████  █████      ██  ████  █\n");
        System.out.println("Welcome to the Convert-inator!\n");
        System.out.print("What type of units would you like to convert today? ");
        String unitClass = input.next();
    }
}
