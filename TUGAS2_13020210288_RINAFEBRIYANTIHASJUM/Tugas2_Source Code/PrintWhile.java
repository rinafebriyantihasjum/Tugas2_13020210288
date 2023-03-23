/**Nim  :13020210288
 * Nama : Rina Febriyanti Hasjum
 * Hari, Tanggal : Kamis, 23 Maret 2023
 * Waktu: 13.45 WITA
 */
import java.util.Scanner;
public class PrintWhile {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Elmt */
        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N) /* Kondisi pengulangan */
        { 
            System.out.println (i); /* Proses */
            i++; /* Next Elmt */
        }; /* (i > N) */
    }
}