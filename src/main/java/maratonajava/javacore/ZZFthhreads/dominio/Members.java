package maratonajava.javacore.ZZFthhreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private  final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMenberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail()  {
        System.out.println(Thread.currentThread().getName() + " checking if are emails");
        synchronized (this.emails) {
            while (emails.isEmpty()) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem emails disponível na lista, entrando em modo de espera");
                try {
                    this.emails.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");
            this.emails.notifyAll();
        }
    }
}
