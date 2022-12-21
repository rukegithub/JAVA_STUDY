package lv3반복문;

import java.io.*;
import java.util.StringTokenizer;

public class BJSTUDY221221_A더하기B5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b = 0;

        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) {
                break;
            }
            bw.write((a + b) + "\n");
        }
        bw.close();
    }
}