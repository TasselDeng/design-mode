package cn.ytime.singletonpattern;

/**
 * 加锁的懒汉式单例模式
 * 线程安全，getInstance方法加锁影响效率，大部分情况下不需要同步
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 10:33
 */
public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton synchronizedLazySingleton = null;

    private SynchronizedLazySingleton() {
    }

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (synchronizedLazySingleton == null) {
            synchronizedLazySingleton = new SynchronizedLazySingleton();
        }
        return synchronizedLazySingleton;
    }

    public void printHello() {
        System.out.println("Hello, SynchronizedLazySingleton");
    }

}
