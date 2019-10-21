package generics;

import net.bytebuddy.implementation.bind.annotation.Super;

import java.util.ArrayList;
import java.util.List;

public class ChildClassesGenericExample <T>{
    public static void addInstanceToList(List <? super GrandChildClass> classes) {
        classes.add(new GrandChildClass());
        classes.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<SuperClass> superClassList = new ArrayList<SuperClass>();
        List<ChildClass> childClassList = new ArrayList<ChildClass>();
        List<GrandChildClass> grandChildClassList = new ArrayList<GrandChildClass>();

        addInstanceToList(superClassList);;
        addInstanceToList(childClassList);
        addInstanceToList(grandChildClassList);
    }
}

class SuperClass {
    @Override
    public String toString() {
        return "Super class";
    }
}

class ChildClass extends SuperClass {
    @Override
    public String toString() {
        return "Child class";
    }
}

class GrandChildClass extends ChildClass {
    @Override
    public String toString() {
        return "Grand Child class";
    }
}