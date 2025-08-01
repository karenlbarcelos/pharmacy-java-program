package farmacia.controller;

import farmacia.model.Item;

import java.io.*;

public class BancoDeDados {

    private Item item;

    public BancoDeDados(){

    }

    public void cadastrar(Item item) {
        try {
            OutputStream localizarArquivo = new FileOutputStream("medicamentos.txt", true); //se nao existir sera criado
            OutputStreamWriter preparaArquivo = new OutputStreamWriter(localizarArquivo); //prepara para a escrita
            BufferedWriter escreveNoArquivo = new BufferedWriter(preparaArquivo);

            String linha = item.getNome() + ", " + item.getQuantidade() +", " + item.getTipo();
            escreveNoArquivo.write(linha);
            escreveNoArquivo.newLine(); //evita sobrescrever o arquivo

            escreveNoArquivo.close();
            preparaArquivo.close();
            escreveNoArquivo.close();

            System.out.println("O medicamento " + item.getNome() + " foi cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("O arquivo não foi cadastrado.");
            System.out.println(e + e.getMessage());}
    }

    public void editar(int codigo){}

    public void pesquisar(int codigo){}

    public void excluir(int codigo){}


}
