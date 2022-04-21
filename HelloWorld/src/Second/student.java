package Second;

import tinhkethua.Student;

public class student {
     String studentID;
     String name;
     Double point;
    void Student1(String n , String sID){
        name = n;
        studentID = sID;
    }
    void setPoint(String sID, double pnt){
        point = pnt;
    }
    void getPoint(String sID){
        System.out.println("diem cua sinh vien "+ this.name+ " la: " + point);
    }
}

