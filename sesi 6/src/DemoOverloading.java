//Belajar	: CLASS dan OBJECT -DemoOverloading.java
//Created By: Petrus Gonay (4512212042)
//Date		: Kamis 24 April 2014

//Contoh 2
package Praktikum06b.bin;

public class DemoOverloading
{
	public static void main(String[] petrus)
	{
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "Riza Muhamat Nurman";
		d.email="rizanurman@gmail.com";
		d.info();
	}
}