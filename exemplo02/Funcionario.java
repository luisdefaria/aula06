package exemplo02;

public class Funcionario {
    private String nome;
    private int horas;
    private double valorHora;
    protected double salario;
   
    
    
    public Funcionario() {
    }
    
    
    public Funcionario(String nome, int horas, double valorHora){
        setNome(nome);
        setHoras(horas);
        setValorHora(valorHora);
        calcularSalario(salario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
       
    public void calcularSalario(double salario){
        this.salario= horas*valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public String imprimirSalario(){
        return nome+ ": " +horas+"horas = R$"+getSalario();
    }


}
    
