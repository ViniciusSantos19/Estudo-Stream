package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Reduzir {
	public static void main(String[] args) {
		List<Integer> numeros =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (num, n) -> num + n;
		int total = numeros.stream().reduce(soma).get();
		System.out.println(total);
		int total2 = numeros.parallelStream().reduce(100,soma);
		System.out.println(total);
		Predicate<Integer> isBigger = n -> n > 5;
		int total3 = numeros.stream().filter(isBigger).reduce(soma).get();
		System.out.println(total3);
	}
}
