import java.util.HashMap;
import java.util.Map;

public class Demo2 {
        public int lengthOfLongestSubstring(String s) {
            // 记录字符上一次出现的位置
            int[] last = new int[128];
            for(int i = 0; i < 128; i++) {
                last[i] = -1;
            }
            int n = s.length();

            int res = 0;
            int start = 0; // 窗口开始位置
            for(int i = 0; i < n; i++) {
                int index = s.charAt(i);
                start = Math.max(start, last[index] + 1);
                res   = Math.max(res, i - start + 1);
                last[index] = i;
            }

            return res;
        }

        private static int getLength(int startIdex, char[] chars, int maxLength) {
            Map<String, Integer> temMap = new HashMap<>();
            for (int i = startIdex; i < chars.length; i++) {
                char code = chars[i];
                if (((HashMap<?, ?>) temMap).containsKey(String.valueOf(code))) {
                    maxLength = Math.max(maxLength, (i - startIdex));
                    if (i == chars.length - 1) {
                        break;
                    }
                    return getLength(i, chars, maxLength);
                }
                temMap.put(String.valueOf(code), i);
                if (i == chars.length - 1) {
                    return maxLength = Math.max(maxLength, (i - startIdex));
                }
            }
            return maxLength;
        }
    }
