//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 6
package Praktikum09f.bin;

public class KuliahApply
{
	public static void main(String[] petrus)
	{
		Dosen DOS = new Dosen("Riza M Iqbal", 50, "Bogor", "Menika", "006", "04", "Lektor Kepala",
		1500000);
		Mahasiswa MH = new Mahasiswa("Petrus Gonay", 25, "Depok", "Mahasiswa", "451010", "2010", 2);
		
		System.out.println(DOS.Display());
		System.out.println(MH.Display());
	}
}