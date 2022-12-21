package lv3반복문;

import java.io.*;

public class BJSTUDY221221_별찍기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++) {
            for(int j = n ; j > i + 1 ; j--) {
                bw.write(" ");
            }
            for(int k = 0 ; k < i + 1 ; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}