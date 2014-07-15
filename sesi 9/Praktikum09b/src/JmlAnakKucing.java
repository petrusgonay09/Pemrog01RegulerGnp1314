//Belajar	:Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 2
package Praktikum09b.bin;

public class JmlAnakKucing extends Kucing
{
	private String MAKANAN;
	private int JumlahAnak;
	public String getMakanan()
	{
		return MAKANAN;
	}
	public void setMakanan(String Makanan)
	{
		MAKANAN = Makanan;
	}
	public int getJumlahAnak()
	{
		return JumlahAnak;
	}
	public void setJumlahAnak(int JumlahAnak)
	{
		this.JumlahAnak = JumlahAnak;
	}
}