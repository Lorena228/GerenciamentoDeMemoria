import java.util.HashMap;
import java.util.Map;

public class MVirtual {

  Map<Integer, String> MVirtual = new HashMap<Integer, String>();

  public String[] operacao = new String[15];
  public String[] operacaoQuebrada = new String[3];

  public MVirtual(String[] entradaquebrada) {
    this.operacao = entradaquebrada;
  }

  public void divideOperacao(MemoriaFisica MF) {
    for (int i = 0; i < operacao.length; i++) {
      operacaoQuebrada = operacao[i].split("-");
      if (operacaoQuebrada[1] == "W") {
        String posicaoMF = MF.insereDadoMF(operacaoQuebrada[2]);
        MVirtual.put(Integer.parseInt(operacaoQuebrada[0]), posicaoMF);
      } else if (operacaoQuebrada[1] == "R") {
        verificarMF(Integer.parseInt(operacaoQuebrada[0]), MF);
      }

    }
  }

  public void verificarMF(int leitura, MemoriaFisica MF) {
    if (temReferencia(leitura, MF)) {
      System.out.println(MF.espaco[Integer.parseInt(MVirtual.get(leitura))]);
    }
  }

  public boolean temReferencia(int leitura, MemoriaFisica MF) {
    String chave = MVirtual.get(leitura);
    if (MF.espaco[(Integer.parseInt(chave))] != "") {
      return true;
    } else {
      return false;
    }
  }

}
