class Chef extends Thread{

    String dish;
    int time;

    Chef(String name,String dish,int time){
        super(name);
        this.dish=dish;
        this.time=time;
    }

    public void run(){
        System.out.println(getName()+" started preparing "+dish);
        int step=time/4;
        for(int i=25;i<=100;i+=25){
            try{
                Thread.sleep(step);
            }catch(Exception e){}
            System.out.println(getName()+" preparing "+dish+": "+i+"% complete");
        }
        System.out.println(getName()+" completed "+dish);
    }
}

public class RestaurantOrderProcessing{
    public static void main(String[] args) throws Exception{

        Chef c1=new Chef("Chef-1","Pizza",3000);
        Chef c2=new Chef("Chef-2","Pasta",2000);
        Chef c3=new Chef("Chef-3","Salad",1000);
        Chef c4=new Chef("Chef-4","Burger",2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
