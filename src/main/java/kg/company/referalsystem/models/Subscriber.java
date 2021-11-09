package kg.company.referalsystem.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "subscribers")
public class Subscriber {

    @Id
    private Long subs_id;
    private String phone;
    private boolean active;
    private Date addDate;
    private Date editDate;

}
