import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTimesArquivo implements GerenciadorTimes {
    private final String NOME_ARQUIVO = "times.txt";
    public void adicionar(Time t) {
        try(PrintWriter pw = new PrintWriter(NOME_ARQUIVO)){
            for (String linha; linhas)
            pw.println(t.toString());

        } catch(Exception ex){
            System.out.println("Erro ao acessar arquivo");
        }
    }
    public List<Time> consultar() {
        List<Time> times = new ArrayList<>();
        try{
            List<String> linhas = Files.readAllLines(Paths.get.(NOME_ARQUIVO));
        }
        catch(IOException ex){
            System.out.println("Erro ao acessar arquivo");
            for (String linha : linhas){
                String[] partes = linha.split(";");
                Time t = new Time(partes[0], Integer.parseInt(partes[1]));
                times.add(t);
            }
        }
        return times;

    }
    
}
