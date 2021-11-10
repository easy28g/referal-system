package kg.company.referalsystem.mappers;

import kg.company.referalsystem.models.Subscriber;
import kg.company.referalsystem.models.dto.SubscriberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface SubscriberMapper {

    Subscriber toSubscriber(SubscriberDto subscriberDto);
    SubscriberDto toSubscriberDto(Subscriber subscriber);

}






