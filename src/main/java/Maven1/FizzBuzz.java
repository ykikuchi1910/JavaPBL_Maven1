package Maven1;

public class FizzBuzz {
// 3で割り切れる = Fizz
// 5で割り切れる = Buzz
// 3でも5でも割り切れる = FizzBuzz
    public static void main(String[] args){
        // 見出し表示の出力
        System.out.println("実行例");
        String printout ;
        for(int i = 1; i <= 150; i++) {
            // 変数printoutを初期化
            printout = "";
            // 3かつ5で割り切れるとき
            if((i % 3 == 0) && (i % 5 == 0)) {
                printout = "FizzBuzz";
                // 3で割り切れるとき
            } else if(i % 3 == 0) {
                printout = "Fizz";
                // 5で割り切れるとき
            } else if(i % 5 == 0) {
                printout += "Buzz";
                // それ以外のとき
            } else {
                printout = "" + i;
            }
            System.out.println(printout);
        }
    }
}