package test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * @progarm: JAVAmaven
 * @package: test
 * @description:
 * @author: Mr.chen
 * @create: 2023-01-27 20:10:36
 **/
public class Thread01 {
    List<Employee> emps = Arrays.asList(
            new Employee(101,"张三",18,9999),
            new Employee(102,"李四",59,6666),
            new Employee(103,"王五",28,3333),
            new Employee(104,"赵六",8,7777),
            new Employee(105,"田七",38,5555)
            );
    @Test
    public void test1(){
        Collections.sort(emps,(e1,e2)->{
            if (e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee emp:emps) {
            System.out.println(emp);
        }
    }


}
