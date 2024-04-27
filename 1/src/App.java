import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception  {
        Scanner ab = new Scanner(System.in);
      //Abdias Natanael Lopez Rocha Carnet: 20241354-U
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Que onda chatel, Ingresa tres numeros");

        try {
            System.out.println("Ingrese el primer número:");
            num1 = ab.nextInt();

            System.out.println("Ingrese el segundo número:");
            num2 = ab.nextInt();

            System.out.println("Ingrese el tercer número:");
            num3 = ab.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor entero válido.");
            return;
        }

        op(num1, num2, num3);
    }

    public static void op(int num1, int num2, int num3) {
        int suma = Math.min(Math.min(num1, num2), num3) + Math.min(Math.max(num1, num2), num3);
        int diferencia = Math.max(Math.max(num1, num2), num3) - Math.max(Math.min(num1, num2), num3);
        int mayor = Math.max(Math.max(num1, num2), num3);

        System.out.println("La suma de los dos números más pequeños es: " + suma);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferencia);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("Ey maquina gracias por usar este programa");
    }
}

