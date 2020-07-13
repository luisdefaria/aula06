package exercicio0601;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro Jr", 11, 543);
        Senior funcionario2 = new Senior();

        System.out.println(funcionario1.imprimirSalario());
        System.out.println(funcionario2.imprimirSalario());


    }
}