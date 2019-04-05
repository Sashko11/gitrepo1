import java.util.Scanner;
public class Zadacha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = 0, c = 0;
        int mass [] = new int[4];
        for(int i=0; i<4; i++){
            mass[i] = scanner.nextInt();
            if(mass[i]%2==0) b++;
            if (mass[i]%2!=0)c++;
        }
        if(c>0 & b>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

