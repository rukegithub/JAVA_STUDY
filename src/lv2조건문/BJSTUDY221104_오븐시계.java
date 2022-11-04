package lv2조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJSTUDY221104_오븐시계 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        if(m + time < 60) m = m + time;
        else {
            h = (h + (m + time) / 60) % 24;
            m = (m + time) % 60;
        }
        System.out.println(h + " " + m);
    }
}
