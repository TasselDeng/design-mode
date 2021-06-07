package cn.ytime.singletonpattern;

/**
 * 枚举式单例模式
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 16:27
 */
public enum EnumSingleton {
    // 实例
    INSTANCE;

    public void printHello() {
        System.out.println("Hello, EnumSingleton");
    }

}
