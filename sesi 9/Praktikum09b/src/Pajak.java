//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 4
package Praktikum09d.bin;

public class Pajak
{
	long Pendapatan;
	String Propinsi;
	String Kota;
	public double HitungPajak()
	{
		double PajakUmum=0;
		if(Pendapatan <500000001)
		{
			PajakUmum = Pendapatan * 0.025;
		}
		else
		{
			PajakUmum = Pendapatan * 0.25;
		}
		return PajakUmum;
	}
}