package entities;

public class Empregado {
	
       private Integer id;
       private double salario;
       private String nome;
       
       public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empregado() {
    	   
       }
        
	public Empregado(Integer id, double salario, String nome) {
		this.id = id;
		this.salario = salario;
		this.nome = nome;
	}
	
	public void incrementarSalario(double porcento) {
	         salario += salario * porcento /100;
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f ", salario);
	}
	
       
}