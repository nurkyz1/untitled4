public class Students <T extends  Number> implements Age {
    T student;


    public Students(T student) {
        System.out.println("age :"+ student);
        this.student = student;
    }

    public T getStudent() {
        System.out.println(" age :"+student);
        return student;
    }



    @Override
    public T age() {
        System.out.println("Student age "+ student);
return age();
    }

    @Override
    public void years(Number number) {
        System.out.println(" Student year "+ student);
    }
}
