public class TestWork {
    public static void main(String[] args){
        int[][] x=new int[12][30];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        int a=60;
        int b=40;
        double c=30;
        double f=(a+b)/c;
        System.out.println(f);
    }
}
