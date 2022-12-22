package lv3반복문;

import java.io.*;

public class BJSTUDY221222_더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();   // n=0
        String a, b, result = "";
        int cnt = 0;

        if(Integer.parseInt(n) < 10) {
            n = "0" + n;
        }

        while(true) {
            if(cnt == 0) {
                result = n; // result=00
            }
            cnt++;      // cnt=1
            if(Integer.parseInt(result) < 10) {
                result = "0" + Integer.toString(Integer.parseInt(result));  // result=00
            }
            a = result.substring(0, 1); // a=0
            b = result.substring(1);    // b=0
            String add = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));    // add=0
            if(Integer.parseInt(add) < 10) {
                add = "0" + add;    // add=00
            }
            sb.append(b);   // sb=0
            sb.append(add.substring(1));  // sb=00
            if(n.equals(sb.toString())) {   //
                break;
            }
            result = sb.toString();  //
            sb.setLength(0);
        }
        bw.write(cnt + "\n");
        bw.close();
    }
}