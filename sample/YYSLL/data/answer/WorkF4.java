public class WorkF4 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    System.out.println("数値aを入力してください：");
    int a = scanner.nextInt();
    
    System.out.println("数値bを入力してください：");
    int b = scanner.nextInt();
    
    int sum = a + b;
    int difference = a - b;
    int product = a * b;
    int quotient = a / b;
    
    System.out.println("a + b = " + sum);
    System.out.println("a - b = " + difference);
    System.out.println("a * b = " + product);
    System.out.println("a / b = " + quotient);
    
    scanner.close();
  }
}