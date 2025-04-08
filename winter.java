
enum ssd{
    running,pending,failed,sucess;
}


public class winter {
    public static void main(String[] args) {
       // ssd s = ssd.running;
       // System.out.println(s);
       // System.out.println(s.ordinal());
       ssd [] s = ssd.values();
       for( ssd ss : s){
        System.out.println(ss +"  "+ ss.ordinal());
       }
    }
    
}
