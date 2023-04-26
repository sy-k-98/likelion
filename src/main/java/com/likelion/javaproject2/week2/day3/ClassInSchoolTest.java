package com.likelion.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김경록";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "대한민국";
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s 이며, 주소는 %s입니다.",classInSchool.no, classInSchool.teacher.name, classInSchool.teacher.address);
    }

}
