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
            OutputStreamWriter osw;
            BufferedWriter bw;
        } catch (Exception e) {
            System.out.println("O arquivo não foi cadastrado.");
            System.out.println(e + e.getMessage());}
    }

    public void editar(int codigo){}

    public void pesquisar(int codigo){}

    public void excluir(int codigo){}


}
