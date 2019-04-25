package cn.zyc.chain;

public class Test {

    public static void main(String[] args) {

        HandlerOne one = new HandlerOne();
        HandlerTwo two = new HandlerTwo();

        one.nextHandler(two);
//        two.nextHandler(one);
        one.executeHandler();
    }
}
