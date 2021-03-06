/**
 * Created by yongchizhang on 17/7/4.
 */
public class Bit_highestOneBit {
    /*
    1、第一步的作用是把最高位1右移移位，并与原数据按位取或。那么这就使得最高位和它的下一位是连续两个1。
2、第二步的作用是把刚刚移位得到连续两个1继续右移两位并与原数据按位取或。那么这就使得最高两位和它的下两个连续位组成四个连续的1。
3、 以此类推，最终得到的i是从开始的最高位到结束全是1。并减去i不带符号的右移一位，即可得到一个int数据的最高位的值。
4、上述情况是针对于i不为零和负数的情况，如果i为零，那么得到的结果始终为零。如果i位负数，那么得到的结果始终是-2147483648。即等于Integer.MIN_VALUE。（原因在于负数的最高位始终为1，即是负数的符号位）

此函数的最重要理解点在与要始终把握二进制的最高位进行运算处理，那么对于函数中的右移一位、两位、四位、八和十六位就好理解了。同理，对于long类型的取最高位运算应该需要加一条语句 i|=(i>>32); 原因在于long类型在Java中是64位的。


    * */

    public static int highestOneBit(int i) {
        // HD, Figure 3-1
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        return i - (i >>> 1);
    }

    public static long highestOneBit(long i) {
        // HD, Figure 3-1
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        i |= (i >> 32);
        return i - (i >>> 1);
    }


}
