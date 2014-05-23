//perintah Inherintance
//kelas turunannya
//created by: Petrus Gonay
//Date		: Kamis, 22 Mey 2014
package Praktikum09a.bin;

public class TesKucingBesar{
	public static void main(String [] petrus){
		Singa mySinga = new Singa("SIMBABA SURAI");
		System.out.println("Singa merupakan " +Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("HARIMAU SUMATERA");
		System.out.println("Harimau merupakan " +Harimau.nama);
		myHarimau.Makan();
	}
}