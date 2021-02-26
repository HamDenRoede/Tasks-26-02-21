/*
3.c in the Student class, declare the class "Student" and add 4 fields:
        "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.

3.d in the Student class, add a constructor that takes in 4 parameters with the names:
"tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
*/
public class Student
{
    String name;
    int age;
    boolean isFemale;
    String datamatikerTeam;

    public Student(String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam)
    {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
        this.datamatikerTeam = tmpDatamatikerTeam;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isFemale()
    {
        return isFemale;
    }

    public void setFemale(boolean female)
    {
        isFemale = female;
    }

    public String getDatamatikerTeam()
    {
        return datamatikerTeam;
    }

    public void setDatamatikerTeam(String datamatikerTeam)
    {
        this.datamatikerTeam = datamatikerTeam;
    }
}
