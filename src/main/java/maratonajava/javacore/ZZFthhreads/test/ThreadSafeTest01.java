package maratonajava.javacore.ZZFthhreads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {
    private final List<String > names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFist() {
        if(!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");
        Runnable r = threadSafeNames::removeFist;
        new Thread(r).start();
        new Thread(r).start();
    }
}
