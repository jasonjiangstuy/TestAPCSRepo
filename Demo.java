public class Demo {
    public static void main(String [] args){
        int a = 5;
        if (args.length > 0){
            a = Integer.parseInt(args[0]);
        }
        hold1(a);

        // testing - make sure of comment out before submititng
        // int[] testSingle = new int[5];
        // System.out.println(arrToString(testSingle));
        // int[][] testDouble = new int[5][5];
        // System.out.println(arrayDeepToString(testDouble));
        // System.out.println(arrayDeepToString(testDouble).replace("},", "},\n"));

        // // 0 rows
        // System.out.println(arrayDeepToString(create2DArray(0, 0, 1)).replace("},", "},\n"));
        // // 0 columns
        // System.out.println(arrayDeepToString(create2DArray(1, 0, 1)).replace("},", "},\n"));

        
        // // 3 rows 2 col   0-4
        // System.out.println(arrayDeepToString(create2DArray(3, 2, 4)).replace("},", "},\n"));


        // // 3 rows 0 - 5 col   0-4
        // System.out.println(arrayDeepToString(create2DArrayRandomized(3, 5, 4)).replace("},", "},\n"));



    }
    public static void hold1(int x){
        for (int i= 1 ; i <= x; i++){
            for (int j=x-i+1; j<= x; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void hold2(){
        hold1(5);
    }  

    public static String arrToString(int[]arr){
        if (arr.length < 1){
            return "{}";
          }
        String sum = "{";
        for (int i = 0; i< arr.length; i++){
        sum += arr[i]+ ", "; 
        }
        sum = sum.substring(0, sum.length() - 2);
        sum += '}';
        return sum;
    }

    public static String arrayDeepToString(int[][]arr){
        if (arr.length < 1){
            return "{}";
          }
        String sum = "{";
        for (int i = 0; i< arr.length; i++){
            sum += arrToString(arr[i])+ ", "; 
            }
        sum = sum.substring(0, sum.length() - 2);
        sum += '}';
        return sum;  
    }
    
    public static int[][]create2DArray(int rows, int cols, int maxValue){
        
        int [][] myFinal = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for(int x = 0; x < cols; x++){
                myFinal[i][x] = (int)(Math.round(maxValue * Math.random()));
            }
        }
        return myFinal;
    }

    public static int[][]create2DArrayRandomized(int rows, int cols, int maxValue){
        int [][] myFinal = new int[rows][];
        for (int i = 0; i<rows; i++){
            int [] hold = new int[(int)(Math.round(cols * Math.random()))];
            for (int x = 0; x < hold.length; x ++){
                hold[x] = (int)(Math.round(maxValue * Math.random()));
            }
            myFinal[i] = hold;
        }
        return myFinal;
    }
}
