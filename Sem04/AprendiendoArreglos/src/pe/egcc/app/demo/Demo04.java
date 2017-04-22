package pe.egcc.app.demo;

public class Demo04 {

  
  public static void main(String[] args) {
    System.out.println("6+9+12: " + sumar(6,9,12));
    System.out.println("16+19+12+15: " + sumar(16,19,12,15));
  }
  
  private static int sumar(int ... datos){
    int suma = 0;
    for (int i = 0; i < datos.length; i++) {
      suma += datos[i];
    }
    return suma;
  }
  
}
