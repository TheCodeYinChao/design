package cn.zyc.template.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:32
 * Version ：1.0
 * Description: 模板模式的模板类
 */
public abstract  class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    public void play(){
        init();
        start();
        end();
    }
}
