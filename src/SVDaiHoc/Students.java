package SVDaiHoc;

public class Students {
    public static int autoID=0;
    protected int id;
    protected String name;
    protected String address;
    protected int priority;

    public Students( String name, String address, int priority) {
        this.id = autoID;
        autoID++;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }
    public Students(){}
//    get va set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
