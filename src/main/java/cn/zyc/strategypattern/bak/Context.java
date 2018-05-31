package cn.zyc.strategypattern.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:38
 * Version ：1.0
 * Description: 上下文 环境 主要是去执行所有做的事情,做一个中转去执行不同的策略
 */
public class Context {
    private Top top;

    public Context(Top top) {
        this.top = top;
    }

    public int execuRs(int arg0,int arg1){
        return  top.math(arg0,arg1);
    }
}
