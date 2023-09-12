import java.util.HashMap;
import java.util.Map;

public class MVirtual {

  Map<Integer, String> MVirtual = new HashMap<Integer, String>();
  public String[] operacao;
  public String[] operacaoQuebrada = new String[3];

  public MVirtual(String[] entradaquebrada) {
    this.operacao = entradaquebrada;
  }

  public void indiceMVOperação(String[] operacao) {
    System.out.println(operacao[0]);
  }

  /*
   * public void divideOperacao() {
   * 
   * operacaoQuebrada = operacao.split("-");
   * for (String valores : operacaoQuebrada) {
   * System.out.println(valores);
   * }
   * }
   */
}
