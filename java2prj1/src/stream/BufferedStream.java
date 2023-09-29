package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class BufferedStream {

	public static void main(String[] args) throws IOException {

		BufferedReader r = new BufferedReader( new FileReader("src/stream/test.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str= "";
		while( (str = r.readLine()) != null) {		// r을 읽어서 str이라하고 그게 null이 아니면 list에 str 추가
			list.add(str);
		}
		System.out.println("ArrayList의 크기 : " + list.size());
		Stream<String> stream = list.stream();
		
		long count = stream.filter(s -> s.equals("박태민")).count();
		System.out.println("박태민 이/가 나온 횟수 : " + count);
	}

}
