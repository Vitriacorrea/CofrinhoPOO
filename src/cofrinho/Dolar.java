package cofrinho;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("DÓLAR - US$" + valor);
    }

    public double converter() {
        return valor * 5.0;
    }
}
