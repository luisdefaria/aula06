package exercicio0604;

public class AppAnimal {
    public static void main(String[] args) {
        GerenAnimal animal = new GerenAnimal();
        animal.addAnimal("Snoop", "Beagle", "Bege", "2016", "Martha", "9999-9999");
        animal.addAnimal("Mike", "Poodle", "Preto", "2017", "Martha", "9999-9999");
        animal.addAnimal("Pink", "Pastor", "Preto", "2016", "Cintia", "8888-8888");
        animal.addAnimal("Lili", "Pastor", "Bege", "2019", "Joana", "7777-7777");
        animal.addAnimal("Boris", "Golden", "Bege", "2018", "Cintia", "8888-8888");
        animal.addAnimal("Dudu", "Chow", "Amarelo", "2018");


        //System.out.println(animal.listarTodos());
        System.out.println(animal.listarRacaEspecifica("Pastor"));

    }
    
}