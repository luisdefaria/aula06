package exercicio0604;

import java.util.ArrayList;

public class GerenAnimal {
    private ArrayList<Animal> animals;
    private ArrayList<Proprietario> proprietarios;

    public GerenAnimal(){
        animals = new ArrayList<>();
        proprietarios = new ArrayList<>();
    }

    public void addAnimal(String nomeAnimal, String racaAnimal, String corAnimal, String anoNascimentoAnimal,
    String nomeProprietario, String telProprietario){
        Animal ani = new Animal(nomeAnimal, racaAnimal, corAnimal, anoNascimentoAnimal, nomeProprietario, telProprietario);
        animals.add(ani);
    }

    public void addProprietario(String nomeProprietario, String telProprietario){
        Proprietario pro = new Proprietario(nomeProprietario, telProprietario);
        proprietarios.add(pro);
    }

    public String listarTodos(){
        String saida="";

        for (Animal animal : animals) {

            saida += animal.exibirAnimal()+"\n";
            
        }
    return saida;
    }

    public String listarRacaEspecifica(String raca){
        String saida="";
        
        for (Animal animal : animals) {
            if (animal.getRacaAnimal().equals(raca)){
            saida += animal.exibirAnimal()+"\n";
            }
            
        }
    return saida;
    }


    
}