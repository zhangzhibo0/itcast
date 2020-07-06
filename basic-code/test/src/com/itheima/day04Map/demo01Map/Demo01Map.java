package com.itheima.day04Map.demo01Map;

/*
    java.util.Map<k,v>集合
    Map集合特点：
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合的元素，key和value的数据可以相同，也可以不同.
        3.Map集合中的元素,key是不允许重复的，value是可以重复的.
        4.Map集合中的元素,key和value是一一对象

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表，查询的速度特别的快
            JDK 1.8之前：数组+单项链表
            JDK 1.8之后：数组+单项链表/红黑树(链表长度不超过8):提高查询的速度
       2.hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap特点：
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代顺序)
        2.LinkedHashMap集合是一个有序集合,存储元素和取出元素的顺序是一致的

 */

/*
      1.  public V put(K key, V value); 把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候，key不重复,返回值V是null
                存储键值对的时候，key重复,会使用心得value替换map中的重复的value,返回被替换的value值

       2.public V remove(Object key); 把指定的键 所对应的键值对 元素 在Map集合中删除，返回被删除元素的值.
            返回值:v
                key存在，v返回被删除的值
                key不存在，v返回null
       3.public V get(Object key) 根据指定键，在Map集合中获取对应的值.
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
       4.boolean containsKey(Object key)判断结合中是否包含指定的键.
            包含返回true,不包含返回false

 */

import java.util.Map;
import java.util.HashMap;


public class Demo01Map {
    public static void main(String[] args) {

        show02();
    }

    /*
        boolean containsKey(Object key)判断集合中是否包含指定的键.
        包含返回true,不包含返回false
     */
    private static void show04(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        boolean v1 = map.containsKey("赵丽颖");
        System.out.println(v1);

        boolean v2 = map.containsKey("赵兴");
        System.out.println(v2);
    }

    /*
        public V get(Object key) 根据指定键，在Map集合中获取对应的值.
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
    private static void show03(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Integer v1 = map.get("杨颖");
        System.out.println(v1);

        Integer v2 = map.get("迪丽热巴");
        System.out.println(v2);
    }


    /*
        public V remove(Object key); 把指定的键 所对应的键值对 元素 在Map集合中删除，返回被删除元素的值.
            返回值:v
                key存在，v返回被删除的值
                key不存在，v返回null
     */
    private  static void show02(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);

        Integer v1 = map.remove("林志玲");
        System.out.println(v1);
        System.out.println(map);

        Integer v2 = map.remove("林志颖");
        System.out.println(v2);
    }


    /*
        public V put(K key, V value); 把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候，key不重复,返回值V是null
                存储键值对的时候，key重复,会使用新的value替换map中的重复的value,返回被替换的value值
     */
    private static void show01(){
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨","范冰冰1");
        System.out.println("v1" + v1);

        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2" + v2);

        System.out.println(map);

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("伊志平","小龙女");

        System.out.println(map);
    }
}
