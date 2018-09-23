/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan2.deklarasivariable;

/*
 * 
 * @author
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3 / PBO3
 * NIM      : 10117113
 * Deskripsi Program : Program untuk deklarasi dan pengaksesan variabel
 */
public class PBO310117113Latihan2DeklarasiVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklrasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variable PHI = " + PHI);
        System.out.println("Isi variabel Logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}
