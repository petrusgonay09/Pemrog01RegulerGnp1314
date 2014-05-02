//Belajar	: METHOD dan EXCEPTION -Angka03.java
//Created By: Petrus Gonay
//Date		:Kamis, 24 April 2014

// Contoh 4b
package Praktikum07b.bin;

public class Angka03
{
	public static void main(String[] petrus)
	{
			double Penyebut = 9;
			double Pembilang = 0;
			try
			{
				System.out.println("Hasil pembagiannya adalah " + Penyebut/Pembilang);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Pembagian dengan angka 0...");
			}
			System.out.println("Selesai");
	}

}