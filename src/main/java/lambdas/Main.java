package lambdas;

public class Main {
    public static void main(String[] args) {

        Runnable task = () -> {
//                new BusinessTaskUpdateCustomerAge().updateStateInDB();
                new BusinessTask(){
                    @Override
                    public void updateStateInDB() {

                    }
                }.updateStateInDB();
                try {
                    Thread.sleep(1000);
                    System.out.println("Massive updates");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

        executeTask(task);
        executeTask(task);
    }

    public static void executeTask(Runnable threadLogic) {
        new Thread(threadLogic).start();
    }
}
