package com.telran;
import java.io.IOException;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) throws IOException {
        Point[] points = new Point[nextInt()<<1];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(nextInt(), 1);
            points[++i] = new Point(nextInt(), -1);
        }
        mergeSortIterative(points, 0, points.length, (p1, p2) -> {
            int val = p1.getP() - p2.getP();
            return val == 0 ? -p1.getV() : val;
        });
        int res = countLen( points );
        System.out.println(res);
    }

    public static int countLen( Point[] arr ){
        int  res = 0;
        int count = arr[0].getV();
        Point prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            count += arr[i].getV();
            arr[i].setV(count);
            if ( prev.getV() == 1 && prev.getP() != arr[i].getP() )
                res += arr[i].getP() - prev.getP();
            prev = arr[i];
        }
        return res;
    }

    public static <T extends Object> void mergeSortIterative(T[] arr, int l, int r, Comparator<T> comp) {
        if (l + 1 < r) {
            int m = ( l + r ) >>> 1;
            mergeSortIterative(arr, l, m, comp);
            mergeSortIterative(arr, m, r, comp);

            int len = r - l;
            T[] tmp = (T[]) new Object[len];
            for (int i = 0, j1 = l, j2 = m ; i < len; i++) {
                if ( j2 >= r || j1 < m && comp.compare(arr[j1], arr[j2]) < 0 )
                    tmp[i] = arr[j1++];
                else
                    tmp[i] = arr[j2++];
            }
            System.arraycopy(tmp, 0 , arr, l, len);
        }
    }

    private static int nextInt() throws IOException {
        int d;
        int val = 0;
        while ((d = System.in.read()) == 32) ;
        if (d < 0) return Integer.MIN_VALUE;
        boolean flag = false;
        if (d == '-') {
            flag = true;
            d = System.in.read();
        }
        do {
            val += d - 48;
            if ((d = System.in.read()) < 48 || d > 57) break;
            val *= 10;
        } while (true);
        return flag ? -val : val;
    }

    private static class Point{
        private int p;
        private int v;
        public Point(int p, int v){
            this.p = p;
            this.v = v;
        }
        public int getP() {
            return p;
        }
        public int getV() {
            return v;
        }
        public void setV(int v) {
            this.v = v;
        }
        public void setP(int p) {

            this.p = p;
        }
        @Override
        public String toString() {
            return getP()+"("+getV()+") ";
        }
    }
}