public class Ejercicio01{
	
  // Método que hace a una clase ejecutable
  public static void main(String args[]){
    // Datos
    double precio = 450.78;
    int cant = 8;
    // Proceso
    double total = calcTotal(precio,cant);
    double subtotal = calcSubtotal(total);
    double impuesto = calcImpuesto(total);
	// Reporte
	System.out.println("Subtotal: " + subtotal);
	System.out.println("Impuesto: " + impuesto);
	System.out.println("Total: " + total);
  }
	
  public static double calcTotal(
  double precio, int cant){
    double total = precio * cant;
	return total;
  }
  
  public static double calcSubtotal(double total){
	double subtotal = total / 1.18;
	return subtotal;
  }
  
  public static double calcImpuesto(double total){
    double impuesto;
    impuesto = total - calcSubtotal(total);
    return impuesto;
  }
  
}