public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        String allLettersBig = "АБВГДЖЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String allLettersSmall = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        for (int i = 0; i < allLettersBig.length(); i++) {
            System.out.println(allLettersBig.charAt(i) + " - " + (int) allLettersBig.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < allLettersSmall.length(); i++) {
            System.out.println(allLettersSmall.charAt(i) + " - " + (int) allLettersSmall.charAt(i));
        }
    }
}