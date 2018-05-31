package cn.zyc.factory.bak2;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 17:10
 * Version ：1.0
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car bm = simpleFactory.createCar("bm");
        bm.driver();
    }
}
