import java.util.Scanner;

/*
Desarrollar un programa para mostrar los primeros n números pares
siendo n un valor que el usuario ingresará por consola.
Recordá que un número es par cuando es divisible por 2.
*/

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de numeros pares a mostrar: ");
        int cantNumeros = scanner.nextInt();
        int cantMostrada = 0;
        int nroActual = 0;
        while ( cantNumeros != cantMostrada)
        {
            if(nroActual%2 == 0)
            {
                System.out.println(nroActual);
                cantMostrada = cantMostrada + 1;
                //Sería mas optimo multiplicar por 2 la cantidad de numeros que necesito
            }

            nroActual = nroActual + 1;
        }



    }
}