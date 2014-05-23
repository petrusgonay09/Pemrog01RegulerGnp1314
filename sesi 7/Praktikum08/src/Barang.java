//Perintah Object Oriented Programing(OOP)
//Created By	: Petrus Gonay
//Date			: Senin, 19 Mey 2014

package Praktikum08a.bin;
import java.math.BigDecimal;

public class Barang {
	private String kode;
	private String nama;
	private BigDecimal harga;
	
	public String getkode(){
		return kode;
	}
	public void setKode(String x){
		kode = x;
	}
	public String getnama(){
		return nama;
	}
	public void setNama(String x){
		nama = x;
	}
	public BigDecimal getHarga(){
		return harga;
	}
	public void setHarga(BigDecimal x){
		harga = x;
	}
}