package Roman2Interger;

public class Roman2Interger {
    //
//    private static final int[] NUMBER_DICT = new int[26];
//
//    static {
//        NUMBER_DICT['I' - 'A'] = 1;
//        NUMBER_DICT['V' - 'A'] = 5;
//        NUMBER_DICT['X' - 'A'] = 10;
//        NUMBER_DICT['L' - 'A'] = 50;
//        NUMBER_DICT['C' - 'A'] = 100;
//        NUMBER_DICT['D' - 'A'] = 500;
//        NUMBER_DICT['M' - 'A'] = 1000;
//    }
//
//    public int romanToInt(String s) {
//        char[] array = s.toCharArray();
//        int sum = 0, curInt = 0, nextInt = NUMBER_DICT[s.charAt(0) - 'A'];
//        for (int i = 0; i < array.length - 1; i++) {
//            curInt = nextInt;
//            nextInt = NUMBER_DICT[array[i + 1] - 'A'];
//            if (curInt < nextInt) {
//                sum -= curInt;
//                continue;
//            }
//            sum += curInt;
//        }
//        sum += nextInt;
//        return sum;
//    }
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                ans -= nums[i];
            } else ans += nums[i];
        }
        return ans + nums[nums.length - 1];
    }


}
