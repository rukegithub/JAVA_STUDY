package lv3반복문;

import java.io.*;
import java.util.StringTokenizer;

public class BJSTUDY221221_A더하기B4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b = 0;
        String input = "";

        while(((input = br.readLine()) != null) && !(input.isEmpty())) {
            st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write((a + b) + "\n");
        }
        bw.close();
    }
}