public class EntradaThread extends Thread {

  public String entrada;
  public String[] entradaquebrada;

  public EntradaThread(String entrada) {
    this.entrada = entrada;
    start();
  }

  public void QuebraString() {
    entradaquebrada = entrada.split(",");
    MVirtual m1 = new MVirtual(entradaquebrada);
    for (String substring : entradaquebrada) {
      System.out.println(substring);
    }
  }
}
