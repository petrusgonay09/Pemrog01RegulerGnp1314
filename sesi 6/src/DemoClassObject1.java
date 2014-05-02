//Belajar	: CLASS dan OBJECT -DemoClassObject1.java
//Created By	: Petrus Gonay (4512212042)
//Date		: Kamis 24 April 2014

//Contoh 1
package Praktikum06a.bin;

public class DemoClassObject1
{
	public static void main(String[] petrus)
	{
		Mahasiswa.jumlah = 0;
		//Mahasiswa.nim = "999"; //error, instance variabel harus ada objectnya dulu
		System.out.println("Jumlah Mahasiswa : " +Mahasiswa.jumlah);
	
		Mahasiswa m1 = new Mahasiswa();
		m1.nim = "45122";
		m1.nama = "Petrus";
		m1.jumlah = 1;
	
		Mahasiswa m2 = new Mahasiswa();
		m2.nim = "12042";
		m2.nama = "Gonay";
		m2.jumlah = 2;
	
		tampilkanMahasiswa(m1);
		tampilkanMahasiswa(m2);
		System.out.println("Jumlah Mahasiswa : " +Mahasiswa.jumlah);
	}
	public static void tampilkanMahasiswa(Mahasiswa m)
	{
		System.out.println("Nim  : " +m.nim);
		System.out.println("Nama : " +m.nama);
		System.out.println("Jumlah : " +m.jumlah);
		System.out.println("");
		System.out.println("");
	}
}
