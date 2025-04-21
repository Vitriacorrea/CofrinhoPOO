package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        moedas.remove(moeda);
    }

    public void listar() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio.");
        } else {
            for (Moeda m : moedas) {
                m.info();
            }
        }
    }

    public void totalConvertido() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converter();
        }
        System.out.printf("Total em reais: R$ %.2f\n", total);
    }
}
