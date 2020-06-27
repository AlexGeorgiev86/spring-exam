package springexam.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String username;
    private String password;

}
