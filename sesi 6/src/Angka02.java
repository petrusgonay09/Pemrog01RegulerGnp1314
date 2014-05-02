//Belajar	: METHOD dan EXCEPTION -Angka02 
//Created By: Petrus Gonay (4512212042)
//Date		: Kamis, 24 April 2014

//Contoh 4a
package Praktikum07a.bin;

public class Angka02
{
	public static void main(String[] petrus)
	{
			double Penyebut = 9;
			double pembilang = 2;
			try
			{
				System.out.println("Hasil pembagiannya adalah " + Penyebut/pembilang);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Pembagian dengan angka 0...");
			}
			System.out.println("Selesai");
	}

}