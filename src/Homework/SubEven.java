package Homework;

public class SubEven {

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};

        for(int i=1;i<arr.length;i++)

        {
            if(arr[i]%2==0)
            {
               arr[i]=arr[i]-1;
            }
        }
        System.out.println("Modified array");
        for(int bc:arr)
        {
            System.out.printf(bc + " ");
        }

    }
}
