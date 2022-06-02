package TesteDIO;

public class Principal{
    
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Douglas",22,1000.0,2);
        Supervisor supervisor = new Supervisor("Geremias",21,1000.0,3);
        Vendedor vendendor = new Vendedor("Jamal",21,1000.0,4);
        
        System.out.println(gerente.bonificacao());
        System.out.println(supervisor.bonificacao());
        System.out.println(vendendor.bonificacao());

    }
}
