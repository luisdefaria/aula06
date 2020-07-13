package exemplo02;

import java.util.ArrayList;


public class GerenciaFunc {
    private ArrayList<Funcionario> funcionarios;

    public GerenciaFunc(){
        funcionarios = new ArrayList<>();
    }

    public void addFuncionario(String nome, int horas, double valorHora){
        Funcionario func = new Funcionario(nome, horas, valorHora);
        funcionarios.add(func);
    }

    public void addSenior(String nome, int horas, double valorHora){
        Senior sen = new Senior(nome, horas, valorHora);
        funcionarios.add(sen);
    }

    public boolean removerFuncionario(String nome){
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)){
                funcionarios.remove(funcionario);
                return true;
            }
        }
        return false;
    }

    public String listarTodos(){
        String saida="";

        for (Funcionario funcionarioTemp : funcionarios){
            saida += funcionarioTemp.imprimirSalario()+"\n";
        }

    return saida;
    }

    public String listarSenior(){
        String saida="";

        for (Funcionario funcionarioTemp : funcionarios){
            if (funcionarioTemp instanceof Senior){
                saida += funcionarioTemp.imprimirSalario()+"\n";
            }
        }

    return saida;   
    }
    
}