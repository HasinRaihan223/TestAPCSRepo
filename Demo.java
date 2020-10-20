public class Demo {
  public static void main(String[] args) {
     if(args.length > 0) {
       int n = Integer.parseInt(args[0]);
       printLoop(n);
     }
     else printLoop(5);
   }

   public static void printLoop(int n){
     for(int i = 1; i <= n; i++){
       for(int j = i; j<= n; j++){
          System.out.print(i);
       }
      System.out.println();
     }
   }
}
