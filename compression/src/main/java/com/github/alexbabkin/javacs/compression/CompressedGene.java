package com.github.alexbabkin.javacs.compression;

import java.util.BitSet;
import java.util.Objects;

public class CompressedGene {
    private final BitSet bitSet;

    public CompressedGene(String gene) {
        this.bitSet = compress(gene);
    }

    private BitSet compress(String gene) {
        if (gene == null || Objects.equals(gene, "")) {
            return null;
        }

        final int geneLength = gene.length();

        final BitSet bitSet = new BitSet(geneLength * 2);
        final String upperGene = gene.toUpperCase();

        for (int i = 0; i < geneLength; i++) {
            final char currentGeneChar = upperGene.charAt(i);

            final int firstBitLocation = 2 * i;
            final int secondBitLocation = firstBitLocation + 1;

            switch (currentGeneChar) {
                case 'A':
                    bitSet.set(firstBitLocation, false);
                    bitSet.set(secondBitLocation, false);
                    break;
                case 'C':
                    bitSet.set(firstBitLocation, false);
                    bitSet.set(secondBitLocation, true);
                    break;
                case 'G':
                    bitSet.set(firstBitLocation, true);
                    bitSet.set(secondBitLocation, false);
                    break;
                case 'T':
                    bitSet.set(firstBitLocation, true);
                    bitSet.set(secondBitLocation, true);
                    break;
                default:
                    throw new IllegalArgumentException(
                            "The provided gene String contains characters other than ACGT");
            }
        }
        return bitSet;
    }

    public String decompress() {
        if (bitSet == null) {
            return null;
        }

        final int bitSetLength = bitSet.length();
        StringBuilder builder = new StringBuilder(bitSetLength / 2);
        for (int i = 0; i <= bitSetLength; i += 2) {
            final int firstBit = (bitSet.get(i) ? 1 : 0);
            final int secondBit = (bitSet.get(i + 1) ? 1 : 0);

            final int currentBits = firstBit << 1 | secondBit;
            switch (currentBits) {
                case 0b00:
                    builder.append("A");
                    break;
                case 0b01:
                    builder.append("C");
                    break;
                case 0b10:
                    builder.append("G");
                    break;
                case 0b11:
                    builder.append("T");
                    break;
            }
        }

        return builder.toString();
    }
}
