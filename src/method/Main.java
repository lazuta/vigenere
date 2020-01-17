package method;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String key = "Key";
        String message = "Email";


        Vigenere vigenere =  new Vigenere(message, key, true);

        vigenere.start();
    }
}


