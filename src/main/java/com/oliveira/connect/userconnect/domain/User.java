package com.oliveira.connect.userconnect.domain;

//import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

//@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer Id;
    private String name;
    private String email;
    private String phone;

    public User() {}

    public User(Integer id, String name, String email, String phone) {
        Id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id.equals(user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
