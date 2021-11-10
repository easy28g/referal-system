package kg.company.referalsystem.models.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
public class SubscriberDto {

    private Long subs_id;
    private String phone;
    private boolean active;
    private Date addDate;
    private Date editDate;

}
