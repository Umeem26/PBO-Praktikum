public class Student<T> {
    
    private String studentID;
    private String name;
    private T department; 
    private String address;

    public Student(String studentID, String name, T department, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    // Getter dan Setter 
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getDepartment() {
        return department;
    }

    public void setDepartment(T department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + studentID + '\'' +
                ", Name='" + name + '\'' +
                ", Dept=" + department +
                ", Address='" + address + '\'' +
                '}';
    }
}