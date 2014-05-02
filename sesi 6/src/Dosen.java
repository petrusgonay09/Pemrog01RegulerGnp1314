//Belajar: CLASS dan OBJECT -Dosen.java
//Created By: Petrus Gonay (4521212042)
//Date:Kamis 24 April 2014

//Contoh 2
package Praktikum06b.bin;

public class Dosen
{
	String nama;
	String email;
	//Begitu kita mendefinisikan constructor, 
	//Java tidak akan membuat default constructor
	public Dosen (String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	//tidak otomatis dibuatkan oleh java
	//bilah dibutukan kita harus buat sendiri
	public Dosen() {}
	
	//Method
	public void info()
	{
		System.out.println("Nama Dosen  : " +nama);
		System.out.println("Email Dosen : " +email);
		System.out.println();
		System.out.println();
	}
}