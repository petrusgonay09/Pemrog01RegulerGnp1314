//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 5
package Praktikum09e.bin;

public class Jeep extends Mobil
{
	String Nama;       //Variabel kelas
	String NoPolisi;
	int Kecepatan;
	//Constructor kelas
	public Jeep(String aNama, String aNoPolisi, int aKecepatan)
	{
		super("Jeep");
		Nama = aNama;
		NoPolisi = aNoPolisi;
		Kecepatan = aKecepatan;
	}
	//Menampilkan Informasi
	public void Display()
	{
		System.out.println("Nama Mobil		=" +this.Nama);
		System.out.println("Nomor Mobil		=" +this.NoPolisi);
		System.out.println("Kecepatan Mobil	=" +this.Kecepatan);
	}
}