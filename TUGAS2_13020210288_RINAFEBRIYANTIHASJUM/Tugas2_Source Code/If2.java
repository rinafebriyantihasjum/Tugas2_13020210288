/**Nim  :13020210288
 * Nama : Rina Febriyanti Hasjum
 * Hari, Tanggal : Kamis, 23 Maret 2023
 * Waktu: 12.50 WITA
 */
import java.util.Scanner;
public class If2 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stubu
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a >= 0){
        System.out.println ("Nilai a positif "+ a);
        }else /* a< 0 */
            {
                System.out.println ("Nilai a negatif "+ a);
            }
    }
}