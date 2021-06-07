package cn.ytime.singletonpattern;

/**
 * 双重校验锁单例模式
 * 线程安全，效率高
 * <p>
 * 双重校验原因：
 * 第一次判空，如果不进行判空，每一个线程都会先去获得当前类的类锁，
 * 而其他线程都进入阻塞状态。单例模式中初始化单例的程序只会执行一次，大部分情况下
 * 会直接到return语句返回，如果都阻塞在获取锁的位置，会大大降低程序的运行速度。
 * 第二次判空，假设有两个线程A和B，都进行完第一次判空了，A和B都阻塞着，A线程获取了
 * 类锁，然后B线程被阻塞，A线程新建了一个实例后释放了锁，B线程获取锁，又新建了一个
 * 实例，这破坏了单例设计模式的初衷
 *
 * @author dsy
 * @version 1.0
 * @date 2021-06-03 10:46
 */
public class DoubleCheckLockingSingleton {

    private volatile static DoubleCheckLockingSingleton doubleCheckLockingSingleton = null;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (doubleCheckLockingSingleton == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (doubleCheckLockingSingleton == null) {
                    doubleCheckLockingSingleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return doubleCheckLockingSingleton;
    }

    public void printHello() {
        System.out.println("Hello, DoubleCheckLockingSingleton");
    }

}
