public class Practice {
    public static void main(String[] args) {
      pzz(2);
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre " + n);
        pzz(n-1);
        System.out.println("In " + n);
        pzz(n-1);
        System.out.println("Post " + n);
    }

}
