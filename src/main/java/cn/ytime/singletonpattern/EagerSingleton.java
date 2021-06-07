package cn.ytime.singletonpattern;

/**
 * 饿汉式单例模式
 * 线程安全，在类加载时就实例化，浪费内存
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-01 16:29
 */
public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getSingleton() {
        return singleton;
    }

    public void printHello() {
        System.out.println("Hello, EagerSingleton");
    }

}
