import java.util.Scanner;

class Scanner1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("출력 문자열:" +s);
        int num = sc.nextInt();
        System.out.println("출력 정수:" + num);
    }
}