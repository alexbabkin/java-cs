package com.github.alexbabkin.javacs.encryption;

public class EncryptedPair {
    private final byte[] encryptedString;
    private final byte[] encryptionKey;

    public EncryptedPair(byte[] encryptedString, byte[] encryptionKey) {
        this.encryptedString = encryptedString;
        this.encryptionKey = encryptionKey;
    }

    public byte[] getEncryptedString() {
        return encryptedString;
    }

    public byte[] getEncryptionKey() {
        return encryptionKey;
    }
}
