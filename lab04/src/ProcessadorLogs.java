// Aluno: Aaron
// Arquivo: ProcessadorLogs.java

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcessadorLogs {

    public static void main(String[] args) {
        String caminhoArquivo = "access.log";

        // Tenta ler o arquivo e criar um Stream de linhas
        try (Stream<String> linhas = Files.lines(Paths.get(caminhoArquivo))) {
            
            // Processamento do pipeline
            double tempoTotalPut = linhas
                    .map(RegistroLog::new) // Converte a String em um objeto RegistroLog
                    .filter(log -> "PUT".equals(log.getMetodo())) // Filtra apenas o método PUT
                    .mapToDouble(RegistroLog::getTempoRespostaSegundos) // Pega o tempo já convertido
                    .sum(); // Soma tudo

            System.out.println("Processamento concluído com sucesso.");
            System.out.printf("Soma do tempo de todas as transações PUT: %.3f segundos%n", tempoTotalPut);

        } catch (IOException e) {
            System.err.println("Erro ao tentar ler o arquivo access.log: " + e.getMessage());
        }
    }
}