package org.d3ifcool.assessment01;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int urutan, hasil, kelipatan;
		urutan = 1;

		do{
		    kelipatan = (int)(4 + (Math.random() * 121)) + 1;
		    hasil = kelipatan % 4;
		    if (hasil == 0){
			System.out.printf("%d ", kelipatan);
			urutan += 1;
		    }
		}while (urutan <= 3);
	}
}
