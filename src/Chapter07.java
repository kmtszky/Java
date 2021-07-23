
public class Chapter07 {
    public static void main(String[] args) {
        int distance = 10;
        if (distance <= 5) {
            System.out.println("とても近いです");
        } else if (distance <= 10) {
            System.out.println("近いです");
         } else if (distance <= 15) {
            System.out.println("遠いです");
        } else {
            System.out.println("とても遠いです");
        }
    }
}