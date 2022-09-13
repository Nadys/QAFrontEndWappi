package com.speedup.qa.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OrderWithoutCuponUserInterfaces {

    public static final Target SELECTION_PRODUCT = Target
            .the("Pedir ")
            .located(By.xpath("//*[@id=\"offer-0\"]/td[7]/button"));

    public static final Target CONFIRM_ORDER = Target
            .the("Confirmar el pedido ")
            .located(By.xpath("(//button[@class='button success'])[1]"));
}
