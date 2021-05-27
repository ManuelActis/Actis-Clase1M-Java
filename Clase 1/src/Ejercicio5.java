import java.util.Scanner;

public class Ejercicio5 {


    public static boolean digitos (int iNum, int iCantDig, int iDig){
        int count = 0;
        char c = (char) (iDig+'0');
        String numero = Integer.toString(iNum);
        for (int i = 0; i <numero.length(); i++) {
            if (numero.charAt(i) == c) {
                count++;
            }
        }
        return count == iCantDig;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de nros ");
        int iCantNum = scanner.nextInt();



        System.out.println("Ingrese la cant de veces que se repite el digito: ");
        int iCantDig = scanner.nextInt();


        System.out.println("Ingrese el digito que se va a repetir: ");
        int iDigito = scanner.nextInt();


        int i= 0;

        while (iCantNum != 0){
            if (digitos(i,iCantDig,iDigito)) {
                System.out.print(i+", ");
                iCantNum--;
            }
            i++;
        }


        scanner.close();


    }

}
