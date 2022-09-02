package Assignment2;

import java.util.Arrays;

class Subject {
    private final String title;
    private final short internalMarks;
    private final short theoryMarks;

    public Subject(String title, int internalMarks, int theoryMarks) {
        this.title = title;
        this.internalMarks = (short) internalMarks;
        this.theoryMarks = (short) theoryMarks;
    }

    @Override
    public String toString() {
        return "\n\t\tSubject{" +
               "title='" + title + '\'' +
               ", internalMarks=" + internalMarks +
               ", theoryMarks=" + theoryMarks +
               "}";
    }
}

class Student {
    private final short roll;
    private final String name;
    private final String stream;
    private final String college;
    private final Subject[] subjects;

    public Student(int roll, String name, String stream, String college, Subject[] subjects) {
        this.roll = (short) roll;
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.subjects = subjects;
    }

    public Student(int roll, String name, String stream, String college) {
        this(roll, name, stream, college, null);
    }

    @Override
    public String toString() {
        return "Student{" +
               "\n\troll=" + roll +
               ", \n\tname='" + name + '\'' +
               ", \n\tstream='" + stream + '\'' +
               ", \n\tcollege='" + college + '\'' +
               ", \n\tsubjects=" + Arrays.toString(subjects) +
               "\n}";
    }
}

public class Student8 {
    public static void main(String[] args) {
        Student s1 = new Student(
                457,
                "Oskar Roy",
                "Computer Science",
                "ANU School of Computing",
                new Subject[]{
                        new Subject("Microprocessor", 9, 78),
                        new Subject("Database Management System", 9, 78),
                        new Subject("Image Prepossessing", 9, 78),
                        new Subject("Mathematics", 9, 78),
                        new Subject("Physics", 9, 78),
                        new Subject("English", 9, 78),
                }
        );
        Student s2 = new Student(
                108,
                "Amelia Smith",
                "Fine Arts",
                "Canberra Arts School",
                new Subject[]{
                        new Subject("Portrait Painting", 9, 78),
                        new Subject("Illustrations", 9, 78),
                        new Subject("History of Arts", 9, 78),
                        new Subject("Environmental Education", 9, 78),
                }
        );

        Student s3 = new Student(
                346,
                "Shehab Eldin",
                "Business Administration",
                "BIS Faculty of Commerce"
        );

        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }
}
