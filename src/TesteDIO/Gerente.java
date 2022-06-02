package TesteDIO;

public class Gerente extends Colaborador {
    
    public Gerente(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    public Double bonificacao(){
        return (salario + 1000) * grauInstrucao;
    }  
}
