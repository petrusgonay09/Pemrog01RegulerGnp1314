//Belajar	: CONTROL FLOW/Struktur Kontrol
//Created By: Petrus Gonay(4512212042)
//Date		: Kamis,17-04-2014

//Perintah Ketiga - Contoh 03

package Latihan03.sesi5.bin;
import java.util.Random;

public class DemoLooping2{
	static boolean selesai = false;
	public static void main(String[] petrus){
		Integer faktor =7;
		System.out.println("Mencari kelipatan " +faktor + " dengan WHILE");
		while(!selesai)
		{
			carikelipatan(faktor);
		}
		System.out.println("Selesai Mencari Kelipatan Dengan WHILE");
		System.out.println();
		System.out.println();
		System.out.println("Mencari Kelipatan " +faktor + " Dengan FOR");
		for (selesai=false; !selesai;){
			carikelipatan(faktor);
		}
		System.out.println("Selesai Mencari Kelipatan Dengan FOR");
	}
	public static void carikelipatan(Integer faktor){
		Integer random = new Random().nextInt();
		System.out.println("Bilangan Random : " +random);
		
		if (random % faktor == 0)
		{
			System.out.println("kelipatan" +faktor + " ditemukan, yaitu :" +random);
			selesai = true;
		}
	}

}