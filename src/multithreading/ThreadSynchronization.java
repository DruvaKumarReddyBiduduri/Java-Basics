package multithreading;

public class ThreadSynchronization extends Thread{
    String word;

    public ThreadSynchronization(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        synchronized (word){
            int index= (int) Math.floor(Math.random()*word.length());
            word=word.replace(word.charAt(index),'*');
            System.out.println(word);
        }
    }
}
