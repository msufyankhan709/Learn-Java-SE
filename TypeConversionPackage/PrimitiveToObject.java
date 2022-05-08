package TypeConversionPackage;

/**
 * Java Program to convert primitive types to objects and vice versa
 *  */ 

public class PrimitiveToObject {
    public static void main(String[] args) {
        int var1=10;
        double var2=20.2;
        float var3=30;
        Integer obj1=Integer.valueOf(var1);
        Double obj2=Double.valueOf(var2);
        Float obj3=Float.valueOf(var3);

        if(obj1 instanceof Integer){
            System.out.println("It is a Integer value.");
        }
        if(obj2 instanceof Double){
           System.out.println("It is a Float value.");
        }
        if(obj3 instanceof Float){
            System.out.println("It is a Float value.");
        }
    }
}
