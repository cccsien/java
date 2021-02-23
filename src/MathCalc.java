public class MathCalc {


    /**
     * 运算符优先级
     * （）
     * !
     * *,/,%
     * +,-
     * >,>=,<,<=
     * ==
     * !=
     * &,&&,|,||
     * =
     * */

    /**
     * 数据类型的自动转换
     * 1.自动类型转换
     *  ~ 编程语言可以做自动类型转换，比如低精度的数字向高精度的数字转换
     *  ~ 自动类型转换可以发生在算数运算，也可以发生在赋值
     *
     *  2.数值精度顺序： double > float > long > int > short > byte
     *
     *  3. char 可以转换成int
     *     虽然是两个不同的byte，但是因为 char 是无符号数，值域超出了short 可以表示的范围，所以不可以自动转换为 short
     * */

    public static void main(String[] args){

        System.out.println(5+6);
        System.out.println(5-6);
        System.out.println(5*6);
        System.out.println(5/6.0);
        System.out.println(1+2-3*4/5.0);

    }


}
