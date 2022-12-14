public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            int units = i%10; //個
            int tens = (i/10)%10; //十
            int hundreds = (i/100)%10; //百
            System.out.println(i);
            int sum =(int) (Math.pow(units,3) + Math.pow(tens,3) + Math.pow(hundreds,3));
            //
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
