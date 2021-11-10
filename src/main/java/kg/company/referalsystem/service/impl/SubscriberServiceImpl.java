package kg.company.referalsystem.service.impl;

import kg.company.referalsystem.dao.SubscriberRepo;
import kg.company.referalsystem.exceptions.SubscriberNotFound;
import kg.company.referalsystem.mappers.SubscriberMapper;
import kg.company.referalsystem.models.Subscriber;
import kg.company.referalsystem.models.dto.SubscriberDto;
import kg.company.referalsystem.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberRepo subscriberRepo;
    @Autowired
    private SubscriberMapper subscriberMapper;

    @Override
    public SubscriberDto getOrCreate(SubscriberDto subscriberDto) {
        Subscriber subscriber = subscriberMapper.toSubscriber(subscriberDto);

//        if(subscriberRepo.existsById(subscriber.getSubs_id())){
//            subscriber = subscriberRepo.findById(subscriber.getSubs_id()).get();
//        }else {
//            subscriber.setAddDate(new Date());
//            subscriber.setEditDate(new Date());
//            subscriber.setActive(true);
//            subscriber = subscriberRepo.save(subscriber);
//        }

        try{
            subscriber = subscriberRepo.findById(subscriber.getSubs_id()).orElseThrow(()->new SubscriberNotFound());
        }catch (SubscriberNotFound e){
            subscriber.setAddDate(new Date());
            subscriber.setEditDate(new Date());
            subscriber.setActive(true);
            subscriber = subscriberRepo.save(subscriber);
        }

        return subscriberMapper.toSubscriberDto(subscriber);
    }
}














