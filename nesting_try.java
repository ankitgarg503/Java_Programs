



public class nesting_try {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=22;    
        arr[1]=72;    
        arr[2]=92;    
        arr[3]=82;    
        arr[4]=12;    
        try {
            try {
                int p=3/0;
            } 
            catch (Exception e) {
                System.out.println("Error occuring "+e);
            }
            int ans=arr[9];
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Error occuring "+e);
        }
                
    }
}
