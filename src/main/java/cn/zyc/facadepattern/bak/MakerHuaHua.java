package cn.zyc.facadepattern.bak;

/**
 * @author zyc
 * @date 2018/6/19 18:32
 * @Description:
 */
public class MakerHuaHua {
    private  Huahua yuan;
    private Huahua fnag;

    public MakerHuaHua() {
        this.yuan = new Yuan();
        this.fnag = new Fang();
    }

    public void yuan(){
        yuan.draw();
    }
    public void fang(){
        fnag.draw();
    }
}
