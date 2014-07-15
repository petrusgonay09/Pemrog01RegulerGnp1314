//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 5
package Praktikum09e.bin;

public class MobilApply
{
	public static void main(String[] petrus)
	{
		//Mendefinisikan objek dalam kelas
		Jeep Mobil1 = new Jeep("Jeep Tentara", "B-63-ATO", 180);
		Jeep Mobil2 = new Jeep("Jeep Gunung", "B-66-CAn", 200);
		Jeep Mobil3 = new Jeep("Jeep Pantai", "B-6663-TOC", 150);
		
		//Menampilkan informasi
		Mobil1.JenisMobil();Mobil1.Display();
		System.out.println();
		Mobil2.JenisMobil(); Mobil2.Display();
		System.out.println();
		Mobil3.JenisMobil(); Mobil3.Display();
	}
}