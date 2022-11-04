package lv1입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJSTUDY221104_곱셈 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = b / 100;
        int d = (b % 100) / 10;
        int e = (b % 100) % 10;

        System.out.println(a * e);
        System.out.println(a * d);
        System.out.println(a * c);
        System.out.println(a * b);
    }
}