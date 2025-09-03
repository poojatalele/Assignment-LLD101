package exercise;

public class EmployeeDBAdapter implements Employee{

    private final EmployeeDB eDB;

    public EmployeeDBAdapter(EmployeeDB eDB) {
        this.eDB = eDB;
    }

    @Override
    public String getId() {
        return String.valueOf(eDB.getId());
    }

    @Override
    public String getFirstName() {
        return eDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return eDB.getSurname();
    }

    @Override
    public String getEmail() {
        return eDB.getEmailAddress();
    }
    
}
