package mcs_3E.DSA.MidTermPaper.Question_02;

public class MyFunctions {

    Result[] std=new Result[50];
    int record=0;
    void add(Result r){
        std[record]=r;
        record++;
    }

    Result search(int roll_num){
        Result s=new Result();
        for (int i=0; i<record;i++){
            if(std[i].roll_num==roll_num){
                s=std[i];
            }
        }
        return s;
    }

    void passedCandidate(){
        for(int i=0; i<record;i++){
            if(std[i].marks>=50){
                System.out.println("Roll No: "+std[i].roll_num);
                System.out.println("Marks: "+std[i].marks);
            }
        }
    }
}
