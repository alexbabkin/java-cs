package com.github.alexbabkin.javacs.compression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CompressTest {
    @Test
    public void compressTest1() {
        CompressedGene compressedGene = new CompressedGene(null);
        assertNull(compressedGene.decompress());
    }

    @Test
    public void compressTest2() {
        CompressedGene compressedGene = new CompressedGene("");
        assertNull(compressedGene.decompress());
    }

    @Test
    public void compressTest3() {
        final String gene =
                "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATATAGGGATTAACCGTTATATATATATAGCCA";
        CompressedGene compressedGene = new CompressedGene(gene);
        assertEquals(gene, compressedGene.decompress());
    }
}
