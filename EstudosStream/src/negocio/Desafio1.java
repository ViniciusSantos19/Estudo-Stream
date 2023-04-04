package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio1 {

	public static void main(String[] args) {
		Consumer<Object> print =  System.out::print;
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> integerToString =  n ->  n.toBinaryString(n).toString();
		UnaryOperator<String> inverter = num -> new StringBuilder(num).reverse().toString();
		Function<String, Integer> stringToInteger = n -> Integer.parseInt(n, 2);
		numeros.stream().map(integerToString).map(inverter).map(stringToInteger).forEach(System.out::println);
		
	}

}
