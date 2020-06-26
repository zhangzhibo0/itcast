package com.itheima.day04Map.demo06JDK9;


/*
    JDK9 新特性：
        List，Set,Map 接口：里边增加了一个静态方法of,可以给集合一次性添加多个元素
        static <E> List<E> of (E... elements)
        使用前提:
            当集合中存储的元素的个数已经确定了，不在改变时使用
        注意：
            1.of方法只适用于List,Set,Map接口，不适用于接口实现类
            2.of方法的返回值是一个不能改变的结合，集合不能再用add,put方法添加元素,会抛出异常
            3.Set接口和Map接口在调用of方法时候，不能用重复元素,否侧会抛出异常
 */
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","a");
        System.out.println(list);
        //list.add("w");  UnsupportedOperationException:不支持操作异常

        Set<String> set = Set.of("a","b","c");
        System.out.println(set);
        //Set<String> set = Set.of("a","b","a");   IllegalArgumentException: duplicate element: a 非法参数异常，有重复的元素
        //Set.add("w") UnsupportedOperationException:不支持操作异常

        Map<String,Integer> map = Map.of("张三",18,"李四",18,"王五",20);
        System.out.println(map);
        //Map<String,Integer> map = Map.of("张三",18,"李四",18,"王五",20,"张三",20); IllegalArgumentException: duplicate key: 张三
        //map.put("赵兴",30)  UnsupportedOperationException:不支持操作异常

    }
}
