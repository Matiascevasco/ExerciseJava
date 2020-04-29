import java.util.Scanner;

public class Practica2 {

 public static void main(String[] args) {

  @SuppressWarnings("resource")
  Scanner matias = new Scanner(System.in);

  int a, b, c, numeros;

  System.out.println("Ingrese el valor de a ");
  a = matias.nextInt();
  System.out.println("Ingrese el valor de b ");
  b = matias.nextInt();
  System.out.println("Ingrese el valor de c");
  c = matias.nextInt();

  if (a % 2 == 0 ) {
   System.out.println("a es par ");
  } else {
   System.out.println("a no es par ");
   }
   if (b % 2 == 0) {
    System.out.println("b es par ");
   } else {
    System.out.println("b no es par");
   }
   if (c % 2 == 0) {
    System.out.println("c es par ");
   } else {
    System.out.println("c no es par ");
   }
 }
}
