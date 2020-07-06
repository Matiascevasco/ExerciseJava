import java.util.*;
public class Practica3 {

 public static void main(String[] args) {

  Scanner matias = new Scanner(System.in);

  int a, b, c;

  System.out.println("Ingrese el valor de a ");
  a = matias.nextInt();
  System.out.println("Ingrese el valor de b ");
  b = matias.nextInt();
  System.out.println("Ingrese el valor de c");
  c = matias.nextInt();
  
  if (a > b && a > c) {
   System.out.println("a es el mayor estricto");
  }
  if (b > a && b > c) {
   System.out.println("b es el mayor estricto");
  }
  if (c > a && c > b) {
   System.out.println("c es el mayor estricto");
  } else {
   System.out.println("son todos el mismo número");
  }

 }

}