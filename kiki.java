

enum ddtv{
    pedeator(1000),AsuZephyrus(2000),MSIKatana,Alienware(1800);
    private int i;
    private ddtv(int i){
        this.i = i;
    }
    private ddtv(){
        this.i = 2500;
    }
    public int getval(){
        return i;
    }
}


public class kiki {
    public static void main(String[] args) {
        for(ddtv d :ddtv.values()){
            System.out.println(d.getval());
        }
    }

}
