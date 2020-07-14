package exercicio0606;

public class ContaPoupanca extends Conta {
    private double taxaSaque;

    public ContaPoupanca(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public ContaPoupanca(String numConta, double saldoConta, double taxaSaque) {
        super(numConta, saldoConta);
        this.taxaSaque = taxaSaque;
    }

    public double taxaSaque() {
        return taxaSaque;
    }

    public void taxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacarDinheiro (double valorSaque){
        if ((getSaldoConta()) > (valorSaque+taxaSaque)){
            setSaldoConta(getSaldoConta()-valorSaque);
        }
    }
    
    @Override
    public void depositarDinheiro (double valorDeposito){
        setSaldoConta(getSaldoConta()+valorDeposito);
    }
    
}