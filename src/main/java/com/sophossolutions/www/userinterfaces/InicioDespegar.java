package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.despegar.com.co/")

public class InicioDespegar extends PageObject {

	public static final Target VUELOS = Target.the("seleciona").located(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a"));			
}
