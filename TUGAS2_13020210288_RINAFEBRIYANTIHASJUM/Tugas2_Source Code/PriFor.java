/**Nim  :13020210288
 * Nama : Rina Febriyanti Hasjum
 * Hari, Tanggal : Kamis, 23 Maret 2023
 * Waktu: 13.30 WITA
 */
import java.util.Scanner;
public class PriFor {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int i,N;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */
        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");
        N=masukan.nextInt();
        for (i = 1; i <= N; i++){
            System.out.println (i); };
        System.out.println ("Akhir program \n");
    }
}