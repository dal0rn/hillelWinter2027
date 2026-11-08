package HW9.phonebook;


import java.util.LinkedHashSet;
import java.util.Set;

public class PhoneBook {

    private Set<Record> records = new LinkedHashSet<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find (String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }

        return null;
    }

    public Set<Record> findAll(String name) {
        Set<Record> result = new LinkedHashSet<>();

        for (Record record : records) {
            if (record.getName().equals(name)) {
                result.add(record);
            }
        }

        if (result.isEmpty()) {
            return null;
        }

        return result;
    }
}
