import java.util.Random;

public class l3problem1 {

    public static int sumOfHeights(int []heights){
        int sum=0;
        for(int i=0; i< heights.length;i++){
            sum+=heights[i];
        }
        return sum;
    }
    public static double meanHeight(int[]heights){
        double totalHeights = sumOfHeights(heights);
        return totalHeights/heights.length;
    }
    public static int shortestHeight(int[]heights){
        int shortest = heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]<shortest){
                shortest = heights[i];
            }
        }
        return shortest;
    }
    public static int tallestHeight(int[]heights){
        int tallest = heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]>tallest){
                tallest = heights[i];
            }
        }
        return tallest;
    }
    public static void main(String[]args){
        Random rand = new Random();
        int[]heights = new int[11];

        for(int i=0; i<heights.length; i++){
            heights[i]=rand.nextInt(100)+150;
        }
        int totalHeights = sumOfHeights(heights);
        System.out.println("The sum of heights of all the football players are :"+ totalHeights);

        double totalMean = meanHeight(heights);
        System.out.println("The mean of heights of all the football players are :"+ totalMean);

        int shortestPersonHeight = shortestHeight(heights);
        System.out.println("The smallest of heights of all the football players are :"+ shortestPersonHeight);

        int tallestPersonHeight = tallestHeight(heights);
        System.out.println("The tallest of heights of all the football players are :"+ tallestPersonHeight);

    }
}


