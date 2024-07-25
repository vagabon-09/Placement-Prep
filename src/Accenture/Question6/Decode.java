package Accenture.Question6;

public class Decode {
    public static void main(String[] args) {
//        String encode = "2 1 4 _ 3 1 20 _ @ # 459 ";
        String encode = "1 2 3 . # 1 # 2 # 3";
        String plainText = decodeString(encode);
        System.out.println(plainText);
    }

    public static String decodeString(String encoded) {
        if (encoded == null || encoded.isEmpty()) return "NULL";
        String[] tokens = encoded.split(" ");
        StringBuilder decodedWord = new StringBuilder();
        boolean shouldAppend = false;

        for (String token : tokens) {
            if (shouldAppend) {
                decodedWord.append(token);
                shouldAppend = false;
                continue;
            }

            switch (token) {
                case "_":
                    decodedWord.append(" ");
                    break;
                case "#":
                    shouldAppend = true;
                    break;
                default:
                    try {
                        int asciiValue = 64 + Integer.parseInt(token);
                        char character = (char) asciiValue;
                        decodedWord.append(character);
                    } catch (NumberFormatException e) {
                        decodedWord.append(token);
                    }
                    break;
            }
        }

        return decodedWord.toString();
    }

}
