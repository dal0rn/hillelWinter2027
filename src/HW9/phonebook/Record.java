package HW9.phonebook;


import java.util.Objects;

public class Record {

    private String name;
    private String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Record{name='" + name + "', phone='" + phone + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Record)) {
            return false;
        }

        Record other = (Record) obj;

        return name.equals(other.name) && phone.equals(other.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
