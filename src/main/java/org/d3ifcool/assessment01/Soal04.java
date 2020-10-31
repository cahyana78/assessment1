package org.d3ifcool.assessment01;

import java.util.Scanner;
public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner adam = new Scanner(System.in);

		int penumpang, keluaran, noKendaraan, kendaraan1, kendaraan2, kendaraan3;
		boolean nilai;

		penumpang = adam.nextInt();
		penumpang += 8;
		keluaran = 0;
		nilai = true;
		noKendaraan = 0;
		kendaraan1 = 0;
		kendaraan2 = 0;
		kendaraan3 = 0;

		while (nilai) {
		    noKendaraan = noKendaraan + 1;
		    penumpang = penumpang - 8;
		    if (penumpang < 8) {
			keluaran = penumpang % 8;
		    } else {
			keluaran = 8;
		    }
		    System.out.println("K" + noKendaraan + " berangkat dengan " + keluaran + " penumpang ");
		    switch (noKendaraan) {
			case 1:
			    kendaraan1++;
			    break;
			case 2:
			    kendaraan2++;
			    break;
			case 3:
			    kendaraan3++;
			    break;
		    }
		    if (noKendaraan == 3) {
			noKendaraan = 0;
		    }
		    if (penumpang <= 8) {
			nilai = false;
		    }
		}

		System.out.println("\nTrip K1 adalah " + kendaraan1);
		System.out.println("Trip K2 adalah " + kendaraan2);
		System.out.println("Trip K3 adalah " + kendaraan3);

		System.out.println("\nTotal Trip adalah " + (kendaraan1 + kendaraan2 + kendaraan3));
	}
}
