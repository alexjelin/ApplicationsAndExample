package caesercipherapp;

public class CipherMethod {

    public class callbackFcn implements IEncryptable {

        public String encrypt(String plainText) {
            char[] encryptSequance = plainText.toCharArray();
            int shiftLenght = encryptSequance.length;
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String descSeq = "";
            for (int i = 0; i < encryptSequance.length; i++) {
                char letter = encryptSequance[i];
                for (int j = 0; j < alphabet.length; j++) {
                    if (alphabet[j] == letter) {
                        int indexOfLetter = j;
                        int desIndex = indexOfLetter + shiftLenght;
                        while (desIndex > alphabet.length - 1) {
                            desIndex = desIndex - alphabet.length;
                        }
                        descSeq += alphabet[desIndex];
                    }
                }
            }
            return descSeq;
        }

        public String decrypt(String cipherText) {
            char[] descrtiptSequance = cipherText.toCharArray();
            int shiftLenght = descrtiptSequance.length;
            char[] alphabet1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String descSeq = "";
            int desIndex = 0;
            for (int i = 0; i < descrtiptSequance.length; i++) {
                char letter = descrtiptSequance[i];
                for (int j = 0; j < alphabet1.length; j++) {
                    if (alphabet1[j] == letter) {
                        int indexOfLetter = j;
                        desIndex = indexOfLetter - shiftLenght;
                        while (desIndex < 0) {
                            desIndex = desIndex + alphabet1.length;
                        }
                        descSeq += alphabet1[desIndex];
                    }
                }
            }
            return descSeq;
        }
    }

    public IEncryptable getCipherMethod() {
        return new callbackFcn();
    }
}
