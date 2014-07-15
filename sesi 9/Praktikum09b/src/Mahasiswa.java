//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 6
package Praktikum09f.bin;

class Mahasiswa extends Orang
{
	//atribut untuk Mahasiswa
	private String NIM = "";
	private float IPK;
	
	//metode constructor
	public Mahasiswa(String NM, int UMR, String ALMT, String STS, String NT, String NI, float IP)
	{
		super(NM, UMR, ALMT, STS, NI);
		NIM = NI;
		IPK = IP;
	}
	//Modifier
	public void setNIM(String NI)
	{
		this.NIM = NI;
	}
	public void setIPK(float IP)
	{
		this.IPK = IP;
	}
	
	//Accessor
	public String getNIM()
	{
		return NIM;
	}
	public float getIPK()
	{
		return IPK;
	}
	public String Display()
	{
		return super.Display() +"NIM " +NIM+"- IPK " +IPK;
	}
}