public class rainwater {
    public static void main(String []args){
        int h1=11;
        int h2=7;
        int h3=13;
        int water=Math.min(h1,h3)-h2;
        if(water<0){
            water=0;
        }
        System.out.println("water trapped is :"+water);
    }
}
