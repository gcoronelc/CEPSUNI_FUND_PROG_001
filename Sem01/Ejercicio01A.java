public class Ejercicio01A{
	
  // Método que hace a una clase ejecutable
  public static void main(String args[]){
    // Datos
    double precio = Double.parseDouble(args[0]);
    int cant = Integer.parseInt(args[1]);
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