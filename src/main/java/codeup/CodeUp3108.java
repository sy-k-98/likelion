package codeup;

import java.util.*;

class Student {
    private int testId;
    private String name;

    public Student(int testId, String name) {
        this.testId = testId;
        this.name = name;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(int testId, String name) {
        return new Student(testId, name);
    }

    private boolean isDuplicated(Student st) {
        for (Student student : students) {
            if (st.getTestId() == student.getTestId())
                return true;
        }
        return false;
    }

    private void removeAStudent(Student st) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == st.getTestId())
                students.remove(i);
        }
    }

    private void addAStudent(Student student) {
        if (!isDuplicated(student))
            students.add(student);
    }

    private void printStudents(int[] arr) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
    }

    public void process(String line) {
        String[] str = line.split(" ");
        Student student = makeAStudent(Integer.parseInt(str[1]), str[2]);
        switch (str[0]) {
            case "I" -> addAStudent(student);
            case "D" -> removeAStudent(student);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        CodeUp3108 codeUp = new CodeUp3108();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            codeUp.process(line);
        }

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        codeUp.printStudents(arr);

    }
}
