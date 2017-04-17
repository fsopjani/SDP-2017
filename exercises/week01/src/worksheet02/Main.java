package worksheet02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by fatos on 18/02/2017.
 */
public class Main {
    // this scenario caters for both 1 and 2 questions on worksheet02.
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        System.out.println("Welcome, please type ahead the class you'd wish know more about!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String in = scanner.nextLine();
            if (in.equalsIgnoreCase("exit"))
                break;
            System.out.println("You entered : " + in);
            String input = in.contains("worksheet02.") ? in : "worksheet02.".concat(in);

            if (input.equalsIgnoreCase("worksheet02.MyFirstClass")) {
                Class aClass = Class.forName(input);

                System.out.println("The class name is: " + aClass.getSimpleName());
                Optional<String> classInterface = Stream.of(aClass.getInterfaces()).map(Class::getSimpleName).findAny();
                if (classInterface.isPresent()) {
                    System.out.println("This class has an interface: " + classInterface.get());
                }
            } else if (input.equalsIgnoreCase("worksheet02.MySecondClass")) {
                Class bClass = Class.forName(input);
                System.out.println("The class name is: " + bClass.getSimpleName());

                List<String> conArgs = Stream.of(bClass.getDeclaredConstructors())
                        .flatMap(c -> Stream.of(c.getParameterTypes()))
                        .map(Class::getSimpleName)
                        .collect(Collectors.toList());

                conArgs.forEach(System.out::println);
                Constructor con = bClass.getConstructor(String.class,String.class,Integer.TYPE);
                MySecondClass mySecondClass = (MySecondClass) con.newInstance("str1","str2",10);
                System.out.println("mySecondClass = " + mySecondClass.toString());
            }
            else {
                System.out.println("Could not find this class!");
            }
        }
    }
}
