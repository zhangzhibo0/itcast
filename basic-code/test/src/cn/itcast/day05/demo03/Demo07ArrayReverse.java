package cn.itcast.day05.demo03;

public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int [] array = new int[]{10,20,30,40,50,60,70};
        System.out.print("交换前： ");
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        for( int min = 0,max = array.length-1; min < max
        ; min++ , max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        System.out.println();
        System.out.print("交换后： ");
        for( int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
