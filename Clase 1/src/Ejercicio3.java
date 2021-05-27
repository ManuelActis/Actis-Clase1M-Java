import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPrimo(int n)
    {
        int i = 2;
        boolean bPrimo = true;
        while (i<n)
        {
           if(n%i==0)
           {

               bPrimo = false;
           }

           i++;
        }
        return bPrimo;
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese que numero desea evaluar: ");
        int n = scanner.nextInt();

        System.out.println(esPrimo(n));

    }
}
