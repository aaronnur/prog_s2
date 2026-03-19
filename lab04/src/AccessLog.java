import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public record AccessLog(
    String ip, 
    LocalDateTime dataHora, 
    String metodo, 
    String url, 
    int status, 
    int tempoResposta) {
        public static AccessLog from(
            String ip, 
            String strDataHora, 
            String metodo,
            String url,
            String strStatus,
            String strTempoResposta){
                
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dataHora;
                dataHora = LocalDateTime.parse(strDataHora, formatador);
                int status;
                status = Integer.parseInt(strStatus);
                int tempoResposta = 0;

                if (strTempoResposta.endsWith("ms")){
                    String strValor;
                    strValor = strTempoResposta.substring(0, strTempoResposta.length() - 2);
                    tempoResposta = Integer.parseInt(strValor);
                }
                else{
                    String strValor;
                    strValor = strTempoResposta.substring(0, strTempoResposta.length() - 1);
                    tempoResposta = (int)(1000*Double.parseDouble(strValor));
                }
                return new AccessLog(ip, dataHora, metodo, url, status, tempoResposta);

            }
}

