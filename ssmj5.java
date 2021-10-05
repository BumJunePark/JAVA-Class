import java.util.Scanner;

public class ssmj5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨 온도를 입력하세요: ");
        float fahrenheit = sc.nextFloat();
        float celsius = ((float)5 / 9) * (fahrenheit - 32);
        System.out.printf("화씨 %.1f도는 섭씨 %.1f도 입니다.", fahrenheit, celsius);
    }
}
