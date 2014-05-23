//Perintah Object Oriented Programing(OOP)
//Created By	: Petrus Gonay
//Date			: Senin, 19 Mey 2014

package Praktikum08a.bin;
import java.math.BigDecimal;

public class TransaksiDetail {
	private Barang barang;
	private Integer jumlah;
	
	public BigDecimal subtotal(){
		return barang.getHarga().multiply(new BigDecimal(jumlah));
	}
}