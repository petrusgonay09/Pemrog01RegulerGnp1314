//Belajar	: VARIABEL & TIPE DATA==>Latihan Variabel
//Created By: Petrus Gonay(4512212042)
//Date		: Kamis,10-04-2014

package Latihan03e.sesi3.bin;

public class DemoVariabel1 {
	public static void main(String[] petrus){
		int x= 10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("Nilai w adalah" +x);
		
		//type casting
		v=(char) x;
		System.out.println("Nilai v adalah " +v);
		System.out.println("Baris Selanjutnya");
		
		coba();
		//
		System.out.println("Setelah menjalankan coba" );
	}
	static char v;
	
	public static void coba(){
		System.out.println("Nilai v adalah " +v);
		//variabel v tidak bole dihapus karena masih di pakai dan masih berada didalam scope
		short d= 15; // variabel d bole di hapus dibaris 22, karena life timenya suda habis
		System.out.println("D adalah "+d ); //variabel d bole di hapus dibaris 22
	}
}