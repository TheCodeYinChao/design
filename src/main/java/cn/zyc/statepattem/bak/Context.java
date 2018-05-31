package cn.zyc.statepattem.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:45
 * Version ：1.0
 * Description:
 */
public class Context {
    //暴露各种状态
    public static final Close CLOSE = new Close();
    public static final Start START = new Start();
    public static final Run RUN = new Run();
    private State state;
    //设置一个初始化的状态 以及给当前状态赋值上下文环境

    public void setState(State state) {
        this.state = state;
        state.setContext(this);
    }

    //暴露当前状态
    public State getState() {
        return state;
    }

    //运行各个状态
    void open(){
        state.run();
    }
    void start(){
        state.start();
    }
    void end(){
        state.start();
    }

}
