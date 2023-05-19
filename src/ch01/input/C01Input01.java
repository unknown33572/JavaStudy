package ch01.input;

import java.io.IOException;

public class C01Input01 {

	public static void main(String[] args) throws IOException {

		System.out.print("입력: ");
		
		int x=System.in.read();
		
		System.out.println(x);
	}

}
