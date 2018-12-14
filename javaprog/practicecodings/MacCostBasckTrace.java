package practicecodings;

import java.util.ArrayList;

public class MacCostBasckTrace {

    public static ArrayList<Point> maxCost(int[][] c) {
        ArrayList<Point> pt = new ArrayList<Point>();
        int i, j, k, count=0;
        int cost=0;
        for (i = c.length - 1; i > 0;) {
            for (j = c[0].length - 1; j > 0; ) {
                if (((k = i + j) & 1) == 0) {
                    int mask = 2, l = 2;
                    while (l < 32 && (k & mask) >= 0 && count <= 1) {
                        mask = 1 << l;
                        l++;
                        count++;
                    }

                }
                System.out.println("ss");
                if (count == 1) {
                    cost+=c[i][j];
                    pt.add(new Point(i, j));
                    System.out.println("1d");
                    i--; j--;
                } else if (c[i][j - 1] > c[i - 1][j]) {
                    cost+=c[i][j-1];
                    pt.add(new Point(i, j - 1));
                    j--;
                    System.out.println("2d");
                } else {
                    cost+=c[i-1][j];
                    pt.add(new Point(i - 1, j));
                    i--;
                    System.out.println("3d");
                }
            }
        }
        for(i=0; i<pt.size(); i++)
        {
            System.out.println("("+pt.get(i).getI()+","+pt.get(i).getJ()+")-->"+c[pt.get(i).getI()][pt.get(i).getJ()]);
        }
        System.out.println(cost);
        return pt;
    }

    public static void main(String[] args) {
        int[][] p=new int[][]{{1,2,3,1},{4,5,6,1},{7,8,9,1},{1,1,1,1}};
        maxCost(p);
        
    }

    private static class Point {

        private int i, j;

        public Point() {
            i = 0;
            j = 0;
        }

        public Point(int im, int jm) {
            i = im;
            j = jm;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

    }
}
