public class ForceConvert {
    /**
     * 强制类型转换  在数据类型前边 加 （数据类型）
     * 1.可能出现问题的类型数据转换，需要使用强制类型转换，比如高精度值向低精度值转换
     * 2.强制类型转换也是操作符
     * 3.强制转换会造成数据精度丢失
     *
     * 数据溢出
     *   1.数值计算一旦溢出，结果将失去原有意义。比如，两个正数会加出负数
     *   2.要对能够处理的值有大概的估计
     *
     * */
    public static void main(String[] args){

        int intVal = 999;
        long longVal = 19999;
        intVal = (int) longVal;

    }


}
