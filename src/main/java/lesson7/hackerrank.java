package lesson7;

public class hackerrank {

    public static class Solution {

        // Complete the hurdleRace function below.
        static int hurdleRace(int k, int[] height) {


            int max = height[0];
            for (int i = 1; i < height.length; i++)
                max = Math.max(max, height[i]);

if(k<max){
            return max-k;
}
else return 0;
        }

   /* static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int a=0;
        int b=0;
        int sum_a=0;
        int sum_b=0;
        for (i = 0; i < compareTriplets(a).length; i++)
            if(){
            sum_a += 1;}
        }


        for (i = 0; i < .length; i++)
            if()

    {

        sum_b += 1;
    }
    }*/



    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }*/
}}
