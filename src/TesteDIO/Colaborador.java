package TesteDIO;


public class Colaborador {
   
    public String nome;
    public Integer idade;
    public Double salario;
    public Integer grauInstrucao;
    
    public Colaborador(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    public Double bonificacao(){
        return salario;
    }

}
