public class WorkF1 {
    public static void main(String[] args) {
        // 変数を宣言・初期化する
        int x = 5;
        int y = 10;
        
        // 加算
        int sum = x + y;
        System.out.println("加算結果: " + sum);
        
        // 減算
        int diff = x - y;
        System.out.println("減算結果: " + diff);
        
        // 乗算
        int product = x * y;
        System.out.println("乗算結果: " + product);
        
        // 除算
        int quotient = x / y;
        System.out.println("除算結果: " + quotient);
        
        // 余り
        int remainder = x % y;
        System.out.println("余り: " + remainder);
        
        // インクリメント
        x++;
        System.out.println("xのインクリメント結果: " + x);
        y++;
        System.out.println("yのインクリメント結果: " + y);
        
        // デクリメント
        x--;
        System.out.println("xのデクリメント結果: " + x);
        y--;
        System.out.println("yのデクリメント結果: " + y);
    }
}