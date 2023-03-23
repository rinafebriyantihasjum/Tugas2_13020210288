/**Nim  :13020210288
 * Nama : Rina Febriyanti Hasjum
 * Hari, Tanggal : Kamis, 23 Maret 2023
 * Waktu: 12.40 WITA
 */
import java.util.Scanner;
public class If1 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */
        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    }
}
