package com.github.alexbabkin.javacs.encryption;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EncryptionTest {

    @Test
    public void encryptionTest_NullInput() {
        EncryptedPair encrypted = Encryption.encrypt(null);
        assertNull(encrypted);
    }

    @Test
    public void encryptionTest_EmptyStringInput() {
        EncryptedPair encrypted = Encryption.encrypt("");
        assertNull(encrypted.getEncryptedString());
    }

    @Test
    public void encryptionTest_EncryptionDecryption() {
        String original = "Hello world";
        EncryptedPair encrypted = Encryption.encrypt(original);
        String decrypted = Encryption.decrypt(encrypted);
        assertEquals(original, decrypted);
    }
}
