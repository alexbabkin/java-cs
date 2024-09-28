package com.github.alexbabkin.javacs.compression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CompressTest {
    @Test
    public void compressTest_NullInput() {
        CompressedGene compressedGene = new CompressedGene(null);
        assertNull(compressedGene.decompress());
    }

    @Test
    public void compressTest_EmptyStringInput() {
        CompressedGene compressedGene = new CompressedGene("");
        assertNull(compressedGene.decompress());
    }

    @Test
    public void compressTest_CompressionDecompression() {
        final String gene =
                "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATATAGGGATTAACCGTTATATATATATAGCCA";
        CompressedGene compressedGene = new CompressedGene(gene);
        assertEquals(gene, compressedGene.decompress());
    }
}
