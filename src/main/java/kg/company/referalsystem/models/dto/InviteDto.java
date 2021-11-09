package kg.company.referalsystem.models.dto;

import kg.company.referalsystem.models.enums.InviteStatus;
import lombok.Data;

import java.util.Date;

@Data
public class InviteDto {

    private Long id;
    private SubscriberDto sender;
    private SubscriberDto receiver;
    private Date startDate;
    private Date endDate;
    private InviteStatus status;

}
