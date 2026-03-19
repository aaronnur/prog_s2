import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exemplo1 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .takeWhile(linha -> !linha.trim().equals("FIM"))
                .forEach(System.out::println);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}