package cofrinho;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("REAL - R$" + valor);
    }

    public double converter() {
        return valor;
    }
}
