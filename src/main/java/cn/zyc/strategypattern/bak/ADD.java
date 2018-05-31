package cn.zyc.strategypattern.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:41
 * Version ：1.0
 * Description:
 */
public class ADD implements Top {
    public int math(int arg0, int arg1) {
        return arg0 + arg1;
    }
}
