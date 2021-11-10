package kg.company.referalsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.LOCKED)
public class InviteLimitReached extends RuntimeException{

    public InviteLimitReached(String message) {
        super(message);
    }
}
