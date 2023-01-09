package til.java.basic.operator;

public class Operator {
    public static void main(String[] args) {
        int num = (1 + 2 == 3 && 4 + 1 * 2 == 6) ? 3 + 4 : 5 + 6;
        System.out.println(num);

        /**
         * 1.곱셈 연산자가 수행됨
         *  int num = (1 + 2 == 3 && 4 + 2 == 6) ? 3 + 4 : 5 + 6;
         *
         * 2.덧셈 연산자가 수행됨
         *  int num = (3 == 3 && 6 == 6) ? 7 : 11;
         *
         *  3. 등가 연산자 수행됨
         *  int num = (true && true) ? 7 : 11;
         *
         *  4. && 연산자 수행됨 (AND 둘 다 조건 성립되어야함)
         *  int num = (true) ? 7 : 11;
         *
         *  5. ? : 조건 연산자가 수행됨
         *  int num = 7;
         *
         *
         *
         *
         *   ! = NOT 연산자 = true와 false를 반대로 바꿈
         *   !true == false
         *   !false == true
         *   !! true == true
         */
    }
}
