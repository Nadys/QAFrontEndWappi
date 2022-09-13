package com.speedup.qa.tasks;

import com.speedup.qa.models.LoginModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterfaces.OrderWithoutCuponUserInterfaces.CONFIRM_ORDER;
import static com.speedup.qa.userInterfaces.OrderWithoutCuponUserInterfaces.SELECTION_PRODUCT;

public class OrderWithoutCupon implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(SELECTION_PRODUCT));
       actor.attemptsTo(Click.on(CONFIRM_ORDER));

    }

    public static OrderWithoutCupon orderWithoutCupon(){

        return Tasks.instrumented(OrderWithoutCupon.class);
    }
}
