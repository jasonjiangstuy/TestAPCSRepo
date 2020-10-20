public class Demo {
    public static void main(String [] args){
        int a = 5;
        if (args.length > 0){
            a = Integer.parseInt(args[0]);
        }
        hold1(a);
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
}
