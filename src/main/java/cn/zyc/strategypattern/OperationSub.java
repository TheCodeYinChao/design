package cn.zyc.strategypattern;

/**
 * User: zyc
 * Date: 2018-05-18
 * Time: 20:07
 * Version ：1.0
 * Description:
 */
public class OperationSub implements Strategy {
    public int doOperatiom(int num1, int num2) {
        return num1-num2;
    }
}
