package org.d3ifcool.assessment01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestSoal02 {


    @Test
    public void testJurnal() {
        PrintStream originalOut = System.out;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
		
		Soal02.main(null);
		String[] var = bos.toString().split(" ");

        for (int i = 0; i < 3; i++) {
            int bil = Integer.parseInt(var[i]); 
			bil = bil%4;
            assertEquals(0,bil);
        }

        System.setOut(originalOut);
  
    }
}
