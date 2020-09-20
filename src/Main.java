public class Main
{public static void main(String[] args) {
    int score = 2000;
    int transfer = 10000;
    int bonus = 0;
     if (transfer>1000){
        bonus = transfer/100;
    }
    int sum = (score + transfer)/100 + bonus;
    System.out.println(bonus);
    System.out.println(sum);
    }
}
