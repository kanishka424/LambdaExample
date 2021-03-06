import org.w3c.dom.ls.LSOutput;

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


//==========HOW TO CALL doStuff() WITHOUT LAMBDA,USING ANONYMOUS CLASSES===========
//       String sillyString= doStuff(new upperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1+s2;
//            }
//        },employees.get(0).getName(),employees.get(1).getName());
//
//
//        System.out.println(sillyString);



 //=========================================doStuff() WITH LAMBDA=================================================================
//        String sillyString= doStuff((String s1,String s2)-> s1+s2,employees.get(0).getName(),employees.get(1).getName());//MY WORK CORRECT BUT REPLACES WITH TIM'//no return needed



        //=========================================doStuff() WITH LAMBDA TIM=================================================================

        UpperConcat uc=(s1,s2)-> s1+s2;//no "return " keyword need since single statment and we can assign lambdas to variables and can reuse
//        UpperConcat uc=(s1,s2)-> //with multiple lines
//        {String result=s1+s2;     //use curly brace and "return" if you have more than one statement in your lambda
//        return result;};
        String sillyString= doStuff(uc,employees.get(0).getName(),employees.get(1).getName());


        System.out.println(sillyString);
   }





    public static String  doStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
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


interface UpperConcat{
    public String upperAndConcat(String s1,String s2);
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
