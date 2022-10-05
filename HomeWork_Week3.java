import java.util.Random;
public class HomeWork_Week3{
    public static void main(String[] args) {
        tricket_meachine A=new tricket_meachine("售票機A");
        tricket_meachine B=new tricket_meachine("售票機B");
        tricket_meachine C=new tricket_meachine("售票機C");
        tricket_meachine D=new tricket_meachine("售票機D");
    }
}
class tricket_meachine implements Runnable{
    static int total_trickets=10000;
    int sell_tricket=0;
    int sells;
    Thread t;
    public tricket_meachine(String name){
        sell_tricket=0;
        t=new Thread(this,name);
        t.start();
    }
    @Override
    public void run(){
        while(check_tricket(0)){
            Random r = new Random();
            int sells = r.nextInt(4) + 1;  
            if(check_tricket(sells)){
                sell_tricket=sell_tricket+sells;
                System.out.println(t.getName()+"賣出"+sells+"張高鐵票");
            }              
        }
        System.out.println(t.getName()+"總共賣出"+sell_tricket+"張高鐵票");
    }
    synchronized private static boolean check_tricket(int sells){
        if(total_trickets>0 && total_trickets-sells>=0){
            total_trickets=total_trickets-sells;
            return true;
        }else{
            return false;
        }
    }
}