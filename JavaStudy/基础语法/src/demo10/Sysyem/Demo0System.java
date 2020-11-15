package demo10.Sysyem;

public class Demo0System {
    public static void main(String[] args) {
        //currentTimeMillis方法就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
        System.out.println(System.currentTimeMillis());
        //public static void arraycopy
        // (Object src, int srcPos, Object dest, int destPos, int length)`：
        // 将数组中指定的数据拷贝到另一个数组中。
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 0, dest, 0, 3);
        for (int i : dest) {
            System.out.print(i+" ");
        }
    }
}
