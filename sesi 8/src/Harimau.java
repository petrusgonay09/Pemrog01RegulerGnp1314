//perintah Inherintance
//kelas turunannya
//created by: Petrus Gonay
//Date		: Kamis, 22 Mey 2014
package Praktikum09a.bin;

public class Harimau extends KucingBesar{
	//contruktor untuk class Harimau
	public Harimau(String namaHarimau){
	//Mengisi pengubah yang diwarisi oleh kelas abstract
		Harimau.nama = namaHarimau;
	}
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	public void Makan(){
		System.out.println("Harimau Makan daging dan minum susu");
		System.out.println();
	}
}