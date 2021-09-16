public class JavaApplication18 {


    public static void main(String[] args) {

        System.out.println("Start of " + Thread.currentThread().getName());

        HelloThread thread = new HelloThread();
        thread.start();

        try {
            thread.join();
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("End of main()");
    }

}
