package com.sda.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String imie, nazwisko, pesel, rok, miesiac;
    private List<Integer> computerList;

}
