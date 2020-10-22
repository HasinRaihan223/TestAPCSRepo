public class Demo {
  public static void main(String[] args) {
    //For Hw9
    if(args.length > 0) {
        int n = Integer.parseInt(args[0]);
        printLoop(n);
      }
    else printLoop(5);

    //For Hw10
    /*
    //1D arrays
    int[] ar1 = {2,3,4,5,10,50};
    int[] ar2 = {15};
    int[] ar3 = {0,2,4,6};
    int[] ar4 = {0,1,2,3};
    int[] ar5 = {0,1,2};

    System.out.println(arrToString(ar1));
    System.out.println(arrToString(ar2));
    System.out.println(arrToString(ar3));
    System.out.println(arrToString(ar4));
    System.out.println(arrToString(ar5));
    */

    //2D arrays
    /*
    int[][] ar6 = { {0,1}, {2,3} };
    int[][] ar7 = { {0,1,3}, {-1,2,3}, {5,4,1} };

    System.out.println(arrayDeepToString(ar6).replace("}, ","},\n"));
    System.out.println(arrayDeepToString(ar7).replace("}, ","},\n"));

    System.out.println(arrayDeepToString(create2DArray(3,3,4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(3,3,4)));
    */
   }

   public static void printLoop(int n){
     for(int i = 1; i <= n; i++){
       for(int j = i; j<= n; j++){
          System.out.print(i);
       }
      System.out.println();
     }
   }

   public static String arrToString(int[]arr){
    String empty = "{";
     for (int i = 0; i < arr.length; i++) {
      empty += arr[i];
      if (i != arr.length-1)
      empty += ", ";
     }
    empty += "}";
    return empty;
   }

   public static String arrayDeepToString(int[][]arr){
     String empty = "{";
      for (int i = 0; i < arr.length; i++) {
       empty += arrToString(arr[i]);
       if (i != arr.length-1)
       empty += ", ";
      }
     empty += "}";
     return empty;
   }

   public static int[][] create2DArray(int rows, int cols, int maxValue){
     int values[][] = new int[rows][cols];
     for (int i = 0; i < rows; i++){
       for (int j = 0; j < cols; j++){
          values[i][j] =  (int)(Math.random() * (maxValue+1));
       }
     }
    return values;
   }

   public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
     int[][]arr = new int[rows][];
     for (int i = 0; i < rows; i++){
       arr[i] = new int[(int)(Math.random() * (cols+1))];
       for (int j = 0; j < arr[i].length; j++){
          arr[i][j] =  (int)(Math.random() * (maxValue+1));
       }
     }
    return arr;
   }

}
