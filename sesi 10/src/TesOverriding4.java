package praktikum10d.bin;

public class TesOverriding4
{
	//Membuat objek kelas komunitasPT dan memanggil fungsi turunan dan fungsi lokal
	public static void main(String[] petrus)
	{
		KomunitasPT2 DtJRS = new KomunitasPT2("Teknik Informatika", "Jakarta Selatan", "LK");
		Karyawan2 KA = new Karyawan2("Petrus Gonay", "Depok", "Laki-laki", 167, 500);
		System.out.println();
		DtJRS.Tampilkan3();
		System.out.println();
		KA.Tampilkan3();
	}
}