package cn.zyc.chain;

public abstract class Handler {

    Handler handler;
    public void nextHandler(Handler handler){
        this.handler = handler;
    }

    abstract void executeHandler();
}
