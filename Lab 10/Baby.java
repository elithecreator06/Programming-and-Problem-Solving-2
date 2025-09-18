import java.util.Random;

public class Baby implements Runnable{
    private int time;
    private String name;

    Random random = new Random();
    Baby(String userName){
        name = userName;
        time = random.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.println("My name is " + name + " and I am going to sleep for " + time + "ms");
        try{
            Thread.sleep(time);
        }catch(InterruptedException interruptedException){
            System.out.println(interruptedException.getStackTrace());
        }
        System.out.println("My name is " + name + " and I am awake, feed me!!!");
    }
}
