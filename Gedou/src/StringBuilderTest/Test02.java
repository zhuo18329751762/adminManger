package StringBuilderTest;

public class Test02 {
    public static void main(String[] args) {
        //至少移动一次
        String A = "abcde";
        String B = "cdeab";
        boolean flag=piPei(A,B);
        System.out.println(flag);
    }

    public static Boolean piPei(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else {
            for (int j = 0; j < A.length()-1; j++) {
                StringBuilder sb = new StringBuilder();
                for (int i = j + 1; i < A.length(); i++) {
                    sb.append(A.charAt(i));
                }
                for (int i = 0; i <= j; i++) {
                    sb.append(A.charAt(i));
                }
                if (sb.toString().equals(B)) {
                    return true;
                }
            }
            return false;
        }
    }
}
