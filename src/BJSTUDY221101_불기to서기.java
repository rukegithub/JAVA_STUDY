import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJSTUDY221101_불기to서기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputYear = Integer.parseInt(br.readLine());
        System.out.println(inputYear - 543);
    }
}