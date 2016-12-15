package main.chapter_2;

/**
 * Created by cuijl on 12/15/16.
 *
 * 单例 是最为最常见的设计模式之一。对于任何时刻，如果某个类只存在且最多存在一个具体的实例，
 * 那么我们称这种设计模式为单例。例如，对于 class Mouse (不是动物的mouse哦)，
 * 我们应将其设计为 singleton 模式。你的任务是设计一个 getInstance 方法，对于给定的类，
 * 每次调用 getInstance 时，都可得到同一个实例。
 */
public class Singleton {

    /**
     * (1)线程不安全
     * @return
     */
    private static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance_1(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 线程安全, synchronized 保证在同一时刻最多只有一个线程执行该段代码
     * @return
     */
    private static  Singleton instance_2;
    public static synchronized Singleton getInstance_2(){
        if(instance_2 == null){
            instance_2 = new Singleton();
        }
        return instance_2;
    }

    public static void main(String[] args){

        //Singleton a = Singleton.getInstance_1();
        //Singleton b = Singleton.getInstance_1();
        //System.out.println(a == b);

        Singleton a = Singleton.getInstance_2();
        Singleton b = Singleton.getInstance_2();
        System.out.println(a == b);


    }
}
