public class Student {
        int id;
        String name;
        //constructor 
        public Student(int i, String n) {
            id = i;
            name = n;
        }
        public void display() {
            System.out.println(id + " " + name);
        }
        public static void main(String args[]){
            Student s1 = new Student(111,"Karan");
            Student s2 = new Student(222,"Rob");
            s1.display();
            s2.display();
        }
}