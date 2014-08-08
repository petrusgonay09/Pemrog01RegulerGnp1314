package Praktikum11a.bin;

class User
{
	public static void main(String[] petrus)
	{
		TV02 tv02 = new TV02();
		TV01 tv01 = new TV01();
		Remote RM = new Remote();
		
		//Mengirimkan Perintah ke JackTv
		RM.PerintahTV(Remote.PINDAHLINE, tv01, 2);
		RM.PerintahTV(Remote.VOLBESAR, tv01, 8);
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE, tv02, 0);
		RM.PerintahTV(Remote.VOLKECIL, tv02, 2);
	}
}