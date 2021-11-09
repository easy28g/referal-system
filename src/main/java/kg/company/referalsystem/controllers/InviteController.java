package kg.company.referalsystem.controllers;

import kg.company.referalsystem.models.dto.InviteDto;
import kg.company.referalsystem.service.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/invite")
public class InviteController {

    @Autowired
    private InviteService inviteService;

    @PostMapping("/send")
    public InviteDto send(@RequestBody InviteDto inviteDto){
        return inviteService.sendInvite(inviteDto);
    }

}




















