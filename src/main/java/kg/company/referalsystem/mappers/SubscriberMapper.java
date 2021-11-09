package kg.company.referalsystem.mappers;

import kg.company.referalsystem.models.Subscriber;
import kg.company.referalsystem.models.dto.SubscriberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubscriberMapper {

    SubscriberMapper INSTANCE = Mappers.getMapper(SubscriberMapper.class);

    Subscriber toSubscriber(SubscriberDto subscriberDto);
    SubscriberDto toSubscriberDto(Subscriber subscriber);

}






