package method;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String key = "Key";
        String message = "Email";


        Vigenere vigenere =  new Vigenere(message, key, true);

        vigenere.setName("Поточище");
        vigenere.start();
        vigenere.sleep(1000);
        String codeString  = vigenere.encrypt();
        System.out.println("Закодированная строка: " + codeString + "\n");
        vigenere.sleep(500);
        vigenere.decrypt(codeString);
        System.out.println("Декодированная строка: " + codeString);
    }
}


