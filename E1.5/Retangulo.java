
public class Retangulo extends FormaGeometrica {
	double largura;
	double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return largura * altura;
	}

}
