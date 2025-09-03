package exercise;

public class EmployeeLDAPAdapter implements Employee{
    private final EmployeeLDAP eLDAP;

    public EmployeeLDAPAdapter(EmployeeLDAP eLDAP) {
        this.eLDAP = eLDAP;
    }

    @Override
    public String getId() {
        return eLDAP.get("uid");
    }

    @Override
    public String getFirstName() {
        return eLDAP.get("givenName");
    }

    @Override
    public String getLastName() {
        return eLDAP.get("sn");
    }

    @Override
    public String getEmail() {
        return eLDAP.get("mail");
    }
}
