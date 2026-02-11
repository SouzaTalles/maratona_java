package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        LinkedTransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Talles")); // lança uma excessão se não tiver espaço
        System.out.println(tq.offer("Talles")); // retorna false se não houver espaço
        System.out.println(tq.offer("Talles", 10, TimeUnit.SECONDS)); // retorna false se não houver espaço
        tq.put("Souza"); // bloqueia e espera ter um espaço para poder colocar o item
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Souza");
        }
        System.out.println(tq.tryTransfer("Souza")); // vai tentar transferir o elemento
        System.out.println(tq.tryTransfer("Souza", 5, TimeUnit.SECONDS)); // vai tentar transferir o elemento
        System.out.println(tq.element()); // mostrar o primeiro elemento da fila, mas não remove
        System.out.println(tq.peek()); // pega o elemento
        System.out.println(tq.poll()); // pega e remove o primeiro elemento da fila
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
