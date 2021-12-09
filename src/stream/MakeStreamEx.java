package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.swing.JInternalFrame;

public class MakeStreamEx {

  public static void main(String[] args) {
    Stream<String> strStream = Stream.of("a", "b", "c"); //가변인자
    Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "d"});

    //배열로 stream을 만들 때 Arrays.stream()를 써도 됨.
    Stream<String> strStream3 = Arrays.stream(new String[]{"a"});

    //Stream을 리턴하는 메서드들이 많다.
    IntStream intStream =  new Random().ints(1, 10);
    intStream.limit(5).forEach(e -> System.out.println(e));

    Stream<Integer> evenStream = Stream.iterate(0, n -> n += 2).limit(10);
    evenStream.forEach(System.out::println); //최초 값인 0도 stream 요소에 포함.

    Stream<Integer> firstStream = Stream.of(1, 2, 3);
    Stream<Integer> secondStream = Stream.of(4, 5, 6);
    Stream<Integer> concatStream = Stream.concat (firstStream, secondStream);
    concatStream.forEach(System.out::println);

  }

}
