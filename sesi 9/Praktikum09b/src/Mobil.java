//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 5
package Praktikum09e.bin;

public class Mobil
{
	private String Jenis; //Merupakan variabel superkelas
	
	//contructor superkelas
	public Mobil(String aTipe)
	{
		Jenis = new String(aTipe);
	}
	public String JenisMobil()
	{
		return "Merupakan Jenis Mobil = " +Jenis;
	}
}