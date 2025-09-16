//Giraffe App
//9/11/25
// ncruz


import p1.Book;
import p1.Camera;
import p1.Student;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.age = 24;
        myStudent.gpa = 2.3;
        myStudent.onProbation = false;
        System.out.println(myStudent.firstName);

        Student myStudent2 = new Student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beesly";
        myStudent2.major = "Art";
        myStudent2.age = 34;
        myStudent2.gpa = 2.6;
        myStudent2.onProbation = false;
        System.out.println(myStudent2.firstName);

        Book myBook = new Book();
        myBook.title = "Three Birds";
        myBook.author = "Stanly Hudson";
        myBook.genre = "Anime";
        myBook.publicationYear = 2000;
        myBook.isHardcovered = true;
        System.out.println(myBook.title);

        Camera myCamera = new Camera();
        myCamera.brand = "Canon";
        myCamera.model = "80d";
        myCamera.price = 2499.99;
        myCamera.megapixels = 20;
        myCamera.hasImageStabilization = true;
        System.out.println(myCamera.brand);
    }
}
