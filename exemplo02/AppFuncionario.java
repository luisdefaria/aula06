package exemplo02;


public class AppFuncionario {
    public static void main(String[] args) {
        GerenciaFunc funcionario = new GerenciaFunc();

        funcionario.addFuncionario("Pedro Jr", 30, 2);
        funcionario.addSenior("Pedro Sr", 30, 2);

        System.out.println(funcionario.removerFuncionario("Pedro Sr"));
        System.out.println(funcionario.listarTodos());

    }
}