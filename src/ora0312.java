
import java.util.Scanner;
public class ora0312 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kérem az első medve életerejét es sebzését");
    int hp1= scanner.nextInt();
    scanner.nextLine();
    int sebzes1= scanner.nextInt();
        System.out.println("Kérem a Második medve életerejét es sebzését");
        int hp2= scanner.nextInt();
        scanner.nextLine();
        int sebzes2= scanner.nextInt();
scanner.nextLine();
        while (hp1>0 || hp2>0){
           hp1=hp1 - sebzes2;
           hp2=hp2-sebzes1;
        }if (hp1<0){
            System.out.println("A második medve nyert");
        }if (hp2<0){
            System.out.println("Az első medve nyert");
        }
        else{
            System.out.println("döntetlen");
        }

        }
    }


sadf


