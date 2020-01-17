package method;

public class Main {
    public static void main(String[] args) {
        String key = "Key";
        String message = "Email";

        Vigenere vigenere =  new Vigenere(message, key, true);

        String encryptedMsg = vigenere.encrypt();

        System.out.println("Введенная строка: " + message);
        System.out.println("Закодированная строка: " + encryptedMsg);
        System.out.println("Декодированная строка: " + vigenere.decrypt(encryptedMsg));

    }
}


