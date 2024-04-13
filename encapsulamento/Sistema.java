package encapsulamento;

public class Sistema {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123);
        ContaCorrente c2 = new ContaCorrente(124);
        c2.numero = 125;
       
        c1.getSaldo();
    }

    
}
