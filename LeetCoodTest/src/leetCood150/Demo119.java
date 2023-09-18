package leetCood150;

import java.util.ArrayList;
import java.util.List;

public class Demo119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> rowList=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    rowList.add(1);
                }else{
                    rowList.add(list.get(j-1)+list.get(j));
                }
            }
            list=rowList;
        }
        return list;
    }
}
