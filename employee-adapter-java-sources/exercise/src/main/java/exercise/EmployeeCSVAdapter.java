package exercise;

public class EmployeeCSVAdapter implements Employee{
    private final EmployeeCSV eCSV;

    public EmployeeCSVAdapter(EmployeeCSV eCSV) {
        this.eCSV = eCSV;
    }

    @Override
    public String getId() {
        return eCSV.tokens()[0];
    }

    @Override
    public String getFirstName() {
        return eCSV.tokens()[1];
    }

    @Override
    public String getLastName() {
        return eCSV.tokens()[2];
    }

    @Override
    public String getEmail() {
        return eCSV.tokens()[3];
    }
}
