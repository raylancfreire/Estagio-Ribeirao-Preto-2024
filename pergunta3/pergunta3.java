import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        try {
            
            JSONParser parser = new JSONParser();
            JSONArray faturamentoDiario = (JSONArray) parser.parse(new FileReader("faturamento.json"));
            
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            
            for (Object obj : faturamentoDiario) {
                JSONObject dia = (JSONObject) obj;
                double valor = (double) dia.get("valor");
                
                if (valor > 0) {
                    somaFaturamento += valor;
                    diasComFaturamento++;
                    if (valor < menorValor) menorValor = valor;
                    if (valor > maiorValor) maiorValor = valor;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            for (Object obj : faturamentoDiario) {
                JSONObject dia = (JSONObject) obj;
                double valor = (double) dia.get("valor");
                
                if (valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
