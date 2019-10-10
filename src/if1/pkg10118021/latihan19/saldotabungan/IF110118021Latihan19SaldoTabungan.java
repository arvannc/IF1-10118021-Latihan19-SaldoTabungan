/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Saldo Tabungan
 */
public class IF110118021Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        double bunga;
        double saldo = 2500000;
        for (int i=1; i <= 6; i++){
            bunga = (saldo * 0.15);
            saldo = (int) (saldo + bunga);
            System.out.printf("Saldo di bulan Ke-" +i + " %s%n", rupiah.format(saldo));
        }
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
