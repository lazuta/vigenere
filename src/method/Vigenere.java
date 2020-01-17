package method;

class Vigenere extends Thread{
    protected String word;
    protected String key;
    protected boolean mode;

    Vigenere(String word, String key, boolean mode) {
        this.word = word;
        this.key = key;
        this.mode = mode;
    }

    @Override
    public void run() {
        System.out.println("\u001B[37m" + "Старт программы..." + "\u001B[0m");
        System.out.println("\u001B[37m" +  "Кодируем и декодируем..." + "\u001B[0m \n");
    }

    protected String encrypt() {
        StringBuilder res = new StringBuilder();

        try {
            this.word = this.word.toUpperCase();
            for (int i = 0, j = 0; i < this.word.length(); i++) {
                char c = this.word.charAt(i);
                if (c < 'A' || c > 'Z')
                    continue;
                res.append((char) ((c + this.key.charAt(j) - 2 * 'A') % 26 + 'A'));
                j = ++j % this.key.length();
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            if (mode) System.out.println("\u001B[34m" + "Encrypt bloсk finally" + "\u001B[0m");
        }

        return res.toString();
    }

    protected String decrypt(String text) {
        StringBuilder res = new StringBuilder();

        try {
            text = text.toUpperCase();
            for (int i = 0, j = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z')
                    continue;
                res.append((char) ((c - this.key.charAt(j) + 26) % 26 + 'A'));
                j = ++j % this.key.length();
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            if (mode) System.out.println("\u001B[34m" + "Decrypt bloсk finally" + "\u001B[0m");
        }

        return res.toString();
    }

}
