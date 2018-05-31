package cn.zyc.factory.bak2;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 17:08
 * Version ：1.0
 * Description:
 */
public class SimpleFactory {
    public Car createCar(String type){
        Car car = null;
        if("bm".equals(type)){
            car = new BMCar();
        }
        if("audi".equals(type)){
            car = new AudiCar();
        }
        return car;
    }
}
