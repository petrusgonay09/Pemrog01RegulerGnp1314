package Praktikum11a.bin;

 class TV01 implements Kontrol
{
	String[] LineTV = {"NETTV", "KOMPAS Tv", "MetroTV", "Dai TV", "TVOne"};
	//I
	public void PindahLine(int Line)
	{
		System.out.println("Memindahkan Line pada TVo1 ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol)
	{
		System.out.println("Memperbesar suara TVo1 : " + Vol);
	}
	public void VolKecil(int Vol)
	{
		System.out.println("Memperkecil suara TVo1 : " + Vol);
	}
}