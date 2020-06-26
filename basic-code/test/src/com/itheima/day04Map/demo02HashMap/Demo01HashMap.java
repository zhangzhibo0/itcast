package com.itheima.day04Map.demo02HashMap;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法，以保证key唯一
*/




import java.util.HashMap;
import java.util.Map;



public class Demo01HashMap {
    public static void main(String[] args) {
        show02();
    }


    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类必须重写hashCode方法和equals方法,以保证key唯一
            value:String类型
                可以重复
     */
    private static void show02() {

        HashMap<Person,String> map = new HashMap<>();

        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"中国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");

        //使用entrySet方法和增强for遍历Map集合

        for(Map.Entry<Person,String> entry : map.entrySet()){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }


    /*
        HashMap存储自定义类型键值
        key:String 类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复（同名同年龄人视为同一个）
     */
    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",18));
        map.put("广州",new Person("王五",18));
        map.put("北京",new Person("赵六",18));

        //keySet方法 增强for

        for(String key : map.keySet() ){
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }


}
