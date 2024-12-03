package Homework;

public class Practice {

    public void abc()
    {
        int [] array1 ={1,2,3,4,5};
        int [] array2 ={1,2,3,4,5};
        int [] combined = new int[array1.length + array2.length];
        for(int i=0;i<array1.length;i++)
        {
            combined[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            combined[array1.length + i] = array2[i];
        }
        for(int combinedarray :combined)
        {
            System.out.print(combinedarray);
        }
    }

    public  static void main(String[] args) {
        Practice array= new Practice();
        array.abc();
    }


}

