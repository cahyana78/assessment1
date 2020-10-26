package org.d3ifcool.assessment01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSoal04 {

    private static final String[] INPUT = {
            "51",
			"22",
			"16",
			"10",
			"6"
    };
    private static final String[] OUTPUT = {
            "K1 berangkat dengan 8 penumpang\nK2 berangkat dengan 8 penumpang\nK3 berangkat dengan 8 penumpang\nK1 berangkat dengan 8 penumpang\nK2 berangkat dengan 8 penumpang\nK3 berangkat dengan 8 penumpang\nK1 berangkat dengan 3 penumpang\nTrip K1 adalah 3\nTrip K2 adalah 2\nTrip K3 adalah 2\n\nTotal trip adalah 7\n",
			"K1 berangkat dengan 8 penumpang\nK2 berangkat dengan 8 penumpang\nK3 berangkat dengan 6 penumpang\n\nTrip K1 adalah 1\nTrip K2 adalah 1\nTrip K3 adalah 1\n\nTotal trip adalah 3\n",
			"K1 berangkat dengan 8 penumpang\nK2 berangkat dengan 8 penumpang\n\nTrip K1 adalah 1\nTrip K2 adalah 1\nTrip K3 adalah 0\n\nTotal trip adalah 2\n",
			"K1 berangkat dengan 8 penumpang\nK2 berangkat dengan 2 penumpang\n\nTrip K1 adalah 1\nTrip K2 adalah 1\nTrip K3 adalah 0\n\nTotal trip adalah 2\n",
			"K1 berangkat dengan 6 penumpang\n\nTrip K1 adalah 1\nTrip K2 adalah 0\nTrip K3 adalah 0\n\nTotal trip adalah 1\n"
    };

    @Test
    public void testTP() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            Soal04.main(null);

            assertEquals(OUTPUT[i] + "\n", bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
