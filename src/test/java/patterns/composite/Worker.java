package patterns.composite;

public class Worker implements Employee {

    private String name;
    private Integer happiness;

    public Worker(String name, Integer happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    @Override
    public void showHappiness() {
        System.out.println(name + " showed happiness level of " + happiness);
    }
}
