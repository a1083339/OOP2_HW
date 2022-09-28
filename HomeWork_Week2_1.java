import java.util.Random;
import java.util.TreeSet;

public class HomeWork_Week2_1 {
    public static void main(String[] args) throws Exception {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i=1;i<=10;i++){
            Random r = new Random();
            int num = r.nextInt(99) + 1;
            if (tree.contains(num)==false) {
                tree.add(num);
            }else{
                i--;
            }
            System.out.println("第"+i+"個號碼:"+num);
        }
        System.out.println("物件內元素個數為" + tree.size());
        System.out.println("物件內元素的內容" + tree);
        System.out.println("第一個元素內容為" + tree.first());
        System.out.println("最後一個元素內容為" + tree.last());
        System.out.println("內容介於30~70者" + tree.subSet(30,true, 70,true));
    }
}
