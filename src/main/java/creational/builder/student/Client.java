package creational.builder.student;

public class Client {
    public static void main(String[] args) {

        Student student =    Student.getBuilder()
                                    .setName("Ankit")
                                    .setAge(25)
                                    .setPsp(99.00)
                                    .setUniversityName("ABC")
                                    .setGradYear(2010)
                                    .build();
    }
}