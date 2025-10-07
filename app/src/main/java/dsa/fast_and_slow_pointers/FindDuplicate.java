package dsa.fast_and_slow_pointers;

// this is also known as the toroise and the hare algo
// This is the most important FAANG approach (no extra memory allowed).

// Cannot modify the array and must use O(1) extra space.
// So no sorting or hash sets.

// Time - O(n)
// Space - O(1)
public class FindDuplicate {

   public int findDuplicate(int[] nums) {

      int slow = nums[0];
      int fast = nums[0];

      // Phase 1: find intersection
      while (true) {
         slow = nums[slow];
         fast = nums[nums[fast]];
         if (slow == fast)
            break;
      }

      // Phase 2: find entrance to cycle
      slow = nums[0];
      while (slow != fast) {
         slow = nums[slow];
         fast = nums[fast];
      }

      return slow; // or fast, they’re equal here
   }

   public static void main(String[] args) {

      FindDuplicate solver = new FindDuplicate();

      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };

      int duplicates = solver.findDuplicate(nums);

      System.out.println("Found duplicate number: " + duplicates);
   }
}