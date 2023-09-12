public class Main {
  public static void main(String[] args) {

    EntradaThread thread1 = new EntradaThread("4-R,5-R,0-R,4-w-2");
    EntradaThread thread2 = new EntradaThread("1-R,5-W-4,2-R,2-w-6");
    thread1.QuebraString();
    thread2.QuebraString();

  }
}
