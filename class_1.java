class Student {
    private String stNo;
    private String name;
    public Student(String stNo, String name) {
        this.stNo = stNo;
        this.name = name;
    }
    public String getStNo() { return stNo; }
    public String getName() { return name; }
    public String toString() {
        return "Name: " + name + ", Student Number: " + stNo;
    }
}

class Book {
    String name;
    String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    String getName() { return name; }
    String getAuthor() { return author; }
}

class Lecturer {
    private String email;
    private String name;
    private String room;
    public Lecturer(String name, String room, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }
    public String getEmail() {return email;}
    public String getName() {return name;}
    public String getRoom() {return room;}
}


class Course { // Course.java
    private final int MAX_STUDENTS = 30;
    private int numEnrolled = 0;
    private Lecturer lecturer;
    private String room;
    private Book ref;
    private Student[] students = new Student[MAX_STUDENTS];
    Course(Lecturer lecturer, String room) {
        this.lecturer = lecturer;
        this.room = room;
    }
    public void setRoom(String room) { this.room = room; }
    public void setBook(Book r) { ref = r; }
    public void enroll(Student s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled] = s;
            numEnrolled++;
        }
    }
    public void drop(Student s) {
        if (numEnrolled > 0) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == s) {
                    for (int j = i + 1; j < students.length; j++)
                        students[j - 1] = students[j];
                    numEnrolled--;
                    break;
                }
            }
        }
    }
    public int getNumEnrolled() { return numEnrolled; }
    public void printEnrolled() {
        for (int i = 0; i < numEnrolled; i++)
            System.out.println(students[i]);
    }
}

class TestCourse {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("김갑돌", "G411",
                "bkim3234829@su.ac.kr");
        Course oo1 = new Course(lecturer, "G412");
        Student s1 = new Student("202011111", "jsl");
        Student s2 = new Student("202011112", "bdk");
        Student s3 = new Student("202011113", "cho");
        oo1.enroll(s1);
        System.out.printf("Num of enrolled Students: %d\n",
                oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of enrolled Students: %d\n",
                oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of enrolled Students: %d\n",
                oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of enrolled Students: %d\n",
                oo1.getNumEnrolled());
        oo1.printEnrolled();
    }
}