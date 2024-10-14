public class AgeVerify{
    public AgeVerify(int vote) throws IllegalAccessException{
        
        try{
            if(vote<=18){
            throw new IllegalAccessException("You must be atleast 18 years of age");
        }
        else{
            System.out.println("You can vote...!");
        }
        }
        catch(Exception e){
            System.out.println("Exception :"+e);
        }
        finally{
            System.out.println("Age Verification is done ");
        }
    
    }
    
   
}