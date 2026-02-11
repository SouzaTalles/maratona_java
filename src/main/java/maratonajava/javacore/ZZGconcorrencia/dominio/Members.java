package maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMenberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retriveEmail() {
        System.out.println(Thread.currentThread().getName() + " checking if are emails");
        lock.lock();
        try {
            while (emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem emails disponível na lista, entrando em modo de espera");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
