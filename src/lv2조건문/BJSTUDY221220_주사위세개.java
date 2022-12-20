package lv2조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJSTUDY221220_주사위세개 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && b == c) {
            System.out.println(a * 1000 + 10000);
        } else if(a == b) {
            System.out.println(a * 100 + 1000);
        } else if(a == c) {
            System.out.println(a * 100 + 1000);
        } else if(b == c) {
            System.out.println(b * 100 + 1000);
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
    }
}
