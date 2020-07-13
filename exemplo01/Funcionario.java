package exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

	public double getSalario() {
		return salario;
    }
    
    public String exibir(){
        return nome + ": " + salario;
    }

    @Override
    public String toString(){
        return nome + ": " + salario;
        
    }


    }