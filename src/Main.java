public class Main
{public static void main(String[] args) {
    int score = 2000;
    int transfer = 10000;
    int amount = transfer>2000 ? 1 : 0;
      if (transfer>2000)
           amount = 1;
    int bonus = (amount * (transfer/100))/100;
    int sum = bonus + (score + transfer)/100;
    System.out.println(bonus);
    System.out.println(sum);
    }
}
