package caesercipherapp;

public interface IEncryptable {

    String encrypt(String plainText);
// returns the encrypted string
    String decrypt(String cipherText);
// returns the decrypted string
}
