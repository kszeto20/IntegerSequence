import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start;
  private int end;
  private int current;

  public Range(int startVal, int endVal){
    start = startVal;
    current = startVal;
    end = endVal;
  }

  public void reset() {
    current = start;
  }

  public int length() {
    return (end - start + 1);
  }

  public boolean hasNext() {
    if (current <= end) {
      return true;
    }
    return false;
  }

  public int next() {
    if (this.hasNext()) {
      int oldCur = current;
      current++;
      return oldCur;
    }
    else {
      throw new NoSuchElementException("No such element. You're the end of the range");
    }
  }
}
