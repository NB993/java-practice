package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperationEx {

  public static void main(String[] args) {
    //sort()
    CustomClass customClass1 = new CustomClass(1);
    CustomClass customClass2 = new CustomClass(2);
    CustomClass customClass3 = new CustomClass(3);
    CustomClass customClass4 = new CustomClass(4);
    CustomClass customClass5 = new CustomClass(5);

//    Stream<CustomClass> stream = Stream.of(customClass2, customClass1, customClass5,
//     customClass4, customClass3);
    Stream<CustomClass> stream = Stream.of(customClass5,
        customClass4, customClass3);
    stream.sorted().forEach(System.out::println);
  }
}
