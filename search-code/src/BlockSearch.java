public class BlockSearch {
    public static void main(String[] args) {
        //分块查找
        //块内无序，块间有序

        // 1 创建数组blockArr存放每一个块对象的信息
        // 2 先查找blockArr确定要查找的数据属于哪一块
        // 3 再单独遍历这一块数据即可
        int[] arr={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};
        //分块
        //要分为几块：
        //18开根号4.24
        //18/4=4.5
        //创建三个块的对象
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,15);
        //定义数组用来管理三个块的对象(索引表)
        Block[] blockArr={b1,b2,b3};
        //定义一个变量记录要查找的元素
        int number=52;
        //调用方法，传递索引，数组，要查找的元素
        int index=getIndex(blockArr,arr,number);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr,int[] arr, int number) {
        int index1=findIndexBlock(blockArr,number);
        for(int i=blockArr[index1].getStartIndex();i<=blockArr[index1].getEndIndex();i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    //定义一个方法，用来确定number在哪一块
    public static int findIndexBlock(Block[] blockArr,int number){
        for (int i = 0; i < blockArr.length; i++) {
            if(blockArr[i].getMax()>number){
                return i;
            }
        }
        return -1;
    }
}
class Block{
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
