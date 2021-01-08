public class Main {

    public static void main(String[] args) {
	Students<Integer>students= new Students<Integer>(21);
     Students<Double> students1= new Students<Double>(20.5);
     Students <Integer> students2 = new Students<Integer>(22);
        System.out.println("Student age : "+students.getStudent());
        System.out.println("Student  age :"+students1.getStudent());
        System.out.println("Student age : "+students2.getStudent());
    }
}
