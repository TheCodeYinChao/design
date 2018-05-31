package cn.zyc.observer.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:59
 * Version ：1.0
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Subjec subjec = new SubejectOne();
        Observer observer = new ObserverOne();
        subjec.re(observer);
        subjec.nt("你好呀！！");
        subjec.rm(observer);
        subjec.nt("你还好吗");
    }
}
