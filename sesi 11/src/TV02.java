package Praktikum11a.bin;

 class TV02 implements Kontrol
{
	String[] LineTV = {"RCTI", "SCTV", "ANTV", "MNCTV", "GLOBAL TV"};
	//I
	public void PindahLine(int Line)
	{
		System.out.println("Memindahkan Line pada TVo2 ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol)
	{
		System.out.println("Memperbesar suara TVo2 : " + Vol);
	}
	public void VolKecil(int Vol)
	{
		System.out.println("Memperkecil suara TVo2 : " + Vol);
	}
}