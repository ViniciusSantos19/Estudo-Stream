package negocio;

public class TesteMedia {

	public static void main(String[] args) {
		Media media = new Media();
		media.adicionarValor(5.7).adicionarValor(7.9);
		System.out.println(media.getValor());
		Media media2 = new Media();
		media2.adicionarValor(1.7).adicionarValor(10);
		System.out.println(media2.getValor());
		System.out.println(Media.combinar(media, media2).getValor());
	}

}
