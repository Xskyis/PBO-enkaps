package latpbo;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class persegipanjang {
     public int panjang ;
     public int lebar ;
     public int sisi ;
     private int hasilluas;
     private int hasilkeliling;
     Scanner inputuser = new Scanner(System.in);
     
    public void luasnya(){
        System.out.print("Masukan Panjang = ");
        panjang = inputuser.nextInt();
        System.out.print("Masukan Lebar = ");
        lebar = inputuser.nextInt();

     int luas = panjang * lebar;
       hasilluas = luas;
     

    }
    public void kelilingnya(){

        int keliling = 2*(panjang+lebar);
            hasilkeliling = keliling;
    }

    protected void jumlahsisi(){
        System.out.println("Jumlah sisi Ada = "+sisi);
    }
    public void tampil(){
        System.out.print("Hasil Dari luas = "+hasilluas);
        System.out.println();
        System.out.print("Hasil Dari Keliling = "+hasilkeliling);
    }
}
