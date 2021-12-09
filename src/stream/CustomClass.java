package stream;

public class CustomClass implements Comparable<CustomClass> {

  int numberForComparing;

  public CustomClass(int numberForComparing) {
    this.numberForComparing = numberForComparing;
  }

  @Override
  public int compareTo(CustomClass o) {
    return this.numberForComparing - o.numberForComparing; //sort는 양수가 리턴될 때 둘의 위치가 바뀜.
  }

  @Override
  public String toString() {
    return Integer.toString(numberForComparing);
  }
}
