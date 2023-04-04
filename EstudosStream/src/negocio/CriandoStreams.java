package negocio;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java "," Lua ",  "C# ");
		
		String[] maisLangs = {"JavaScript ", "Ruby ", "Php ", "\n"};
		
		Arrays.stream(maisLangs).forEach(print);;
		
		Stream.of(maisLangs).forEach(print);
		
		langs.forEach(print);
	}
}
