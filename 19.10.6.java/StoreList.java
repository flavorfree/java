public class StoreList {
    public static void main(String args[]){
         System.out.println("-------------------------------商城库存清单"
         +"------------------------------");
         System.out.println("品牌信号      尺寸      价格             配置                   库存数");
         String macBrand = "MacBrandAir";
         double macSize = 13.3;
         double macPrice = 6988.88;
         String macConfig = "i5处理器4GB内存128G固态硬盘";
         int macCount = 5;
         System.out.println(macBrand+"   "+macSize+"   "+macPrice+"   "+macConfig+"       " +macCount);
         System.out.println("-----------------------------------"
         +"------------------------------------");
         int totalCount = macCount;
         double totalMoney =macCount * macPrice;
         System.out.println("总库存数：" + totalCount);
         System.out.println("库存商品总金额：" + totalMoney);
    }
}