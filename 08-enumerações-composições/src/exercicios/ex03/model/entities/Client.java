package exercicios.ex03.model.entities;

import java.util.Date;

public class Client {

    private String name;
    private String email;
    private Date birthDate;


    public Client(String _name, String _email, Date _birthDate) {
        name = _name;
        email = _email;
        birthDate = _birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date _birthDate) {
        birthDate = _birthDate;
    }
}
