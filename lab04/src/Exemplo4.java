import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo4 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .takeWhile(linha -> !linha.trim().equals("FIM"))
                .map(linha -> linha.split("\\|"))
                .map(V -> AccessLog.from(V[0].trim(), V[1].trim(), V[2].trim(), V[3].trim(), V[4].trim(), V[5].trim()))
                .filter(log -> log.status() >= 400)
                .forEach(System.out::println);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}