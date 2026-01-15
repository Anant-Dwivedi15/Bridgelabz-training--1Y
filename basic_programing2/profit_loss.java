import java.util.Scanner;

class profit_loss{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int costprice = sc.nextInt();
 int selling_price = sc.nextInt();
 int profitper = (costprice - selling_price)/100;
 System.out.println(profitper);

}
}