// Aluno: Aaron
// Arquivo: RegistroLog.java

public class RegistroLog {
    private String metodo;
    private double tempoRespostaSegundos;

    // Construtor que recebe a linha de texto e já extrai o que precisamos
    public RegistroLog(String linhaLog) {
        String[] partes = linhaLog.split(" \\| ");
        if (partes.length == 6) {
            this.metodo = partes[2].trim();
            this.tempoRespostaSegundos = extrairTempo(partes[5].trim());
        }
    }

    public String getMetodo() {
        return metodo;
    }

    public double getTempoRespostaSegundos() {
        return tempoRespostaSegundos;
    }

    private double extrairTempo(String tempoStr) {
        try {
            if (tempoStr.endsWith("ms")) {
                return Double.parseDouble(tempoStr.replace("ms", "")) / 1000.0;
            } else if (tempoStr.endsWith("s")) {
                return Double.parseDouble(tempoStr.replace("s", ""));
            }
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter tempo: " + tempoStr);
        }
        return 0.0;
    }
}