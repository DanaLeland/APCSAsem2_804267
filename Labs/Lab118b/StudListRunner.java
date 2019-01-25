import java.util.Scanner;
public class StudListRunner
{
    public static void main(){
        StudList sl = new StudList();
        Scanner in = new Scanner (System.in);
        String statement = "";
        String name; 
        int num; 
        double gpa;
        double gpaSearch;
        while (!statement.equals("8")){
            System.out.println("Choose an option by entering the corresponding number");
            System.out.println("1: Add student");
            System.out.println("2: Delete student");
            System.out.println("3: Edit student list");
            System.out.println("4: Clear student list");
            System.out.println("5: Print all information");
            System.out.println("6: Print student information");
            System.out.println("7: Sort student list");
            System.out.println("8: Exit");
            System.out.println("9: Find student on list");
            System.out.println();
            statement = in.nextLine();
            if (statement.equals("1")){
                System.out.println("Student name:");
                name = in.nextLine();
                num = inputStudentNum();
                while (sl.studNumAlreadyExists(num)){
                    System.out.println("A student with this student number already exists. Please choose another number.");
                    num = inputStudentNum();
                }
                gpa = inputStudentGPA();
                sl.addStudent(name, num, gpa);
                System.out.println("Student successfully added.");
            }else if (statement.equals("2")){
                int x = inputNumOrString("Last Name");
                if (x == 0){
                    name = "";
                    num = inputStudentNum();
                }else{
                    System.out.println("Student Last Name:");
                    name = in.nextLine();
                    num = 0;
                }
                sl.deleteStudent(num, name);
            }
            else if (statement.equals("3")){
                int x = inputNumOrString("Last Name");
                if (x == 0){
                    name = "";
                    num = inputStudentNum();
                }
                else{
                    System.out.println("Student last name:");
                    name = in.nextLine();
                    num = 0;
                }
                sl.editStudentList(num, name);
            }else if (statement.equals("4")){
                sl.clearList();
                System.out.println("List cleared.");
            }else if (statement.equals("5")){
                sl.printAll();
            }else if (statement.equals("6")){
                int x = inputNumOrString("Last Name");
                if (x == 0){
                    name = "";
                    num = inputStudentNum();
                }else{
                    System.out.println("Student last name:");
                    name = in.nextLine();
                    num = 0;
                }
                sl.printStudent(num, name);
            }else if (statement.equals("7")){
                sl.runMergeSort();
                System.out.println("The student list has been sorted.");
            }else if (!statement.equals("8")){
                System.out.println("Error: Invalid command");
            }
            else if(statement.equals("9")){
                System.out.println("Enter ID of student you wish to find.");
                gpaSearch = in.nextDouble();
                findStudent(gpaSearch);
            }
            System.out.println();
        }
        System.out.println("Exited the program.");
    }
    
    public static double inputStudentGPA(){
        System.out.println("Student GPA:");
        Scanner in = new Scanner (System.in);
        double gpa = in.nextDouble();
        in.nextLine();
        while (gpa < 0 || gpa > 5){
             System.out.println("Please enter a number from 0 to 5.");
             System.out.println("Student GPA:");
             gpa = in.nextDouble();
             in.nextLine();
        }
        if (gpa%0.01 >= 0.0050){
            gpa += 0.01;
        }
        gpa -= gpa%0.01;
        return gpa;
    }
    
    public static int inputStudentNum(){
        System.out.println("Student number:");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        in.nextLine();
        while (num/1000000 != 0 || num/100000 <= 0){
             System.out.println("Please enter a six-digit number.");
             System.out.println("Student number:");
             num = in.nextInt();
             in.nextLine();
        }
        return num;
    }
    
    public static int inputNumOrString(String nameOrLastName){
        while (true){
            System.out.println("Press 0 to enter student ID");
            System.out.println("Press 1 to enter student's "+nameOrLastName+".");
            Scanner in = new Scanner (System.in);
            String s = in.nextLine();
            if (s.equals("0")){
                return 0;
            }
            else if (s.equals("1")){
                return 1;
            }
        }
    }
}