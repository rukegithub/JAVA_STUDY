package lv41차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJSTUDY230108_X보다작은수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(x > tmp) {
                sb.append(tmp + " ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}