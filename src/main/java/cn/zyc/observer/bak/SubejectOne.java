package cn.zyc.observer.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:57
 * Version ：1.0
 * Description:
 */
public class SubejectOne extends Subjec {
    void re(Observer observer) {
        observers.add(observer);
    }

    void rm(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    void nt(String msg) {
        for (Observer observer:observers){
            observer.Update(msg);
        }
    }
}
