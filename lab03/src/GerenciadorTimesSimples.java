import java.util.List;
import java.util.ArrayList;
public class GerenciadorTimesSimples implements GerenciadorTimes {
    
    private List<Time> times = new ArrayList<>();

    public void adicionar(Time t){
        times.add(t);
    }
    public List<Time> consultar(){
        return times;
    }
}