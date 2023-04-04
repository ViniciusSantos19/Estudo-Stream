package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desefio2 {

	public static void main(String[] args) {
		Produto p1 = new Produto("Nintendo ds", 500, 0.15, 50);
		Produto p2 = new Produto("Televisão", 1500, 0.25, 0);
		Produto p3 = new Produto("Computador", 4500, 0.15, 350);
		Produto p4 = new Produto("Monitor", 1500, 0.3, 150);
		Produto p5 = new Produto("Mouse", 250, 0.1, 0);
		Produto p6 = new Produto("Teclado", 500, 0, 0);
		
		List<Produto> listaDeProduto = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto> grandeDesconto = p -> p.getDesconto() >= 0.1;
		Predicate<Produto> freteGatris = p -> p.getFrete() == 0;
		Predicate<Produto> produtoDeGrandeValor = p -> p.getPreco()>= 5;
		
		Function<Produto, String> nomeProd = p -> "O produto é " + p.getNome() + " e o preco é "+ p.getPreco();
		
		listaDeProduto.stream()
		.filter(grandeDesconto)
		.filter(produtoDeGrandeValor)
		.filter(freteGatris)
		.map(nomeProd)
		.forEach(System.out::println);
		;
	}

}
