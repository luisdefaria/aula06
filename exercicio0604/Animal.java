package exercicio0604;

public class Animal {
    private String nomeAnimal,racaAnimal,corAnimal,anoNascimentoAnimal;
    private Proprietario dono;

    public Animal(){}
    
    public Animal(String nomeAnimal, String racaAnimal, String corAnimal, String anoNascimentoAnimal,
    String nomeProprietario, String telProprietario) {
        this.nomeAnimal = nomeAnimal;
        this.racaAnimal = racaAnimal;
        this.corAnimal = corAnimal;
        this.anoNascimentoAnimal = anoNascimentoAnimal;
        dono = new Proprietario(nomeProprietario,telProprietario);
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getCorAnimal() {
        return corAnimal;
    }

    public void setCorAnimal(String corAnimal) {
        this.corAnimal = corAnimal;
    }

    public String getAnoNascimentoAnimal() {
        return anoNascimentoAnimal;
    }

    public void setAnoNascimentoAnimal(String anoNascimentoAnimal) {
        this.anoNascimentoAnimal = anoNascimentoAnimal;
    }

    
    public String exibirAnimal(){
        return nomeAnimal+"["+racaAnimal+"] "+corAnimal+" "+anoNascimentoAnimal+" | Dono:"
        +dono.getNomeProprietario()+" tel."+dono.getTelProprietario();
    }
    





}