package kg.company.referalsystem.models;

import kg.company.referalsystem.models.enums.InviteStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "invites")
public class Invite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Subscriber sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Subscriber receiver;

    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private InviteStatus status;
}



























