package farmacia;

import farmacia.controller.BancoDeDados;
import farmacia.model.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        Item dipirona = new Item("Dipirona 500mg", 100, "Caixa de 6");
        Item paracetamol = new Item("Paracetamol 250mg", 10, "Caixa de 12");

        BancoDeDados banco = new BancoDeDados();
        banco.cadastrar(dipirona);
    }
}
