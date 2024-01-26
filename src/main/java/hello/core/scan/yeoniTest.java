package hello.core.scan;

import java.io.InputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yeoniTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("두 번째 숫자");
        int num2 = Integer.parseInt(sc.nextLine());

        if(num1 < 1 || num2 < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }

        // Swap 패턴 -> A와 B를 바꿔주는 방법
        // ★★★★★외워라! -> 꼬리 물기 패턴으로!!
        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }

    }
}
