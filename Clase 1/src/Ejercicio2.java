import java.util.Scanner;

public class Ejercicio2 {

    public static void MostrarMultiplos(int m,int n){
        int i = 0;
        while (i < n)
        {
            System.out.println(m*(i+1));
            i++;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese que numero desea: ");
        int m = scanner.nextInt();

        System.out.println("Ingrese cuantos multiplos desea ver: ");
        int n = scanner.nextInt();


        MostrarMultiplos(m,n);

    }
}
