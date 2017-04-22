package pe.egcc.app.demo;

public class Demo03 {

  public static void main(String[] args) {
    
    String[] ciudades = new String[5];
    mostrar(ciudades);
    
    ciudades[0] = "CHICLAYO";
    ciudades[1] = "CUZCO";
    ciudades[2] = "HUANCAYO";
    ciudades[3] = "AREQUIPA";
    ciudades[4] = "CHACHAPOYAS";
    
    mostrar(ciudades);
    
  }

  private static void mostrar(String[] datos) {
    System.out.println("--------------------");
    for (int i = 0; i < datos.length; i++) {
      System.out.println(i + ".- " + datos[i]);
    }
  }
  
}
