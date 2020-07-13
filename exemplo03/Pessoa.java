package exemplo03;

public class Pessoa {
    private String nome;
    private Endereco ender;

    public Pessoa(){
        this.nome="Unknown";
        this.ender = new Endereco();
    }

    public String exibir(){
        return nome+" "+ender.exibir();
    }
    
}