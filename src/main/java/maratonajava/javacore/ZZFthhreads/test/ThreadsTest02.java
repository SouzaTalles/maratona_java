package maratonajava.javacore.ZZFthhreads.test;



class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
//            Thread.yield(); *Não garante troca e não garante pausa
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Daemon x User
public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join(); // O join faz a thread main se juntar na thread até terminar o processo que foi dada a ela
        t2.start();
    }
}

//  Runnable example = () -> {
//      // Código a ser executado
//  }
//
//  new Thread(example);
//
//  Thread t1 = new Thread(() -> {
//      // Código a ser executado, pode ser usado novamente
//  });
//
//  new Thread(() -> {
//      // Código a ser executado
//  }).start();
