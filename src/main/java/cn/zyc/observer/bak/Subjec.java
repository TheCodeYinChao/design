package cn.zyc.observer.bak;

import java.util.ArrayList;
import java.util.List;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:55
 * Version ：1.0
 * Description:
 */
public abstract class Subjec {
    protected List<Observer> observers = new ArrayList<Observer>();

    abstract void re(Observer observer);
    abstract void rm(Observer observer);
    abstract void nt(String msg);
}
