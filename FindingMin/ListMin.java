import java.util.ArrayList;

public class ListMin
{
    // write the findMin() method here:
    public static int findMin(ArrayList<Integer> nums)
    { 
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++)
        { 
            if (nums.get(i) < min)
            { 
                min = nums.get(i);
            } // end if statement 
        } //end for loop 
        return min; 
    } //end findMin method
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(12);
        list.add(0);
        list.add(9);

        System.out.println("Min: " + findMin(list));
    }
}