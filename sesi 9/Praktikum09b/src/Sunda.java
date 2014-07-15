//Belajar	:Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 3
package Praktikum09c.bin;

public class Sunda extends SukuInd
{
	private double GAJI;
	public Sunda(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	public double getGaji()
	{
		return GAJI;
	}
	public void setGaji(double Gaji)
	{
		GAJI = Gaji;
	}
}