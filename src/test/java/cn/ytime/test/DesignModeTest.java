package cn.ytime.test;

import cn.ytime.singletonpattern.LazySingleton;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 16:31
 */
public class DesignModeTest {

    @Test
    public void singletonTest() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            Runnable runnable = () -> {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " : " + instance);
            };
            threadPool.execute(runnable);
        }
        threadPool.shutdown();
        Thread.sleep(5000);
    }

}
