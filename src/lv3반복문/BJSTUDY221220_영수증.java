package lv3반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJSTUDY221220_영수증 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            result += (a * b);
        }
        if(result == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}