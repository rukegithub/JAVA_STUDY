package lv2조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJSTUDY221104_알람시계 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if((m - 45) >= 0) m = m - 45;
        else {
            m = 60 - (45 - m);
            h--;
            if(h < 0) {
                h = 24 + h;
            }
        }
        System.out.println(h + " " + m);
    }
}
