package cn.ytime.singletonpattern;

/**
 * 登记式（静态内部类）单例模式
 * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化 REG_SINGLETON，故而不占内存。
 * 当RegSingleton第一次被加载时，并不需要去加载RegSingletonHolder，只有当getInstance()方法第一次被调用时，
 * 才会去初始化INSTANCE,第一次调用getInstance()方法会导致虚拟机加载SingleTonHoler类，
 * 这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 11:22
 */
public class RegSingleton {

    private static class RegSingletonHolder {
        private static final RegSingleton REG_SINGLETON = new RegSingleton();
    }

    private RegSingleton() {
    }

    public static RegSingleton getInstance() {
        return RegSingletonHolder.REG_SINGLETON;
    }

    public void printHello() {
        System.out.println("Hello, RegSingleton");
    }

}
