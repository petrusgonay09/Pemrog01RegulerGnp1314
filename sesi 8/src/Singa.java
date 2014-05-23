//perintah Inherintance
//kelas turunannya
//created by: Petrus Gonay
//Date		: Kamis, 22 Mey 2014
package Praktikum09a.bin;

public class Singa extends KucingBesar{
	//contruktor untuk class Singa
	public Singa(String namaSinga){
		//Mengisi pengubah yang diwarisi oleh kelas abstract
		Singa.nama = namaSinga;
	}
	//implementasi metode yang diwarisi dari kelas abstract
	public void Makan(){
		System.out.println("Singa Makan daging");
		System.out.println();
	}
}