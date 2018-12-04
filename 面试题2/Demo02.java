package interviewoffer;

/**
 * 实现单例模式
 */
public class Demo02 {

    private static class Instance{
        private static final Demo02 instance = new Demo02();
    }
    private  Demo02(){}
    public static Demo02 getInstance(){
        return Instance.instance;
    }
}
class test{
    public static void main(String[] args) {
        Demo02 instance1 = Demo02.getInstance();
        Demo02 instance2 = Demo02.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
