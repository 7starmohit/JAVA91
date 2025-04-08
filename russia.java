interface ss{
    void fop();
     
}
interface d{
    void fopp();
}
interface g {
    void h();
}
interface j extends g,d,ss {

      
}



class v implements ss,d,j {
    public void fop(){
        System.out.println("we are in class ss");
    }
    public void fopp(){
        System.out.println("we are in class d");
    }
    public void h(){
        System.out.println("we are in class j");
    }
}



public class russia {
    public static void main(String[] args) {
       j cod = new v();
        cod.fop();
        cod.fopp();
        cod.h();
    }
    
}
