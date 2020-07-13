package exemplo03;

public class Endereco {
    private String logradouro;
    private int numero;

    public Endereco(){
        this.logradouro="no name";
        this.numero=0;
            }

    public String exibir(){
        return logradouro+" "+numero;
    }


    
}