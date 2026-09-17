class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aarya";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Priya";
        s2.marks = 81;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Nasrin";
        s3.marks = 75;

        Student[] students = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

//        for(int i = 0; i < students.length; i++) {
//            System.out.println(students[i].name + ": " + students[i].marks);
//        }
        for(Student s : students) {
            System.out.println(s.name + ": " + s.marks);
        }

        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 6;
        nums[3] = 3;

//        for(int i = 0; i < 4; i++) {
//            System.out.println(nums[i]);
//        }
        for(int n : nums) {
            System.out.println(n);
        }
    }
}

