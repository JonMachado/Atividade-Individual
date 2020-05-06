package Program;

public class DisciplinaAnual extends Disciplina{
	private double n3;
	private double n4;
	private double n5;
	private double n6;
	
	public DisciplinaAnual(String nome, int periodo, double n1, double n2, double n3, double n4, double n5, double n6) {
		super(nome, periodo, n1, n2);
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
	}

	@Override
	public double avaliacao() {
		
		return ((getN1() + getN2() + n3 + n4 + n5) / 5.0 * 0.6) + (n6 * 0.4);
	}
	
	public String toString() {
		return "Classe: " + getClass().getName() + "\nNome: " + getNome() + "\nPeriodo: " + getPeriodo() 
		+ "\nNota 1: " + getN1() + "\nNota 2: " + getN2() + "\nNota 3: " + n3 + "\nNota 4: " + n4 
		+ "\nNota : " + n5 + "\nNota 6: " + n6;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	public double getN5() {
		return n5;
	}

	public void setN5(double n5) {
		this.n5 = n5;
	}

	public double getN6() {
		return n6;
	}

	public void setN6(double n6) {
		this.n6 = n6;
	}
	
}
