package org.d3ifcool.assessment01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestSoal03 {

    private static final String[] INPUT = {
        "123\n456\n789",
	    "200\n501\n996"
    };
    private static final String[] OUTPUT = {
        "15","8"
    };

    @Test
    public void testJurnal() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            Soal03.main(null);

            assertEquals(OUTPUT[i] + "\n", bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
