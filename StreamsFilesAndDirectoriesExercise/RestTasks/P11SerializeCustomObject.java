package StreamsFilesAndDirectoriesExercise.RestTasks;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class P11SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//     Пътищата не са правинилни просто е копиран кода за да го имам!

            Course course = new Course("Java-Advanced", 300);
            String path = "C:\\Users\\Kaloyan\\Desktop\\java-advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\course.ser";

            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(course);

            // deserialize course object
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            Course deserializedCourse = (Course) objectInputStream.readObject();
            System.out.println();

        }
    }
