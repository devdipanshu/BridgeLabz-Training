import java.util.*;

class TaskRunner extends Thread{

    TaskRunner(String name){
        super(name);
    }

    public void run(){
        try{
            Thread.sleep(2000);
            for(int i=0;i<1000000;i++){}
        }catch(Exception e){}
    }
}

class StateMonitor extends Thread{

    Thread t1,t2;
    Map<String,Set<Thread.State>> stateMap=new HashMap<>();

    StateMonitor(Thread t1,Thread t2){
        this.t1=t1;
        this.t2=t2;
    }

    public void run(){
        while(true){
            monitor(t1);
            monitor(t2);

            if(t1.getState()==Thread.State.TERMINATED &&
               t2.getState()==Thread.State.TERMINATED){
                break;
            }

            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

        System.out.println("Summary:");
        stateMap.forEach((k,v)->
            System.out.println(k+" went through "+v.size()+" states")
        );
    }

    void monitor(Thread t){
        stateMap.putIfAbsent(t.getName(),new HashSet<>());
        Thread.State state=t.getState();
        stateMap.get(t.getName()).add(state);
        System.out.println("[Monitor] "+t.getName()+
        " is in "+state+" state at "+new Date());
    }
}

public class ThreadStateMonitoringSystem{
    public static void main(String[] args) throws Exception{

        TaskRunner t1=new TaskRunner("Task-1");
        TaskRunner t2=new TaskRunner("Task-2");

        StateMonitor monitor=new StateMonitor(t1,t2);

        System.out.println("[Monitor] Task-1 is in "+t1.getState());
        System.out.println("[Monitor] Task-2 is in "+t2.getState());

        monitor.start();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        monitor.join();
    }
}
