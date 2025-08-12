package farmacia;

import farmacia.controller.BancoDeDados;
import farmacia.model.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        BancoDeDados banco = new BancoDeDados();
        ArrayList<Item> itens = banco.ler();

        Item item = banco.pesquisar(10, itens); //index e a colecao
        if (item != null){
            System.out.println(item.getNome());
        } else {
            System.out.println("Sem medicamento cadastrado.");
        }


        //        for(int i= 0; i<itens.size(); i++){
        //            System.out.println("Código = " + i + " - Nome: " + itens.get(i).getNome() + ", Quantidade: " + itens.get(i).getQuantidade()
        //                    + "Tipo: " + itens.get(i).getTipo());
        //
        //        }
    }
}
