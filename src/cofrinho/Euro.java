package cofrinho;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("EURO - €" + valor);
    }

    public double converter() {
        return valor * 6.0;
    }
}
