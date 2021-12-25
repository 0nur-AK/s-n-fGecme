import java.util.Scanner;

public class sınıfgeçme {
    public static void main(String[] args) {
        int mat,fiz,turkce,kim,muz;
        int dersSayisi=5;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kim = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muz = inp.nextInt();
        if((mat > 100) || mat < 0){
            mat=0;
            dersSayisi--;
        }
        if((fiz<0)||fiz>100){
            fiz=0;
            dersSayisi--;
        }
        if ((turkce<0)||turkce>100){
            turkce=0;
            dersSayisi--;
        }
        if ((kim<0)||kim>100){
            kim=0;
            dersSayisi--;
        }
        if ((muz<0)||muz>100){
            muz=0;
            dersSayisi--;
        }


        double avarage = (mat+fiz+turkce+kim+muz)/dersSayisi;
        if(avarage<=55){
            System.out.println("Sınıfta Kaldınız");

        }else{
            System.out.println("Tebrikler Geçtiniz");

        }
        System.out.print("Ortalamanız : " + avarage );
    }
}
