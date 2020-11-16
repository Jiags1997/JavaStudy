package Leetcode;

import java.util.*;
/*
    学到的！！！
   Arrays.copyOfRange(T[ ] original,int from,int to)
    将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。
    注意这里包括下标from，不包括上标to。
 */
public class Day01 {

    public static void main(String[] args) {
        int[][] points = new int[][]{{3, 3}, {-2, 4}, {5, -1}};
        int K = 2;

        int[][] ans = kClosest(points, K);
        for (int i = 0; i < K; i++) {
            System.out.println(Arrays.toString(ans[i]));

        }
    }

    /*
        public static int[][] kClosest(int[][] points, int K) {
            List<int[]> list = new ArrayList<>();
            int [][]ans=new int[K][];
            for (int i = 0; i < points.length; i++) {
                list.add(points[i]);
            }
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return (int) ((Math.pow(o1[0],2)+Math.pow(o1[1],2))-(Math.pow(o2[0],2 )+Math.pow(o2[1],2)));
                }
            });
            for (int i = 0; i <K; i++) {
                ans[i]=list.get(i);

            }
            return ans;
        }
     */
    /*
      优先队列方式

     */
    public static int[][] kClosest(int[][] points, int K) {
        //定义一个从队列头开始，从小到大的优先队列
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        //把point的欧氏距离的平方在原来数组的位置存入优先队列中，
        for (int i = 0; i < K; i++) {
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        for(int i=K;i<points.length;i++){
            //计算k+1后的点到原点的欧氏距离dis
            int dis=points[i][0] * points[i][0] + points[i][1] * points[i][1];
            //比较dis 与优先队列对头元素比较，如果dis小，先删除队头元素，再将dis 和在原来数组的位置放入优先队列中。
            if(dis<pq.peek()[0]){
                pq.poll();
                pq.offer(new int[]{dis,i});
            }
        }
        //
        int [][]ans=new int[K][2];
        for (int i=0;i<K;i++){
            ans[i]=points[pq.poll()[1]];
        }
        return ans;

    }
}
