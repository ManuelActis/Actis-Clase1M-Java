import java.util.Scanner;

public class Ejercicio4 {

    public static boolean esPrimo(int x){
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


        //Declaro scanner
        Scanner scanner = new Scanner(System.in);

        //escaneo enteros
        System.out.println("Cuantos nros primos desea: ");
        int n = scanner.nextInt();
        int i = 0;

        System.out.println("Los primeros números primos son: ");
        while (n != 0){
            if (esPrimo(i)){
                System.out.print(i+", ");
                n--;
            }
            i++;
        }
        //Se cierra scanner para liberar espacio
        scanner.close();
    }


}
