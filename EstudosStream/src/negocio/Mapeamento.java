package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapeamento {
	public static void main(String[] args) {
		Consumer<String> print =  System.out::print;
		
		List<String> marcas = Arrays.asList("Audi ", "Bmw ", "Honda ","Ford ");
		
		//marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
		UnaryOperator<String> grito = n-> n + " !!!";
		
		//System.out.println(primeiraLetra.andThen(maiuscula).andThen(grito).apply(marcas.get(2)));
		
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);;
	}
}
