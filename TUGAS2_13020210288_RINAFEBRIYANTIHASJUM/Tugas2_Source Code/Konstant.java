/**Nim  :13020210288
 * Nama : Rina Febriyanti Hasjum
 * Hari, Tanggal : Kamis, 23 Maret 2023
 * Waktu: 13.10 WITA
 */
import java.util.Scanner;
public class Konstant {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan=new Scanner(System.in);
        /* program */ /* baca data */
        System.out.print ("Jari-jari lingkaran =");
        r = masukan.nextFloat();
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");
    }
}