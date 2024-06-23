package multithreading;

public class Resource {
    int value;
    boolean hasValue=false;

    public synchronized void produce(){
        while (hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }


        this.value=(int)Math.floor(Math.random()*100);
        this.hasValue=true;
        System.out.println(Thread.currentThread().getName()+" Produced a value : "+this.value);
        notifyAll();
    }

    public synchronized void consume(){
        while (!hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        hasValue=false;
        System.out.println(Thread.currentThread().getName()+" Consumed a value : "+this.value);
        notifyAll();
    }
}
