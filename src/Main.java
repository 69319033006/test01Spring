//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

import.java.util.stream.Collectors;


void main() {
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    d1.setname("Late");
    d1.setBreed("Siberain Husky");
    d1.setAge(3);
    IO.print(String.format("Hello my name's"+d1.getName()));
    IO.print(String.format("my breed is"+d1.getBreed()));
    IO.print(String.format(" i'm "+d1.getAge()+" years old"));
    d1.run();
    d1.bark(3);
    Bicycle bike1 = new Bicycle();
    bike1.move();
    bike1.stop();
    MotoBike moto1 = new MotoBike();
    moto1.pushStart();
    moto1.move();
    moto1.stop();
    CreditPaymant man1 = new CreditPaymant();
    PromptPay man2 = new PromptPay();

//    man1.pay(120);
//    man2.pay(120);

    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("kiwi");
    fruits.add("pieApple");
    IO.println(String.format(fruits.get(0)));
    fruits.set(1,"Mango"); //เปลี่ยนจาก Banana เป็น Mango
    IO.println(String.format(fruits.get(1)));
    fruits.remove("orange");
    IO.println(String.format(fruits.get(2)));
    System.out.println("จำนวนผลไม้: " + fruits.size());
    for (String fruit : fruits){
        System.out.println(fruit);
    }

    Map<Integer, String> employee = new HashMap<>();
    employee.put(101, "สมชาย");
    employee.put(102, "สมหญิง");
    employee.put(103, "ประชาย");
    employee.put(101, "สมชาย ใจดี");

    System.out.println("พนักงานรหัส 102 คือ: " + employee.get(102));
    System.out.println("พนักงานรหัส 101 คือ: " + employee.get(101));

    System.out.println("พนักงานรหัส 103 ไหม? " + employee.containsKey(103));
    employee.remove(103);
    System.out.println("จำนวนพนักงานทั้งหมด: " + employee.size());
    for (Map.Entry<Integer, String> entry : employee.entrySet()){
        System.out.println("รหัส: " + entry.getKey() + ",ชื่อ: " + entry.getValue());


    Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        System.out.println("มีสี Green ไหม? " + colors.contains("Green"));

        colors.remove("Blue");

        for (String coler : colors){
            System.out.println("สี: " + coler);
        }


    List<String> filteredName = employee.stram()
            .filter(e -> e.getSalary() > 2000)
            .map(e -> e.getName().toUpperCase())
            .sorted()
            .collect(Collectors.toList());





    }
}
