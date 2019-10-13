public class p2{
    public static void main(String args[]){
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a,b;//boolean布尔常量，用于区分一个事物的真假，输出ture或flase
        a = x > 0 & y++ > 1;//&不管两边那边错，左右两边都会进行运算
        System.out.println(a);//flase
        System.out.println("y = " + y);//1
        b = x > 0 && z++ > 1;//&&左边错误时，右边表达式不会进行运算
        System.out.println(b);//flase
        System.out.println("z = " + z);//0
    }
}