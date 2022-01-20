import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double r, pi = 3.14, alan, cevre, alfa;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap : ");
        r = inp.nextDouble();

        System.out.print("Merkez açısının ölçüsü : ");
        alfa = inp.nextDouble();

        if (alfa<360) {
            alan = ((pi*r*r)*(alfa/360));
            cevre = ((2*pi*r)*(alfa/360));

        }
        else if(alfa==360){
            alan = (pi*r*r);
            cevre = (2*pi*r);

        }
        else {
            alfa %= 360;
            alan = ((pi*r*r)*(alfa/360));
            cevre = ((2*pi*r)*(alfa/360));
        }
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);


    }
}
