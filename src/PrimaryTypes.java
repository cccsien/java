public class PrimaryTypes {

    /**
     * bit 和 byte
     * bit： 一个二进制的位叫 bit。网络带宽中的单位，都是bit。  宽带100M  那就是 100M的bit
     * 八个二进制位，组成一个byte。硬盘等存储单位，都是byte。 文件大小 啥的都是 byte
     * byte 是计算机中基本的衡量存储的单位，计算机在对外使用时不会用bit作为划分存储的单位
     */

    /**
     * 数据类型
     * 1.整数类型 缺省类型是 int
     *   byte   1 个byte，值域  -128 ~ 127
     *   short  2 个 byte。值域
     *   int    4 个byte，值域  Java中
     *   long   8 个byte，值域
     * 2. 浮点类型  缺省类型是 double
     *    float 4个字节，有精度
     *    double 精度是float的两倍，占用 8个byte
     * 3.布尔和字符类型
     *    Boolean 占用 1个 byte 值域为 true false
     *    char 占用 2个byte ，值域为所有字符
     * */
    public static void main(String[] args){

        //byte 类型， 占用1 个byte，值域  -128 ~ 127
        byte bytevar = 99;
        System.out.println(bytevar);

        //short 类型， 占用2 个byte，值域
        short shortVar = -30000;
        System.out.println(shortVar);

        //int 类型， 占用4 个byte，值域
        int intvar = 30000;
        System.out.println(intvar);

        //long 类型， 占用8 个byte，值域
        long longvar = 999;
        System.out.println(longvar);

        long bigLongVar = 9999999999L;
        System.out.println(bigLongVar);

        // float 4个字节，有精度
        float faloatVar = 100.1F; //little value float
        System.out.println(faloatVar);

        // double 精度是float的两倍，占用 8个byte
        double doubleVar = 100.1;
        System.out.println(doubleVar);

        //Boolean 占用 1个 byte 值域为 true false
        boolean condition =  true;
        System.out.println(condition);

        // char 占用 2个byte ，值域为所有字符
        char ch = 'a';
        System.out.println(ch);







    }
}
