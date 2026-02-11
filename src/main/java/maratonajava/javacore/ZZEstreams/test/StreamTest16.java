package maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumfor(num);
        sumStreamIterate(num);
        sumParallelsStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumfor(long num) {
        System.out.println("Sum For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1 ; i <= num ; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - init) + " ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - init) + " ms");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    private static void sumParallelsStreamIterate(long num) {
        System.out.println("Sum ParallelsStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - init) + " ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - init) + " ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - init) + " ms");
    }
}
