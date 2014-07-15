//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 4
package Praktikum09d.bin;

public class PajakApply
{
	public static void main(String[] petrus)
	{
		Pajak PJK = new Pajak();//Membuat Obyek
		PJK.Pendapatan = 8000000; //Memberikan nilai
		PJK.Propinsi = "PAPUA";
		PJK.Kota = "Sentani-Jayapra";
		double PajakAnda = PJK.HitungPajak();//Menghitung pajak
	
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp =PJK01.HitungPjkProp(PajakAnda);//Masih error...!!
	
		//Menampilkan data Pajak
		System.out.println("Besar Pajak Anda Sebesar Rp. " +PajakAnda);
		System.out.println("Anda Berada di propinsi " +PJK.Propinsi);
		System.out.println("Anda di Kota " +PJK.Kota);
		System.out.println("Potongan Pajak Anda Sebesar Rp. " +PajakAndaProp);
	}
}