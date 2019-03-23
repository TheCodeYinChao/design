package cn.zyc.facadepattern.bak;

/**
 * Created by Admin on 2018/6/3.
 */
public class DrawMaker {
    private Draw yuan;
    private Draw fang;

    public DrawMaker() {
        this.yuan = new Yuan();
        this.fang = new Fang();
    }

    public  void  yuan(){
        yuan.draw();
    }

    public void fang(){
        fang.draw();
    }
}
