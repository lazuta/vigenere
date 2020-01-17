package method;

class Vigenere {
    protected String word;
    protected String key;

    Vigenere(String word, String key) {
        this.word = word;
        this.key = key;
    }

    public String encrypt()
    {
        String res = "";
        this.word = this.word.toUpperCase();
        for (int i = 0, j = 0; i < this.word.length(); i++)
        {
            char c = this.word.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c + this.key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % this.key.length();
        }
        return res;
    }

    public String decrypt(String text)
    {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c - this.key.charAt(j) + 26) % 26 + 'A');
            j = ++j % this.key.length();
        }
        return res;
    }

}
