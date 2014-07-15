//Belajar	:Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 2
package Praktikum09b.bin;

public class TesKucing
{
	private static int Jumlah;
	public static void main(String[] petrus)
	{
		Jumlah = 1;
		
		//Kucing Makan
		KucingMakan KM = new KucingMakan();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		KM.setNama(KucingMakan.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		KM.setUmur(KucingMakan.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		KM.setMakanan(KucingMakan.inputDataString());
		Jumlah++;
		//JmlAnakKucing
		JmlAnakKucing JAK = new JmlAnakKucing();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		JAK.setNama(KucingMakan.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		JAK.setUmur(KucingMakan.inputDataInteger());
		System.out.print("Masukkan Berat Kucing Kesayangan Anda		[" +Jumlah +"] : ");
		JAK.setBerat(KucingMakan.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda	[" +Jumlah +"] : ");
		JAK.setMakanan(KucingMakan.inputDataString());
		System.out.println("Masukkan Jumlah Anak Kucing Anda		[" +Jumlah +"] : ");
		JAK.setUmur(KucingMakan.inputDataInteger());
		//Menampilkan Data Kucing
		System.out.println("\n\n DATA KUCING 	");
		KM.Tulis();
		System.out.println("Makanan Kucing Anda : " +KM.getMakanan());
		JAK.Tulis();
		System.out.println("Makanan Kucing Anda : " +JAK.getMakanan());
		System.out.println("Jumlah Anak Kucing  : " +JAK.getJumlahAnak());
		
		
	}
}