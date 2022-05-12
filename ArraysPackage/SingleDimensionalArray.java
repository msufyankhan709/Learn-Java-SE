package ArraysPackage;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        System.out.println(total);
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
       System.out.println(max);

       /**
        * 
        *  New topic
        */
        String[] arr2=new String[5];
        arr2[0]="Sufyan Khan";
        arr2[1]="Awais Khan";
        arr2[2]="Zeeshan Khan";
        arr2[3]="Numan Khan";
        arr2[4]="Salman Khan";
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
