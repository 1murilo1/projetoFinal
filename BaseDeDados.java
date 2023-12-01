package projetoFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BaseDeDados {
    private File arquivo;

    public BaseDeDados(String caminhoArquivo) {
        this.arquivo = new File(caminhoArquivo);
    }

    public void lerArquivo() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                // Processar cada linha do arquivo
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escreverArquivo(String conteudo) {
        try (FileWriter escritor = new FileWriter(arquivo, true)) {
            escritor.write(conteudo);
            escritor.write(System.lineSeparator()); // Pular linha
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
