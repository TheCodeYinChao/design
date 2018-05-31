package cn.zyc.statepattem.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:51
 * Version ：1.0
 * Description:
 */
public class Close extends State {
    void start() {
        super.context.setState(Context.RUN);
        super.context.getState().start();
    }

    void run() {
        super.context.setState(Context.RUN);
        context.getState().run();
    }

    void close() {

    }
}
