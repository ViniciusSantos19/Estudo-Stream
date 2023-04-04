package negocio;

public class Aluno {
	private String nome;
	private double nota;
	private boolean bomComportamento;
	private int presenca;
	
	public Aluno(String nome, double nota, boolean bomComportamento, int presenca) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
		this.presenca = presenca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean isBomComportamento() {
		return bomComportamento;
	}

	public void setBomComportamento(boolean bomComportamento) {
		this.bomComportamento = bomComportamento;
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}
	
	
	
	
}
