//Belajar	: VARIABEL & TIPE DATA==>Latihan Variabel
//Created By: Petrus Gonay(4512212042)
//Date		: Kamis,10-04-2014

package Latihan03d.sesi3.bin;

public class DemoVariabel {
	public static void main(String[] petrus){
		int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		//tidak bisa compile (error)
		char w=x;
		System.out.println("Nilai w adalah" +x);
		
		//type casting
		char v=(char) x;
		System.out.println("Nilai V adalah " +v);
		System.out.println("Baris Selanjutnya" );
	}
	public static void coba(){
		System.out.println("Nilai v adalah" +v);
	}
}