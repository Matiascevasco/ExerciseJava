import java.util.*;
public class Practica4 {

 public static void main(String[] args) {

  Scanner matias = new Scanner(System.in);

  int anio;

  System.out.println("Ingresar el anio");
  anio = matias.nextInt();

  if ((anio % 4 == 0) && (anio % 100 != 0) && (anio>1582) || (anio % 400 == 0)) {

   System.out.println("El anio es bisiesto");
  } else {
   System.out.println("El anio no es bisiesto");
  }

 }

}