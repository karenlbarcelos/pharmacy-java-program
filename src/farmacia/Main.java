package farmacia;

import farmacia.controller.BancoDeDados;
import farmacia.model.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        Item tylenol = new Item("Tylenol", 30, "Gotas");

        BancoDeDados banco = new BancoDeDados();
        banco.cadastrar(tylenol);
    }
}
