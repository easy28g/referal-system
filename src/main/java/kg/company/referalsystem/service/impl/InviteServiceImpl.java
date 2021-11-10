package kg.company.referalsystem.service.impl;

import kg.company.referalsystem.dao.InviteRepo;
import kg.company.referalsystem.exceptions.InviteLimitReached;
import kg.company.referalsystem.mappers.SubscriberMapper;
import kg.company.referalsystem.models.dto.InviteDto;
import kg.company.referalsystem.service.InviteService;
import kg.company.referalsystem.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

@Service
public class InviteServiceImpl implements InviteService {

//    @Autowired
    private SubscriberService subscriberService;

//    @Autowired
    private InviteRepo inviteRepo;

//    @Autowired
    private SubscriberMapper subscriberMapper;

    @Autowired
    public InviteServiceImpl(SubscriberService subscriberService, InviteRepo inviteRepo, SubscriberMapper subscriberMapper) {
        this.subscriberService = subscriberService;
        this.inviteRepo = inviteRepo;
        this.subscriberMapper = subscriberMapper;
    }

    @Override
    public InviteDto sendInvite(InviteDto inviteDto) {

        inviteDto.setSender(subscriberService.getOrCreate(inviteDto.getSender()));
        inviteDto.setReceiver(subscriberService.getOrCreate(inviteDto.getReceiver()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);

//        LocalDate localDate = LocalDate.now().minusDays(1);
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        long count = inviteRepo.countAllBySenderAndStartDateAfter(
                subscriberMapper.toSubscriber(inviteDto.getSender()),
                calendar.getTime()
        );

        if(count>5){
            throw new InviteLimitReached("Достигнуто максимальное количество за сутки");
        }

        calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        count = inviteRepo.countAllBySenderAndStartDateAfter(
                subscriberMapper.toSubscriber(inviteDto.getSender()),
                calendar.getTime()
        );


        System.out.println(inviteDto);
        return inviteDto;
    }
}

















