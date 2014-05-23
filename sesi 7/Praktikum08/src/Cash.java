//Perintah Object Oriented Programing(OOP)
//Created By	: Petrus Gonay
//Date			: Senin, 19 Mey 2014

package Praktikum08a.bin;
import java.math.BigDecimal;

public class Cash extends Pembayaran {
	private BigDecimal dibayar;
	private Transaksi transaksi;
	
	public BigDecimal getDibayar() {
		return dibayar;
	}
	public void setDibayar(BigDecimal x){
		dibayar = x;
		
	}
	public BigDecimal hitungKembalian(){
		return transaksi.hitungTagihan().subtract(dibayar);
	}
}