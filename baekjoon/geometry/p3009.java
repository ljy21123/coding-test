
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 네 번째 점
public class p3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] xy1 = br.readLine().split(" ");
        String[] xy2 = br.readLine().split(" ");
        String[] xy3 = br.readLine().split(" ");

        String x;
        String y;

        // x 좌표
        if (xy1[0].equals(xy2[0])) {
            x = xy3[0];
        } else if (xy1[0].equals(xy3[0])) {
            x = xy2[0];
        } else {
            x = xy1[0];
        }

        // y 좌표
        if (xy1[1].equals(xy2[1])) {
            y = xy3[1];
        } else if (xy1[1].equals(xy3[1])) {
            y = xy2[1];
        } else {
            y = xy1[1];
        }

        System.out.println(x + " " + y);

    }

}
