package exercicio0606;

public abstract class Conta {
    private int numConta;
    private double saldoConta;

    public Conta(int numConta) {
        this.numConta = numConta;
        this.saldoConta = 0;
    }

    public Conta(int numConta, double saldoConta) {
        this.numConta = numConta;
        this.saldoConta = saldoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void sacarDinheiro (double valorSaque){
        this.saldoConta = this.saldoConta - valorSaque;
    }

    public void depositarDinheiro (double valorDeposito){
        this.saldoConta = this.saldoConta + valorDeposito;
    }


}