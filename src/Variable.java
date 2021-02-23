public class Variable {

    /**
    *  TODO Java是区分大小写的
    * 关键字和标示符都是区分大小写的
    * 类名必须与文件名一致，包括大小写要求
    * 使用变量时，名字必须与声明变量时的标示符大小写一致
    * 方法体也区分大小写。main 和Main  是两个名字
    * 类型也区分大小写  int 是数据类型  Int则不是
    * System.out.println 可以被Java认识，SYStem.out.println 就不可以
    * */


    public static void main(String[] args){//方法体  代码块
        int a = 3; //两个表达式（定义变量和变量赋值） 一个语句
        int b = 5; // int 是关键字 b：标示符 =：运算符 5：字面值
        int c = 6;

        int x = 9;

        int y = a*x + b + c + x;

        int variable; //一个表达式
        variable = 999; //一个表达式  一个语句

        System.out.println(y);
        System.out.println(variable);

    }
}



