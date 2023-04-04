package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduzir2 {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria", 4, false, 20);
		Aluno aluno2 = new Aluno("Naldo", 10, true, 15);
		Aluno aluno3 = new Aluno("João", 7.5, true, 7);
		Aluno aluno4 = new Aluno("Vini", 7, false, 20);
		Aluno aluno5 = new Aluno("Gabriel", 6, true, 12);
		Aluno aluno6 = new Aluno("João Pedro", 5, true, 17);
		List<Aluno> lista = Arrays.asList(aluno1,aluno2, aluno3, aluno4, aluno5, aluno6);
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		Function<Aluno, Double> apenasNotas = aluno -> aluno.getNota();
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		BiFunction<Media, Double, Media> calculaMedia = 
				(media, nota) -> media.adicionarValor(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		Media media = lista.parallelStream().filter(aprovado).map(apenasNotas).reduce(new Media(), calculaMedia, combinarMedia);
		System.out.println("a média dos alunos é "+media.getValor());
	}
}
