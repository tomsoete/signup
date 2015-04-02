package be.lavait.samples.signup;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SignupController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public RegistrationResponse registerUser(@RequestBody RegistrationRequest request){

        System.out.println(String.format("Registering user %s", request.getEmail()));

        return new RegistrationResponse(UUID.randomUUID().toString(), request.getEmail());
    }

}
