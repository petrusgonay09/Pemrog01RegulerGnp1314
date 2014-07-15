//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 3
package Praktikum09c.bin;

public class Jawa extends SukuInd
{
	private double GAJI;
	public Jawa(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	public double getGAJI()
	{
		return GAJI;
	}
	public void setGAJI(double Gaji)
	{
		GAJI = Gaji;
	}
	//Metode Overloading-Metode yang apabila
	public String THR(double persen)
	{
		if(persen> 500000)
			return "Gaji ke 13 Terlalu Besar !!!";
		else
			return "Gaji ke 13 sebesar "+persen*GAJI;
	}
	//Metode yang apa bila parameternya berupa
	public String THR(long persen)
	{
		if(persen > 500000)
			return "Gaji ke 13 Terlalu Besar !!!!";
		else
			return "Gaji ke 13 sebesar "+(persen*GAJI/100);
	}
}