public class Student {
        int rollno;
        String name;
        double marks;
        final String schoolName = "BDS"; //final keyword to finalize the value of the attribute

        static int noOfStudents; //static keyword to create a common block of particular attribute for all the objects in the same class


        public Student(String sname, int srno, double smarks){  //creating constructor
                name = sname;
                rollno = srno;
                marks = smarks;
                noOfStudents++;
        }
        public int getRollno() { //getter
                return rollno;
        }

        public void setRollno(int rollno) { //setter
                this.rollno = rollno; //this keyword
        }
}
