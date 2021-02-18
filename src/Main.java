
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();


        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);



        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {
        int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc,"String1","String2");
    }
}













//================================================MY CODE WORKING++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//import org.w3c.dom.ls.LSOutput;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        Employee Ken=new Employee("Ken Dean",23);
//        Employee Ryu=new Employee("Ryu Tushima",24);
//        Employee Blanka=new Employee("Blanka Greez",30);
//        Employee Bison=new Employee("Bison Calibre",51);
//        Employee Sagate=new Employee("Sagate Fin",43);
//
//        List<Employee> employees=new ArrayList<Employee>();
//        employees.add(Ken);
//        employees.add(Ryu);
//        employees.add(Blanka);
//        employees.add(Bison);
//        employees.add(Sagate);
//
//        for (Employee emp:employees) {
//            System.out.println("employee " + emp.getName());
//        }
//
//        Collections.sort(employees,(emp1,emp2)-> emp1.getName().compareTo(emp2.getName()));
//
//
//
//
//        System.out.println("\t employees list after Collections.sort()");
//        for (Employee emp:employees) {
//            System.out.println("employee " + emp.getName());
//        }
//
//
//
//        AnotherClass anotherClass=new AnotherClass();
//        System.out.println("anotherClass.doSomething() "+anotherClass.doSomething());
//
//
//   }
//
//
//
//
//
//    public static String  doStuff(UpperConcat uc, String s1, String s2){
//        return uc.upperAndConcat(s1,s2);
//    }
//
//
//
//}
//
//class Employee{
//    private String name;
//    private int age;
//
//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//
//interface UpperConcat{
//    public String upperAndConcat(String s1,String s2);
//}
//
//class AnotherClass{
//
//
//
//    public String doSomething() {//with lambdda the below code
//        UpperConcat uc=(s1,s2)-> {
//            System.out.println("Lambda's clas is: "+getClass().getSimpleName());
//            return s1+s2;
//        };
//        System.out.println("The AnotherClass name is "+getClass().getSimpleName());
//
//        return Main.doStuff(uc,"STRING1","STRING2");
//    };
////public String doSomething() {
////    System.out.println("the Another class name: "+getClass().getSimpleName());
////  return Main.doStuff(new UpperConcat() {
////        @Override
////        public String upperAndConcat(String s1, String s2) {
////            System.out.println("Anonymous class " + getClass().getSimpleName());
////            return s1 + s2;
////        }
////    }, "STRING1", "STRING2");
//
////}
//}
//
//
//
//
