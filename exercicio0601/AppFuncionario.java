package exercicio0601;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro Jr", 11, 500);
        Senior funcionario2 = new Senior("Pedro Pai ", 30, 500);

        System.out.println(funcionario1.imprimirSalario());
        System.out.println(funcionario2.imprimirSalario());


    }
}