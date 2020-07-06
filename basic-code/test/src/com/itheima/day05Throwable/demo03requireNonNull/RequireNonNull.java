package com.itheima.day05Throwable.demo03requireNonNull;

import java.util.Objects;

/*
    Objects类中静态方法
    public static <T> requireNonNull(T obj):查看指定引用对象是不是null.
    源码:
        public static <T> requireNonNull(T obj){
            if( obj == null){
                throw new NullPointerException();
            return obj;
            }
         }

 */
public class RequireNonNull {
    public static void main(String[] args) {

    method(null);

    }
    public static void method(Object obj ){
/*        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"空指针异常");*/
        if( obj == null){
            throw new NullPointerException("空指针异常");
        }
    }
}
