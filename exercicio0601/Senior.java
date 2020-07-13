package exercicio0601;


public class Senior extends Funcionario{
    private double bonusSenior;

    public Senior(){}

    public Senior(String nome, int horas, double valorHora) {
        super(nome, horas, valorHora);
        setBonusSenior(bonusSenior);
        calcularSalario(getSalario());        
    }

    public void setBonusSenior(double bonusSenior) {
        this.bonusSenior = ((getHoras()/10)*getValorHora());
    }

    public double getBonusSenior() {
        return bonusSenior;
    }

    @Override
    public void calcularSalario(double salario){
        super.salario= (getHoras()*getValorHora())+bonusSenior;
    }

    @Override
    public String imprimirSalario(){
        return getNome()+ ": " +getHoras()+"horas = R$"+getSalario()+"("+bonusSenior+")horasBonus";
    }

  

}