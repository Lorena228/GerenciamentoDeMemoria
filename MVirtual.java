public class MVirtual {

  public int[] MV = new int[15];
  public String page;

  public void preencheMVirtual(String page) {
    for (int i = 0; i < MV.length; i++) {
      MV[i] = page;
    }
  }
}