package Program;

public class DisciplinaTrimestral extends Disciplina{
	
	
	public DisciplinaTrimestral(String nome, int periodo, double n1, double n2) {
		super(nome, periodo, n1, n2);
	}

	@Override
	public double avaliacao() {
		return (getN1() * 0.4) + (getN2() * 0.6);
	}

	public String toString() {
		return "Classe: " + getClass().getName() + "\nNome: " + getNome() + "\nPeriodo: " + getPeriodo() 
		+ "\nNota 1: " + getN1() + "\nNota 2: " + getN2();
	}

}
