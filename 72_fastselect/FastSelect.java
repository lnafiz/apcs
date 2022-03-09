public class FastSelect{

  public static int[] partitionAtVal(int[] arr, int lo, int hi, int index) {
   int[] ret = new int[arr.length];

   int tracker = 0;
   for (int i : arr) {
     ret[tracker] = i;
     tracker++;
   }
   int valAt = ret[index];
   //
   ret[index] = ret[hi];
   ret[hi] = valAt;
   //
   int swapIndex=lo;
   for (int i=lo; i<hi; i++) {
     if (ret[i] < valAt) {
       int temp = ret[swapIndex];
       ret[swapIndex] = ret[i];
       ret[i] = temp;
       swapIndex++;
     }
   }
   //
   int temp = ret[hi];
   ret[hi] = ret[swapIndex];
   ret[swapIndex] = temp;

   return ret;
 }
 public static void public static void main(String[] args) {

 }
}
