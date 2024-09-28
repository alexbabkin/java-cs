package com.github.alexbabkin.javacs.encryption;

import java.util.Random;

public class Encryption {
    private static byte[] getRandomKey(int length) {
        byte[] dummy = new byte[length];
        Random random = new Random();
        random.nextBytes(dummy);
        return dummy;
    }

    public static EncryptedPair encrypt(String original) {
        if (original == null) {
            return null;
        }
        if (original.equals("")) {
            return new EncryptedPair(null, null);
        }
        byte[] originalBytes = original.getBytes();
        byte[] dummy = getRandomKey(originalBytes.length);
        byte[] encrypted = new byte[originalBytes.length];
        for (int i = 0; i < originalBytes.length; i++) {
            encrypted[i] = (byte) (originalBytes[i] ^ dummy[i]);
        }
        return new EncryptedPair(encrypted, dummy);
    }

    public static String decrypt(EncryptedPair encryptedPair) {
        if (encryptedPair == null) {
            return null;
        }
        byte[] encrypted = encryptedPair.getEncryptedString();
        if (encrypted == null) {
            return "";
        }
        byte[] decrypted = new byte[encryptedPair.getEncryptedString().length];
        for (int i = 0; i < encryptedPair.getEncryptedString().length; i++) {
            decrypted[i] =
                    (byte)
                            (encryptedPair.getEncryptedString()[i]
                                    ^ encryptedPair.getEncryptionKey()[i]);
        }
        return new String(decrypted);
    }
}
