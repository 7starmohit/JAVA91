

@FunctionalInterface
interface jb {

   void fos();
   //void cc();    
}

public class tim {

    public static void main(String[] args) {
        jb vv = new jb() {
            public void fos(){
                System.out.println("we are done");
          } 
            
        };

        vv.fos();
    
        
    }
    

}
