package com.speedup.qa.tasks;

import com.speedup.qa.models.LoginModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userInterfaces.LoginUserInterfaces.*;

public class Login implements Task {
    private LoginModels loginModels;
    public Login(LoginModels loginModels){
        this.loginModels=loginModels;

    }
    public static Login withData(LoginModels loginModels) {
        return new Login(loginModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loginModels.getUser()).into(USER));
        actor.attemptsTo(Enter.theValue(loginModels.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(LOGIN));
    }
}

