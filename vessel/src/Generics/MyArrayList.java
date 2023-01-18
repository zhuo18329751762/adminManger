package Generics;

import java.util.Arrays;

/*
   当在编写一个类时，如果不确定类型，那么这个类型就可以定义为泛型类
    */
public class MyArrayList<E> {
   Object[] obj=new Object[10];
   int size;

   public boolean add(E e){
       if (size==10){
           return  false;
       }
       obj[size]=e;
       size++;
       return true;
   }
   public E get(int index){
       return (E)obj[index];
   }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
