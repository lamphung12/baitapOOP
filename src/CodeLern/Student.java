package CodeLern;
    public class Student{
        private String name;
        private String address;
        private double gpa;

        public Student(String name, String address, double gpa) {
            this.name = name;
            this.address = address;
            this.gpa = gpa;
        }

        public Student() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }

        public static void main(String[] args) {
            Student s = new Student("Kien", "Ha Noi", 6.6);
            System.out.println(s);
        }
    }

