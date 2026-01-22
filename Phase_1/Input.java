import java.util.Scanner;

class Input {
    // public static void main(String[] args) {
    //     Scanner sc =  new Scanner(System.in);

    //     System.out.println("Enter the price pls: ");
    //     int price = sc.nextInt();
    //     System.out.println("The price is : " + price);
    // }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Enter the current number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }
    }

}
