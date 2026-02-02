public class Permutations {
    // public static void permute(String str, String ans) {
    //     if (str.length() == 0) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         String ros = str.substring(0, i) + str.substring(i + 1);
    //         permute(ros, ans + ch);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "ABCDEF";
    //     permute(str, "");
    // }
    public static void permute(char[] chars,int start){
        if(start==chars.length-1){
            System.out.println(String.valueOf(chars));
            return;
        }
        for(int i=start;i<chars.length;i++){
            
            char temp=chars[start];
            chars[start]=chars[i];
            chars[i]=temp;

            permute(chars, start+1);

            
            temp=chars[start];
            chars[start]=chars[i];
            chars[i]=temp;
        }

    }
    public static void main(String[] args) {
        String str = "ABC";
        char[] chars = str.toCharArray();
       permute(chars, 0);
    }

}
