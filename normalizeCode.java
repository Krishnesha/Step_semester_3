import java.util.Scanner;

public class normalizeCode {

    static String normalizeCode(String raw) {

        raw = raw.trim();

        String publisher = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);

        return publisher + remaining;
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: Wrong length";
        }

        // Check first 3 characters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: Publisher code must be 3 letters";
            }
        }

        // Check remaining 10 characters
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: Body must contain only digits";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        return "[" + publisher + "] YEAR: " + year
                + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String raw = sc.nextLine();

        String code = normalizeCode(raw);

        System.out.println(validateAndFormat(code));
    }
}