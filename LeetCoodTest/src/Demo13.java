public class Demo13 {
    /*
    罗马数字转换为整数
     */
    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }
    /*
    力扣解法
     */
    public static int romanToInt1(String s){
        int sum = 0;
        int preNum = 0;

        for (int i = 0; i < s.length(); i++) {
            int cur = getValue(s.charAt(i));
            if (cur > preNum) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = cur;
        }
        sum += preNum;

        return sum;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    //------------------------------------------------------------------------------------------
    public static  int romanToInt(String s) {
        String[] arr={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int num=0;
        boolean flag=true;
        for (int i = 0; i < s.length()-1; i++) {
                String s1 = s.charAt(i) + "";
                String s2 = s1 + s.charAt(i + 1);
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals(s1)) {
                        num += nums[j];
                        break;
                    } else if (arr[j].equals(s2)) {
                        if(i==s.length()-2){
                            flag=false;
                        }
                        num += nums[j];
                        i++;
                        break;
                    }
                }
            }
        if(flag) {
            String s1 = s.charAt(s.length() - 1) + "";
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(s1)) {
                    num += nums[j];
                    break;
                }
            }
        }
        return num;
    }
}
