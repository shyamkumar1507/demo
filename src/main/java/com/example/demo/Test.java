package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class TGTEmployee implements Comparator<TGTEmployee> {
    private int eid;
    private String zid;
    private long salary;
    private String pyramid;

    public String toString() {
        return "Employee [eid=" + eid + ", zid=" + zid + ", salary=" + salary + ", pyramid=" + pyramid + "]";
    }

    @Override
    public int compare(TGTEmployee o1, TGTEmployee o2) {
        Integer e1 = o1.getEid();
        Integer e2 = o2.getEid();
        return e1.compareTo(e2);
    }
}
public class Test {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        System.out.println("Free memory: "+ ((r.freeMemory()/1024)/1024)+"MB");
        System.out.println("Total memory: "+((r.totalMemory()/1024)/1024)+"MB");
        System.out.println("Available processors: "+r.availableProcessors());
        r.gc();



        TGTEmployee emp1 = new TGTEmployee(3, "Z004NZS", 100000, "Marketing");
        TGTEmployee emp2 = new TGTEmployee(2, "Z005MCP", 200000, "Tech");
        TGTEmployee emp3 = new TGTEmployee(1, "Z014DP2", 300000, "HR");
        TGTEmployee emp4 = new TGTEmployee(4, "Z0SQAC1", 400000, "HR");
        TGTEmployee emp5 = new TGTEmployee(7, "AEFTD1", 500000, "Marketing");
        TGTEmployee emp6 = new TGTEmployee(6, "Z1WQVAQ", 600000, "HR");
        TGTEmployee emp7 = new TGTEmployee(5, "A628WER", 700000, "Tech");
        TGTEmployee emp8 = new TGTEmployee(8, "AQCFP1D", 800000, "Marketing");
        TGTEmployee emp9 = new TGTEmployee(10, "AOPBGD9", 900000, "HR");
        TGTEmployee emp10 = new TGTEmployee(9, "ZKTSNYG", 1000000, "Tech");

        List<TGTEmployee> employeeList =  List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);

        List<TGTEmployee> sortedListByEid = employeeList.stream().sorted(Comparator.comparing(TGTEmployee::getEid)).toList();
        List<TGTEmployee> sortedListByZid = employeeList.stream().sorted(Comparator.comparing(TGTEmployee::getZid)).toList();
        List<TGTEmployee> sortedListBySalary = employeeList.stream().sorted(Comparator.comparing(TGTEmployee::getSalary)).toList();
        List<TGTEmployee> sortedListByPyramid = employeeList.stream().sorted(Comparator.comparing(TGTEmployee::getPyramid, Comparator.reverseOrder())).toList();

        //Apprach 1
        Map<String, List<TGTEmployee>> groupByDept = employeeList.stream().reduce(
                new HashMap<>(),
                (map, employee) -> {
                    map.computeIfAbsent(employee.getPyramid(), k -> new ArrayList<>()).add(employee);
                    System.out.println(".......................");
                    int index =0;
                    for (Map.Entry<String, List<TGTEmployee>> entry : map.entrySet()) {
                        System.out.println(" index:" + ++index +"Key from intermediate: " + entry.getKey() +"Employee id"+ entry.getValue().get(0).getEid() + " Value: " + entry.getValue()) ;
                    }
                    System.out.println(".......................at the end");
                    return map;
                },
                (map1, map2) -> {
                    map2.forEach((key, value) -> map1.merge(key, value, (list1, list2)-> {
                        list1.addAll(list2);
                        return list1;
                    }));
                    return map1;
                }
        );

        //Approach 2

        Map<String, List<TGTEmployee>> groupedEmployees = new HashMap<>();

        employeeList.stream().forEach(employee -> {
            groupedEmployees.computeIfAbsent(employee.getPyramid(), k -> new ArrayList<>()).add(employee);
        });


        for (Map.Entry<String, List<TGTEmployee>> entry : groupByDept.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }


        System.out.println("Sorted list by eid: ");
        for (TGTEmployee employee : sortedListByEid) {
            System.out.println(employee);
        }
        System.out.println("---------------------------");
        System.out.println("Sorted list by Pyramid: ");
        for (TGTEmployee employee : sortedListByPyramid) {
            System.out.println(employee);
        }
    }


}
