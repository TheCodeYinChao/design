package cn.zyc.strategypattern.bak;

/**
 * User: zyc
 * Date: 2018-05-30
 * Time: 16:42
 * Version ：1.0
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ADD());
        int i = context.execuRs(2, 3);
        System.out.println(i);
    }
}
