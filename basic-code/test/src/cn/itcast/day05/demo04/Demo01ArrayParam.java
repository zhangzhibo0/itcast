package cn.itcast.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(array);
        printArray(array);
        swop(array);
        System.out.println();
        printArray(array);
    }

    public static void printArray(int array[]){
        System.out.println("printArray方法收到的参数是:");
        System.out.println(array);
        for( int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    public static void swop(int array[]){
        for(int i = 0, j = array.length-1; i < j;
        i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
