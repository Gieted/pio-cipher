public class Main {

    public static void main(String[] args) {
        String text = "aBz";
        int offset = 300;
        System.out.println("Niezaszyfrowane: " + text);
        String encryptedText = Cipher.encrypt(text, offset);
        System.out.println("Zaszyfrowane: " + encryptedText);
        System.out.println("Odszyfrowane: " + Cipher.decrypt(encryptedText, offset));


        System.out.println(Cipher.isValid("abc"));
        System.out.println(Cipher.isValid("ABC"));
        System.out.println(Cipher.isValid("ABC GDFG"));
        System.out.println(Cipher.isValid("ABC 341GDFG"));
    }
}
