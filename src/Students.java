public class Students <T extends  Number> implements Age {
    T student;

    public Students(T student) {
        this.student = student;
    }

    public T getStudent() {
        return student;
    }


    @Override
    public void age() {

    }
}
