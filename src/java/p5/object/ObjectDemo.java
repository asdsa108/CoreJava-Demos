package p5.object;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Mc on 2016/12/3.
 */
class ObjectDemo {
    public static void main(String[] args) {
        //Object类的equals方法比较两个对象是否是同一对象，如果没有重写该方法，则与==的作用相同
        Employee employee1 = new Employee("Jim", 8000, new Date());
        Employee employee2 = new Employee("Jim", 8000, new Date());
        System.out.println(employee1.equals(employee2));//false
        System.out.println(employee1 == employee2);//false
        //employee1 = employee2;
        //System.out.println(employee1.equals(employee2));//true
        //System.out.println(employee1 == employee2);//true

        //为了避免有对象为null的情况，我们可以调用Objects.equals(Object,Object)方法
        System.out.println(Objects.equals(employee1, employee2));//false
    }
}
