package Program;

public abstract class Disciplina {
	private String nome;
	private int periodo;
	private double n1;
	private double n2;
	
	public Disciplina(String nome, int periodo, double n1, double n2) {
		this.nome = nome;
		this.periodo = periodo;
		this.n1 = n1;
		this.n2 = n2;
	}

	public abstract double avaliacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	

}
