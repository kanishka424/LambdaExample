import java.util.*;

public class Main {
    public static void main(String[] args) {
//        new Thread(()-> {System.out.println("printing inside thread");
//            System.out.println("Line 2 ");
//            System.out.println("This is line ");}).start();

        Employee Ken=new Employee("Ken Dean",23);
        Employee Ryu=new Employee("Ryu Tushima",24);
        Employee Blanka=new Employee("Blanka Greez",30);
        Employee Bison=new Employee("Bison Calibre",51);
        Employee Sagate=new Employee("Sagate Fin",43);

        List<Employee> employees=new ArrayList<Employee>();
        employees.add(Ken);
        employees.add(Ryu);
        employees.add(Blanka);
        employees.add(Bison);
        employees.add(Sagate);

        for (Employee emp:employees) {
            System.out.println("employee " + emp.getName());
        }

        //implementing a Comparataor without lambda
//        Collections.sort(employees, new Comparator<Employee>(){
//            @Override
//            public int compare(Employee emp1,Employee emp2){
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });


        //implementing a Comparataor WITH lambda
        //here we don't have to say  arguments are of the type Employee becuase that can be infer from the list "employees"
        Collections.sort(employees,(emp1,emp2)-> emp1.getName().compareTo(emp2.getName()));




        System.out.println("\t employees list after Collections.sort()");
        for (Employee emp:employees) {
            System.out.println("employee " + emp.getName());
        }



    }



}

class Employee{
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







//------------------------------------EXAMPLE 4 multi line lambda---------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        new Thread(()-> {System.out.println("printing inside thread");
//            System.out.println("Line 2 ");
//            System.out.println("This is line ");}).start();
//    }
//}

//------------------------------------------------EXAMPLE 3 single line lambda----------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        new Thread(()-> System.out.println("printing inside thread")).start();
//    }
//}
//


//-----------------------------------------------------------EXAMPLE 2-------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("printing from thread,no lambda");
//            }
//        }).start();
//    }
//}



//---------------------------------------------EXAMPLE 1--------------------------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        new Thread(new CodeToRun()).start();
//
//    }
//}
//
//class CodeToRun implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("Inside thread");
//    }
//}
