public class p1{
    public static void main(String[] args){
        byte a;
        int b = 298;
        System.out.println("时间");
        a = (byte) b;//强制类型转换，丢失精度，数据丢失，数值发生变化
        System.out.println("b=" + b);//298
        System.out.println("a=" + a);//42
        System.out.println("时间");
    }
}
