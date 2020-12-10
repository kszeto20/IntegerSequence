import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence (int[] other) {
    data = other;
    currentIndex = 0;
  }

  public ArraySequence (IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    otherseq.reset();
    for (int i = 0; i < data.length; i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }

  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return (data.length);
  }

  public boolean hasNext() {
    if (currentIndex < data.length){
      return true;
    }
    else{
      return false;
    }
  }

  public int next() {
    if (this.hasNext()) {
      int oldCur = data[currentIndex];
      currentIndex++;
      return oldCur;
    }
    else {
      throw new NoSuchElementException("No such element. You're the end of the range");
    }
  }
}
