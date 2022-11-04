package lv2조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJSTUDY221104_시험성적 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if(90 <= a && a <= 100) System.out.println("A");
        else if(80 <= a && a <= 89) System.out.println("B");
        else if(70 <= a && a <= 79) System.out.println("C");
        else if(60 <= a && a <= 69) System.out.println("D");
        else System.out.println("F");
    }
}
