import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student students [] = {
                new Student("Уханов Алексей Александрович", 2021, "ул. Проспект Строителей", "+79053677326", 2, "Dota 2"),
                new Student("Лапицкий Даниил Владимирович", 2019, "ул. Карпинского", "+79042691369", 2, "Спорт"),
                new Student("Черентаев Никита Михайлович", 2021, "ул. Вяземского", "+79062231514", 2, "Программирование")
                
        };
        Student.DisplayFIO(students);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название факультета: ");
        String input = scanner.nextLine();
        Student.DisplayOnFaculty(input, students);
        System.out.println();

        System.out.print("Введите год: ");
        int input2 = scanner.nextInt();
        Student.DisplayAfterYear(input2, students);
    }
}
class Student
{
    private String FIO;
    private int DateOfReceipt;
    private String Address;
    private String PhoneNumber;
    private int Course;
    private String Faculty;
    Student(String FIO, int DateOfReceipt, String Address, String PhoneNumber, int Course, String Faculty)
    {
        this.FIO = FIO;
        this.DateOfReceipt = DateOfReceipt;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Course = Course;
        this.Faculty = Faculty;
    }
    public String getFIO()
    {
        return this.FIO;
    }
    public void setFIO(String FIO)
    {
        this.FIO = FIO;
    }
    public void setDateOfReceipt(int DateOfReceipt)
    {
        this.DateOfReceipt = DateOfReceipt;
    }
    public String getAddress()
    {
        return this.Address;
    }
    public String getPhoneNumber()
    {
        return this.PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }
    public void setCourse(int Course)
    {
        this.Course = Course;
    }
    public String getFaculty()
    {
        return this.Faculty;
    }
    public static void DisplayFIO(Student students [])
    {
        System.out.println("ФИО всех студентов:");
        for(Student student : students) {
            System.out.println(student.FIO);
        }
    }
    public static void DisplayOnFaculty(String fac, Student students [])
    {
            for (Student student : students){
                if(student.Faculty.equals(fac)) {
                    System.out.printf("ФИО: %s\n", student.FIO);
                    System.out.printf("Факультет: %s\n", student.Faculty);
                }
            }
    }
    public static void DisplayAfterYear(int inputYear, Student students [])
    {
        for (Student student : students)
        {
            if(student.DateOfReceipt > inputYear)
            {
                System.out.printf("ФИО: %s\n", student.FIO);
                System.out.printf("Год поступления: %s\n", student.DateOfReceipt);
            }
        }
    }
}