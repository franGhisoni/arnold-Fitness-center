package com.example.demo;

import modelo.Sexo;
import modelo.Socio;
import modelo.VO.SocioVO;

import java.util.ArrayList;

public class mainTest {

    public static void main(String[] args){
        rutina = new Rutina();
        ArrayList array = new ArrayList<>();
        Socio socioVO = new SocioVO(123,"fran","hola",183,array<>, Sexo.Masculino,null,null,null);
        int altura= socioVO.getAltura();
        System.out.println(altura);

    }
}
