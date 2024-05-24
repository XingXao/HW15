import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        boolean isValid = true;
        int spaceCout = 0;
        final String ALLLATTERS = "АБВГДЖЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCout++;
            }
            if (!ALLLATTERS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if (isValid && spaceCout == 2) {
            System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')) + "\n" +
                    "Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim() + "\n" +
                    "Отчество: " + input.substring(input.lastIndexOf(' ')).trim());
        } else
            System.out.println("веденная строка не является ФИО");


    }
}