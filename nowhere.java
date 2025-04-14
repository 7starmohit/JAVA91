



class mohitexception extends Exception{
    mohitexception(String s){
        super(s);
    }
}


public class nowhere {
    public static void main(String[] args) {

        int i =2;
        int j =0;
        int arr[] = new int[9];
        try{
            j = 14/i;
           // System.out.println(arr[10]);
           if(j==7){
            // throw  new ArithmeticException("thats hapenning>>");
            throw new mohitexception("quantum computing");

           }
           
        }

        catch(mohitexception b){
            j = j-1;
            System.out.println(" at last now weare done"+ b);
        }
        catch(ArrayIndexOutOfBoundsException w){
            j=j+1;
            System.out.println("we are back soon ..."+ w);
    
        }
        catch(ArithmeticException b){
            try{

                if (j==7) {
                    throw new ArithmeticException("we are still trying");
            
                }
            }
            catch(Exception e){
                System.out.println("pooping up"+ e);
            }
           
            System.out.println("trying ..." + b);
        }
        
        
        System.out.println(j);
    
        
    }
   
}
