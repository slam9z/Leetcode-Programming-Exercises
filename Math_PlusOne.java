/**
 * Created by yongchizhang on 17/7/13.
 */
public class Math_PlusOne {
    public class Solution {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for(int i = len -1 ; i >=0; i--){
                if(digits[i] < 9){
                    digits[i] ++;
                    return digits;
                }else{
                    digits[i] = 0;
                }
            }
            int[] result = new int[len + 1];
            result[0] = 1;
            return result;
        }
    }
}
