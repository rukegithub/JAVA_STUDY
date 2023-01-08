package lv41차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJSTUDY230108_개수세기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
            if(v == ary[i]) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.close();
    }
}