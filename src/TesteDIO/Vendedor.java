package TesteDIO;

public class Vendedor extends Colaborador {

    public Vendedor(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    public Double bonificacao(){
        return (salario + 300) * grauInstrucao;
    }
}
