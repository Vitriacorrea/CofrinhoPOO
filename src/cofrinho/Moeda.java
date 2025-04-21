package cofrinho;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Moeda)) return false;
        Moeda other = (Moeda) obj;
        return this.valor == other.valor;
    }
}
