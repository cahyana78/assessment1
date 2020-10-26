package org.d3ifcool.assessment01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestSoal01 {

    private static final String[] INPUT = {
            "1 + 3",
            "5.341 - 2.11",
			"4.756 * 4",
			"9 / 3",
			"2.25 ^ 3"
    };
    private static final String[] OUTPUT = {
            "4.000",
            "3.231",
			"19.024",
			"3.000",
			"11.391"
			
    };

    @Test
    public void testJurnal() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            Soal01.main(null);

            assertEquals(OUTPUT[i], bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
