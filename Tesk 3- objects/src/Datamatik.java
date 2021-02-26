/*
3.i Returning to the Datamatik class add a main() function and in this function,
create a new object/instance of the type Teacher and give it the name, age and gender of your teacher.

3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student.
The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group.

3.k in the main() function print the name of the teacher

3.l in the main() function print the names of both students and which teams they are from.
Do this witout writing any toString() methods
*/


public class Datamatik
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("Bøllebob", 12, false);

        Student student1 = new Student("Gummi Tarzan", 10, false,"A");
        Student student2 = new Student("Pippi Langstrømpe", 9, true, "B");

        System.out.println("Teacher: "+ teacher.name);
        System.out.println(student1.name + " - team: " + student1.datamatikerTeam);
        System.out.println(student2.name + " - team: " + student2.datamatikerTeam);
    }

}
