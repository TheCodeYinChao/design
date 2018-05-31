package cn.zyc.statepattem.bak;


/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:43
 * Version ：1.0
 * Description:
 */
public abstract class State {
    public Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void start();
    abstract void run();
    abstract void close();
}
