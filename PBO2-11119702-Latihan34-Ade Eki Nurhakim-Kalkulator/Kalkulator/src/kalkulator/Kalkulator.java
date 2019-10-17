/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double bil1, bil2;
        double tambah, kurang, kali, bagi;
            System.out.print("Masukkan angka ke-1 : ");
            bil1 = scan.nextDouble();
            System.out.print("Masukkan angka ke-2 : ");
            bil2 = scan.nextDouble();
            
            tambah = bil1+bil2;
            kurang = bil1-bil2;
            kali = bil1*bil2;
            bagi = bil1/bil2;
            System.out.println("");
            System.out.println("Hasil Penjumlahan/t : "+ tambah);
            System.out.println("Hasil Pengurangan/t : "+ kurang);
            System.out.println("Hasil Perkalian/t : "+ kali);
            System.out.println("Hasil Pembagian/t : "+ bagi);
    }
    
}
