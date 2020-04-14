package Maven1;
//
public class FizzBuzz {
    public static void main(String[] args){
        // 見出し表示の出力
        System.out.println("実行例");

        for(int i = 1; i <= 150; i++) {
            System.out.println(output(i));
        }
    }

        public static String output(int i){
        // 3かつ5で割り切れるとき
        if((i % 3 == 0) && (i % 5 == 0)) {
            return ("FizzBuzz");
         // 3で割り切れるとき
        }else if(i % 3 == 0) {
            return ("Fizz");
         // 5で割り切れるとき
        }else if(i % 5 == 0) {
            return ("Buzz");
         // それ以外のとき
        }else return (Integer.toString(i));
    }
}