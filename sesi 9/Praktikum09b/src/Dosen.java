//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 6
package Praktikum09f.bin;

 class Dosen extends Orang
{
	//atribut untuk dosen
	private String NIDN = "";
	private String JJA = "";
	private float Honor;
	
//metode constructor
public Dosen(String NM, int UMR, String ALMT, String STS, String NT, String ND, String JA, float HN)
{
	super(NM, UMR, ALMT, STS, NT);
	NIDN = ND;
	JJA = JA;
	Honor = HN;
}
//Modifier
public void setNID(String ND)
{
	this.NIDN = ND;
}
public void setJJA(String JA)
{
	this.JJA = JA;
}
public void setHonor(float HN)
{
	this.Honor = HN;
}
//Accessor
public String getNIDN()
{
	return NIDN;
}
public String getJJA()
{
	return JJA;
}
public float getHonor()
{
	return Honor;
}
public String Display()
{
	return super.Display() +"NIDN " +NIDN+"-JJA " +JJA+ "- Gaji " +Honor;
}
}