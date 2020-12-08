public class IntSeqTester {
  public static void main (String[] args) {
    IntegerSequence r = new Range(10,20);
    while(r.hasNext()){
      System.out.print(r.next());
       if( r.hasNext() )
          System.out.print( ", " );
    }
    System.out.println();


    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }
}
