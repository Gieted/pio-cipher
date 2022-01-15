public class Cipher {
    
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int offset) {
        offset = alphabet.length() + offset % alphabet.length();

        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (character == ' ') {
                result.append(' ');
                continue;
            }

            int encryptedCharIndex =
                    (alphabet.indexOf(Character.toLowerCase(character)) + offset) % alphabet.length();

            char encryptedChar = alphabet.charAt(encryptedCharIndex);

            if (Character.isUpperCase(character)) {
                result.append(Character.toUpperCase(encryptedChar));
            } else {
                result.append(encryptedChar);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int offset) {
        return encrypt(text, -offset);
    }

    public static boolean isValid(String text) {
        return text.chars().allMatch(it -> it == ' ' || alphabet.indexOf(Character.toLowerCase(it)) != -1);
    }
}
