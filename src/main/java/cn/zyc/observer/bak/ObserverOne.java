package cn.zyc.observer.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 17:00
 * Version ：1.0
 * Description:
 */
public class ObserverOne implements Observer {
    public void Update(String msg) {
        System.out.println("接收到的消息："+msg);
    }
}
