
public class CalculadoraArea {
	public static double calcularAreaTotal(FormaGeometrica[] array) {
		double somaAreas = 0;
		
		for (FormaGeometrica forma : array) {
			somaAreas = somaAreas + forma.calcularArea();
		}
		
		return somaAreas;
	}
	
	public static void main(String[] args) {
		FormaGeometrica[] array = new FormaGeometrica[3];
		array[0] = new Circulo(5);
		array[1] = new Retangulo(2, 3);
		array[2] = new Triangulo(7, 8);
		
		double somaTotal = calcularAreaTotal(array);
		System.out.println("Soma total das áreas = " + somaTotal);
		
	}
}
