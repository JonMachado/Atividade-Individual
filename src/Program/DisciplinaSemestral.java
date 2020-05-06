package Program;

public class DisciplinaSemestral extends Disciplina{
	private double n3;

	public DisciplinaSemestral(String nome, int periodo, double n1, double n2, double n3) {
		super(nome, periodo, n1, n2);
		this.n3 = n3;
	}

	@Override
	public double avaliacao() {
		
		return (getN1() + getN2() + n3) / 3;
	}
	
	public String toString() {
		return "Classe: " + getClass().getName() + "\nNome: " + getNome() + "\nPeriodo: " + getPeriodo() 
		+ "\nNota 1: " + getN1() + "\nNota 2: " + getN2() + "\nNota 3: " + n3;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

}
