package cn.ytime.singletonpattern;

/**
 * 懒汉式单例模式
 * 线程不安全
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 10:25
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void printHello() {
        System.out.println("Hello, LazySingleton");
    }

}
