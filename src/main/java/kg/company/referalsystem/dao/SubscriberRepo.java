package kg.company.referalsystem.dao;

import kg.company.referalsystem.models.Subscriber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepo extends CrudRepository<Subscriber, Long> {
}
