package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {

	public static void main(String[] args) {
		Predicate<Integer> ehPar = n -> n % 2 == 0;
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		numeros.stream().filter(ehPar).forEach(System.out::println);
	}

}
