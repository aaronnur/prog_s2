public class AppTimesMain {
    public static void main(String[] args) {
        GerenciadorTimes g = new GerenciadorTimesAr();
        AppTimes app = new AppTimes(g);
        app.executarAdicao();
        app.executarConsulta();
    }
}