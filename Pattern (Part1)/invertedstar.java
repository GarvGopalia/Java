public class invertedstar {
    public static void main(String[] args) {
        
        int i,j,n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
