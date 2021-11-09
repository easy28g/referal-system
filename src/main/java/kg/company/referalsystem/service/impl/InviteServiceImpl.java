package kg.company.referalsystem.service.impl;

import kg.company.referalsystem.models.dto.InviteDto;
import kg.company.referalsystem.service.InviteService;
import org.springframework.stereotype.Service;

@Service
public class InviteServiceImpl implements InviteService {
    @Override
    public InviteDto sendInvite(InviteDto inviteDto) {
        System.out.println(inviteDto);
        return inviteDto;
    }
}
