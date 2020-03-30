package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {

    int[] array = {20,13,25,60,12,1,3,14,16,7};
    int max = array[0];
    for(int i = 1; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    System.out.println(max);
    }
}
