package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestReflection {

//    public static void main(String[] args) throws ClassNotFoundException {
//        Class classAnimal = Animal.class;
//        Class classAnimal2 = Class.forName("reflection.Animal");
//        Class classAnimal3 = new Animal("Marusya", "Black", 6).getClass();
//        Animal animal = new Animal("Basya", "Grey", 3);
//
//        System.out.println(classAnimal);
//        System.out.println(classAnimal2);
//        System.out.println(classAnimal3);
//        System.out.println("--------------------------------------------");
//
//        System.out.println("Class name " + classAnimal.getName());
//        System.out.println("Class super class name " + classAnimal.getSuperclass().getName());
//        System.out.println("Interfaces " + Arrays.toString(classAnimal.getInterfaces()));
//        System.out.println("Modifiers " + Arrays.toString(classAnimal.getInterfaces()));
//        System.out.println();
//
//        Field[] fields = classAnimal.getDeclaredFields();
//        System.out.println("Information about fields");
//        Stream.of(fields).forEach(field -> {
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.print("Field " + field.getName());
//            System.out.println(" of type " + field.getType());
//            field.setAccessible(true);
//            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
//            try {
//                System.out.println("Value: " + field.get(animal));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            System.out.println("++++++++++++++++++++++++++++");
//            System.out.println();
//        });
//
//        System.out.println();
//        System.out.println("Information about methods ");
//        Method[] methods = classAnimal.getDeclaredMethods();
//        Stream.of(methods).forEach(method -> {
//            System.out.println("===============================");
//            System.out.println("Method " + method.getName());
//            System.out.println("Returned type " + method.getReturnType());
//            System.out.println("Method access modifiers " + Modifier.toString(method.getModifiers()));
//            System.out.println("Parameters: ");
//            Arrays.stream(method.getParameterTypes())
//                    .map(Class::getName)
//                    .forEach(System.out::println);
//
//            System.out.println("Exceptions: ");
//            Arrays.stream(method.getExceptionTypes())
//                    .map(Class::getName)
//                    .forEach(System.out::println);
//            System.out.println("==============================");
//        });
//
//        System.out.println();
//        System.out.println("Information about comnstructors ");
//        Constructor[] constructors = classAnimal.getConstructors();
//        Stream.of(constructors).forEach(constructor -> {
//            System.out.println("===============================");
//            System.out.println("Modifiers " + Modifier.toString(constructor.getModifiers()));
//            System.out.println("Parameters ");
//            Arrays.stream(constructor.getParameterTypes())
//                    .map(Class::getName)
//                    .forEach(System.out::println);
//            System.out.println("Exceptions ");
//            Arrays.stream(constructor.getExceptionTypes())
//                    .map(Class::getName)
//                    .forEach(System.out::println);
//            System.out.println("==============================");
//        });
//    }
}
