package by.academy.homework.homewrok7.Task1;


import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambda {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Long> list = Stream.generate(() -> (long) rand.nextInt(101)).limit(100)
				.map((x) -> (long) (x * Math.PI - 20)).filter((x) -> x < 100).distinct().sorted().skip(3)
				.collect(Collectors.toList());
		Map<Long, String> map = list.stream().collect(Collectors.toMap((x) -> x, (x) ->("Number: " + x)) );
	}

}
