public class CountString {
    public static void main(String[] args) {
        String s = "Jsp123@$&";
        // System.out.println(s.codePointAt(0));
        int aCount = 0;
        int dCount = 0;
        int sCount = 0;
        for (int i = 0; i <= s.length() - 1; i++)
        {
            // if(s.charAt(i)>=65&&s.charAt(i)<=122)
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                aCount++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                dCount++;
            } else {
                sCount++;
            }
        }
        System.out.println(aCount);
        System.out.println(dCount);
        System.out.println(sCount);
    }
    
    //     if(s[i]>=49&&s[i]<=57)
}
