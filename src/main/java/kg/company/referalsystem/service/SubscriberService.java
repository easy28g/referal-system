package kg.company.referalsystem.service;

import kg.company.referalsystem.models.dto.SubscriberDto;

public interface SubscriberService {

    SubscriberDto getOrCreate(SubscriberDto subscriberDto);
}
