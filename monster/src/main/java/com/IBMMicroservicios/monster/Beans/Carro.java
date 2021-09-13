package com.IBMMicroservicios.monster.Beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value = "prototype")
public class Carro implements Serializable, BeanNameAware {

    private static final Logger logger = LoggerFactory.getLogger( Carro.class );

    @Value("Azul")
    private String color;
    @Value("Tsuru Tuneado")
    private String modelo;

    public Carro(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public Carro(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void setBeanName(String s) {
        logger.info("El nombre del poderosisimo bean es, {}", s);
    }
}
