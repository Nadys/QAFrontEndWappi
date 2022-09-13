package com.speedup.qa.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {
    public static final Target USER = Target
            .the("Ingresa el nombre del usuario")
            .located(By.xpath("//input[@id='username']"));


    public static final Target PASSWORD = Target
            .the("Ingresar Contraseña")
            .located(By.xpath("//input[@id='password']"));

    public static final Target LOGIN = Target
            .the("Login ")
            .located(By.id("button-login"));
}
