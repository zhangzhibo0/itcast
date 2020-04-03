package cn.itcast.day07.demo04;

public class Demo01Array {

    public static void main(String[] args) {

        Person[] array = new Person[3];
        Person array1 = new Person("赵兴", 26);
        Person array2 = new Person("赵兴1" ,29);
        Person array3 = new Person("赵兴2" ,23);


        array[0] = array1;
        array[1] = array2;
        array[2] = array3;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        System.out.println(array[0].getName());


    }
}
