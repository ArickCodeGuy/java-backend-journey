package syncing_threads;

public class App {
  public static void main(String[] args) {
    Foo f1 = new Foo(1);
    Foo f2 = new Foo(2);

    Thread t1 = new Thread(f1);
    Thread t2 = new Thread(f2);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    System.out.println("Sync result");
    System.out.println(f1.getResult());
    System.out.println(f2.getResult());
  }

}
