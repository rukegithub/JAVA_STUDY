package lv3반복문;

import java.io.*;
import java.util.StringTokenizer;

public class BJSTUDY221221_빠른A더하기B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int a, b = 0;

        for(int i = 0 ; i < t ; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        bw.close();
    }
}