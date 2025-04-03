
class stringjava {
    public int calc(int s){
        return s;
    }

    public stringjava(){
        super();
        System.out.println("we are in class stringjava");
    }

    public stringjava(int d){
        super();
        System.out.println("we are in class stringjava d");
    }
   
}




class xox extends stringjava {
    public int mult(int a , int b){
        return a*b;
    }   

    public  xox(){
        super();
        System.out.println("we have called xox class");
    }

    public xox(int c){
        this();
        System.out.println("we are in class xox c");
    }
}

public class javainheritence {
    public static void main(String[] args) {
        xox u = new xox(5);
        //System.out.println(u.mult(2,5));
        //System.out.println(u.calc(5));;

    }

    
}