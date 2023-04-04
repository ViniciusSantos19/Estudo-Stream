package negocio;

public class Media {
	private int quantidade;
	private double total;
	
	public Media adicionarValor(double valor) {
		this.total += valor;
		this.quantidade++;
		return this;
	}

	public double getValor() {
		return this.total / this.quantidade;
	}
	
	public static Media combinar (Media m1, Media m2) {
		Media resultado = new Media();
		resultado.quantidade = m1.quantidade + m2.quantidade;
		resultado.total = m1.total + m2.total;
		return resultado;
	}
	
	
}
