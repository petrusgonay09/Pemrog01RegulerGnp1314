//Belajar	: CONTROL FLOW/Struktur Kontrol
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,17-04-2014

//Perintah Kedua - Contoh 02

package Latihan02.sesi5.bin;

public class DemoLooping{
	public static void main(String [] petrus){
		String[][] daftarNilai = new String[][]{
			new String[] {"001", "A"},
			new String[] {"002", "B"},
			new String[] {"003", "A"},
		};
		System.out.println("Looping menggunakan FOR");
		
		for (int i=0; i<daftarNilai.length;i++)
		{
			System.out.println("NPM   :" +daftarNilai[i][0]);
			System.out.println("Nilai :" +daftarNilai[i][1]);
		}
		System.out.println("Selesai Loping FOR");
		System.out.println();
		System.out.println();
		System.out.println("Looping Menggunakan WHILE");
		int ix = 0;
		while (ix < daftarNilai.length){
			System.out.println("NPM   :" +daftarNilai[ix][0]);
			System.out.println("Nilai :" +daftarNilai[ix][1]);
			ix++;
		}
		System.out.println("Selesai Looping WHILE");
	}
}