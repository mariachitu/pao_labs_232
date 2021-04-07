package files;

import files.model.Student;

import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ion", 20),
                new Student("Dan", 25)
        };
       // writeStudentFile("student.txt", students);
        readStudentFile("student.txt");
    }

    private static void writeStudentFile(String fileName, Student[] students)   {
        try(ObjectOutputStream outputStream = new ObjectOutputStream((new FileOutputStream(fileName)))) {
            for(Student student : students) {
                outputStream.writeObject(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentFile(String fileName)    {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)))   {
            while (true)    {
                Student student = (Student) inputStream.readObject();
                System.out.println(student);
            }
        } catch (EOFException e)    {
            // end of stream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
