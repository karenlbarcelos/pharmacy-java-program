package farmacia.controller;

import farmacia.model.Item;

import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {

    private Item item;

    public BancoDeDados() {

    }

    public void cadastrar(Item item) {
        try {
            OutputStream localizarArquivo = new FileOutputStream("medicamentos.txt", true); //se nao existir sera criado
            OutputStreamWriter preparaArquivo = new OutputStreamWriter(localizarArquivo); //prepara para a escrita
            BufferedWriter escreveNoArquivo = new BufferedWriter(preparaArquivo);

            String linha = item.getNome() + ", " + item.getQuantidade() + ", " + item.getTipo();
            escreveNoArquivo.write(linha);
            escreveNoArquivo.newLine(); //evita sobrescrever o arquivo

            escreveNoArquivo.close();
            preparaArquivo.close();
            escreveNoArquivo.close();

            System.out.println("O medicamento " + item.getNome() + " foi cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("O arquivo não foi cadastrado.");
            System.out.println(e + e.getMessage());
        }
    }

    public void editar(int codigo) {
    }

    public void pesquisar(int codigo) {
    }

    public void excluir(int codigo) {
    }

    //leitura de arquivo
    public ArrayList<Item> ler() {
        try {
            InputStream is = new FileInputStream("medicamentos.txt");
            InputStreamReader isr = new InputStreamReader(is); //preparacao para leitura
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            ArrayList<String> linhas = new ArrayList<>(); //colecao para armazenar as linhas

            while (linha != null) {
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

            System.out.println("Arquivo lido com sucesso!");

            //transformando em objetos do java
            ArrayList<Item> itens = new ArrayList<>();
            Item item;
            String[] elementos = new String[3];

            for (int i = 0; i < linhas.size(); i++) {
                elementos = linhas.get(i).split(", ");
                int quantidade = Integer.parseInt(elementos[1]); //conversão do tipo, de String para int
                item = new Item(elementos[0], quantidade, elementos[2]);
                itens.add(item);
            }

            System.out.println("Linhas convertidas em objeto.");
            return itens;
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo.");
            return null;
        }
    }
}
