import java.util.*;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> v = new HashSet<>();
        for (int number : nums) {
            if (!v.add(number)) {
                return true;
            }
        }
        return false;  
    }                   

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 1})); 
        System.out.println(hasDuplicate(new int[]{1, 2, 3}));    
        System.out.println(hasDuplicate(new int[]{1, 1, 1}));    
        System.out.println(hasDuplicate(new int[]{}));           
    }                       
}                         
