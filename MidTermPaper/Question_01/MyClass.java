package mcs_3E.DSA.MidTermPaper.Question_01;

import java.time.chrono.MinguoDate;

public class MyClass {

    Employee[] list=new Employee[50];
    int record=0;
    // part 1:
    void add(Employee e){
        System.out.println(e.id);
        if(record==list.length-1){
            System.out.println("Out of Memory");
        }
        else {
            list[record]=e;
            record++;
        }
    }
    // part 2:
    int count(){
        return record;
    }
    // part 3
    void remove(int id){
        for (int i=0; i<record;i++){
            if(list[i].id==id){
                int j=i;
                while (j<record-1){
                    list[j]=list[j+1];
                    j++;
                }
                record--;
                System.out.println("Record Deleted Successfully");
            }
        }
    }
    // part 4
    Employee maxPaid(){
        Employee emp=list[0];
        for (int i=1; i<record;i++){
            if(emp.salary<list[i].salary){
                emp=list[i];
            }
        }
        return emp;
    }

    void display(){
        for(int i=0; i<record;i++){
            System.out.println(list[i].id);
        }
    }

}
