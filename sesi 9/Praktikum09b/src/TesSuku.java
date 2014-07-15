//Belajar	: Perintah Inheritance
//Created By: Petrus Gonay(4512212042)
//Date		: Senin, 26 Mei 2014
//Contoh 3
package Praktikum09c.bin;

public class TesSuku 
{
	public static void main(String[] petrus) 
	{
		SukuInd SI = new SukuInd("Petrus Gonay", "Jayapura","Sepak Bola", "Mahasiswa");
		System.out.println("Nama		: " +SI.getNAMA());
		System.out.println("Alamat 		: "	+SI.getALAMAT());
		System.out.println("Hobby		: "	+SI.getHOBBY());
		System.out.println("Pekerjaan 	: "	+SI.getPEKERJAAN());
		System.out.println();
		System.out.println();
		
		Sunda SD = new Sunda("Jefri Dowansiba", "Manokwari","Foto dan Olah raga", "Mahasiswa");
		System.out.println("Nama 		: "+SD.getNAMA());
		System.out.println("Alamat 		: "+SD.getALAMAT());
		System.out.println("Hobby 		: "+SD.getHOBBY());
		System.out.println("Pekerjaan 	: "+SD.getPEKERJAAN());
		System.out.println();
		System.out.println();
		
		Sumba SB = new Sumba("Rio", "Timika","Menyayi", "Musisi");
		System.out.println("Nama 		: "+SB.getNAMA());
		System.out.println("Alamat 		: "+SB.getALAMAT());
		System.out.println("Hobby 		: "+SB.getHOBBY());
		System.out.println("Pekerjaan 	: "+SI.getPEKERJAAN());
		System.out.println();
		System.out.println();
		
		Batak BT = new Batak("Andreas Napitupulu", "Tangerang","Berwisata", "Pegawai Swasta");
		System.out.println("Nama 		: "+BT.getNAMA());
		System.out.println("Alamat 		: "+BT.getALAMAT());
		System.out.println("Hobby 		: "+BT.getHOBBY());
		System.out.println("Pekerjaan 	: "+BT.getPEKERJAAN());
		System.out.println();
		System.out.println();
		//bilangan bulat
		Jawa Jwa = new Jawa("Tiara Suliastuti", "Semarang","Nonton", "Sekertaris Direktur");
		System.out.println("Nama 		: "+Jwa.getNAMA());
		System.out.println("Alamat 		: "+Jwa.getALAMAT());
		System.out.println("Hobby 		: "+Jwa.getHOBBY());
		System.out.println("Pekerjaan 	: "+Jwa.getPEKERJAAN());
		System.out.println();
		System.out.println();
		//Bilangan pecahan
		Jawa Jwb = new Jawa("Budi Hartono", "Surabaya","Renang", "Atlet");
		System.out.println("Nama 		: "+Jwb.getNAMA());
		System.out.println("Alamat 		: "+Jwb.getALAMAT());
		System.out.println("Hobby 		: "+Jwb.getHOBBY());
		System.out.println("Pekerjaan 	: "+Jwb.getPEKERJAAN());
		System.out.println();
		System.out.println();
	}
}