package exemplo01;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcos Silva", 3000,8);
        Funcionario funcionario = new Funcionario("Camila",4000);


        System.out.println(gerente);

        System.out.println(funcionario);
        
    }
    
}