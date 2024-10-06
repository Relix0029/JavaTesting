public class Array {
    public static void main(String[] args){
       
       int age[] = {50, 22, 41, 11, 25, 27};
       int length = age.length;
       int lowestage = age[0];

       for (int i=0; i<age.length; i++){
        if (lowestage > age[i]){
            lowestage = age[i];
        }
       }
       System.out.println ("Lowest Age is:"+lowestage);
        
        }
    
}
