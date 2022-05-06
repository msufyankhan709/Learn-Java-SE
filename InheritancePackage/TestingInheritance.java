package InheritancePackage;

public class TestingInheritance extends Cars {
    public static int Sum(int k) {
        if(k==1){
            return 1;
        }
        else{
            return k* Sum(k-1);
        }
    }
    public static void main(String[] args) {
        TestingInheritance d=new TestingInheritance();
        d.Tyres(args);
        d.Gares(args);
        d.Seats(args);
        System.out.println(Sum(5));
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
              System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();  
           }  
    }

    
}
