package lec77_java_coding_challenge;

import java.util.ArrayList;
import java.util.List;

public class J02_PlayWithArrayList {

	public static void main(String[] args) {
		final List<String> list = new ArrayList<>(1);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.remove(2);
		System.out.println(list);

	}

}
