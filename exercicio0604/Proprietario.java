package exercicio0604;

public class Proprietario {
    private String nomeProprietario, telProprietario;

    public Proprietario() {

    }

    public Proprietario(String nomeProprietario, String telProprietario) {
        this.nomeProprietario = nomeProprietario;
        this.telProprietario = telProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getTelProprietario() {
        return telProprietario;
    }

    public void setTelProprietario(String telProprietario) {
        this.telProprietario = telProprietario;
    }

    public String exibirProprietario() {
        return "Nome: "+nomeProprietario + " - " + telProprietario;

    }

}