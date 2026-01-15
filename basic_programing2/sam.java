import java.util.Scanner;

class sam{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int maths = sc.nextInt();
	int physics = sc.nextInt();
	int chemistry = sc.nextInt();
	int average = (maths + chemistry + physics)/3;
	System.out.println(average);

}
}