package interviewoffer;

public class Demo03_1 {
    public  int find(int[] number,int start,int end){
        while(end>=start){
            int middle = ((end-start)>>1) + start;
            int count = binearSearch(number,start,middle);
            if(end == start){
                if(count>1)
                    return start;
                else
                    break;
            }
            if(count>(middle-start+1))
                end = middle;
            else
                start = middle + 1;
        }
        return -1;
    }
    public int binearSearch(int[] number,int start,int end){
        int count = 0;
        for(int i=0;i<number.length;i++){
            if(start<=number[i]&&number[i]<=end)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Demo03_1 demo03_1 = new Demo03_1();
        int result = demo03_1.find(new int[]{2,3,5,4,3,2,6,7},1,7);
        System.out.println(result);
    }
}
