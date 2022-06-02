package TesteDIO;

public class Supervisor extends Colaborador  {
    
    public Supervisor(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    public Double bonificacao(){
        return (salario + 500) * grauInstrucao;
    }
}
