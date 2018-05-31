package cn.zyc.factory.bak1;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 17:04
 * Version ：1.0
 * Description:
 */
public class StaticFactory {
    //静态工厂方法
    public static String re()throws Exception{
        return new String("我艹，我写个中文试试 ".getBytes("gbk"));
    }

    public static void main(String[] args)throws Exception {
        String re = StaticFactory.re();
        System.out.println(re);
    }
}
