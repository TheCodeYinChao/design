package cn.zyc.template.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:36
 * Version ：1.0
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Game game = new FootBall();
        game.play();
        game = new BasketBall();
        game.play();
    }
}
