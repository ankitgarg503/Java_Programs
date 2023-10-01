public class recusion {



    public static void reverse(char s[],int i,int j) {
        if(i>j)
            return;
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
            reverse(s, i, j);

    }
    public static void main(String args[]){
        char p[]={'N','i','t','i','n'};
        for(int i=0;i<5;i++){
            System.out.print(p[i]);
        }
        // reverse(p,0,5);
        System.out.println();
        System.out.println("Reverse a String using Recursion");
      
        reverse(p,0,4);
        for(int i=0;i<5;i++){
            System.out.print(p[i]);
        }
    }
}
