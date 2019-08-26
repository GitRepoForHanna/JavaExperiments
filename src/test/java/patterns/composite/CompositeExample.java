package patterns.composite;

public class CompositeExample {

    public static void main(String[] args) {
        Worker workerTom = new Worker("Worker Tom", 5);
        Worker workerJack = new Worker("Worker Jack", 7);

        Supervisor supervisorAntony = new Supervisor("Supervisor Antony", 6);
        Supervisor supervisorMarry = new Supervisor("Supervisor Marry", 7);
        Supervisor supervisorBob = new Supervisor("Supervisor Bob", 9);

        supervisorMarry.addSubordinate(workerTom);
        supervisorAntony.addSubordinate(workerJack);
        supervisorBob.addSubordinate(supervisorAntony);
        supervisorBob.addSubordinate(supervisorMarry);

        supervisorBob.showHappiness();
    }

}
