package kg.company.referalsystem.dao;

import kg.company.referalsystem.models.Invite;
import kg.company.referalsystem.models.Subscriber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface InviteRepo extends CrudRepository<Invite, Long>  {

    long countAllBySenderAndStartDateAfter(Subscriber sender, Date date);
}
