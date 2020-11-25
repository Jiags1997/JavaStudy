package Leetcode.Day04;

import java.util.Arrays;

public class Day04 {
    public static int findMinArrowShots(int[][] points) {

        if(points==null||points.length==0)
            return 0;
        int count=1;//计算需要几只箭才能全部引爆气球，

        Arrays.sort(points,(arr1, arr2)-> arr1[1]>arr2[1] ?1:-1); //按照区间右端点排序
        for (int [] a:points
             ) {
            System.out.println(a[1]);

        }

        int last=points[0][1];//第一个区间最右边的位置赋给last
        for(int i=1;i<points.length;i++){
            if(last<points[i][0]){//更新last
                last=points[i][1];
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        int [][]pointds={{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(findMinArrowShots(pointds));

    }
}
