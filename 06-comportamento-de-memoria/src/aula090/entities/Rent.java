package aula090.entities;

public class Rent {
    private String name;
    private String email;
    
    public Rent (String _name, String _email) {
        name = _name;
        email = _email;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
