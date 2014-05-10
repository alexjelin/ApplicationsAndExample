
public class CipherMethod {

    public class callbackFcn implements IEncryptible {

        public String encrypt(String plainText, String cipherText) {
            char[] encryptSequance = plainText.toCharArray();
            int lenghtOfCipherText = cipherText.length();
            int shiftLenght = encryptSequance.length;
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            String[] matrix = new String[(int) (encryptSequance.length / lenghtOfCipherText) + 2];
            String part = "";
            int counter = 0;
            for (int i = 0; i < encryptSequance.length; i++) {
                part += encryptSequance[i];
                if (i % lenghtOfCipherText == 0) {
                    matrix[counter] = part;
                    counter++;
                }
                if (i == encryptSequance.length - 1) {
                    int number = lenghtOfCipherText - part.length();
                    for (int k = 0; k <= number; k++) {
                        part += " ";
                    }
                    matrix[counter] = part;
                }
            }
            char[] arr = {' '};
            String result = "";
            for (int i = 0; i < lenghtOfCipherText; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    arr = matrix[j].toCharArray();
                    result += arr[i];
                }
            }
            return result;
        }
    }

    public IEncryptible getCipherMethod() {
        return new callbackFcn();
    }
}
