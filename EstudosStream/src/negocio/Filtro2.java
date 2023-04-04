package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Vini", 5, true, 12);
		Aluno a2 = new Aluno("Carlos", 4, false, 3);
		Aluno a3 = new Aluno("Ana", 7, true, 15);
		Aluno a4 = new Aluno("Maria", 5, false, 5);
		Aluno a5 = new Aluno("João", 3, false, 13);
		Aluno a6 = new Aluno("Marcelo", 10, true , 20);
		
		Predicate<Aluno> aprovado = a -> a.getNota() >=5;
		Predicate<Aluno> presenca = a -> a.getPresenca() >=10;
		Predicate<Aluno> comportaento = a -> a.isBomComportamento() == true;
		
		List<Aluno> listaAluno = Arrays.asList(a1,a2,a3,a4,a5,a6);
		Function<Aluno, String> transformaString = a -> "Parabens "+ a.getNome()+ " você foi aprovado";
		listaAluno.stream().filter(aprovado).filter(comportaento).filter(presenca).map(transformaString).forEach(System.out::println );
	}
}
