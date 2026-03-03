public class AppTimes {
    private GerenciadorTimes gerenciador;
    public AppTimes() {
        gerenciador = new GerenciadorTimes();
    }
    public void executarAdicao(){
        gerenciador.adicionar(new Time("Novorizontino", 2010));
        gerenciador.adicionar(new Time("São Paulo", 1930));
    }
    public void executarConsulta(){
        System.out.println(gerenciador.consultar());

    }
}
