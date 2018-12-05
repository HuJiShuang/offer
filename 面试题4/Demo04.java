package interviewoffer;

public class Demo04 {
    public int find(int[][] numbers,int row,int col,int number){
        if(col<0||row>3)
            return 0;
        if(numbers[row][col] == number)
            return 1;
        if(numbers[row][col]>number)
                col = col -1;
        else
                row = row + 1;
        int result = find(numbers,row,col,number);
        if(result == 1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        int result = demo04.find(new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}},0,3,3);
        System.out.println(result);
    }
}
