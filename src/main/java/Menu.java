import java.util.Scanner;

public class Menu {

    public String inputURL() {
        String prefijo = "https://";
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Inserte una URL valida: ");
        String input = prefijo+scanner1.nextLine();
        System.out.println(input);

        return input;

    }

}