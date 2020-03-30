package co.com.sofka.hojadevida.entity;


import co.com.sofka.hojadevida.valueobjects.DescriptorToAbility;
import co.com.sofka.hojadevida.valueobjects.IdMildAbility;

import javax.swing.text.html.parser.Entity;

public class MildAbility extends Entity<IdMildAbility> {

    private  String nameAbility;
    private DescriptorToAbility descriptorToAbility;

    public MildAbility(IdMildAbility idMildAbility, DescriptorToAbility descriptorToAbility) {
        super(idMildAbility);
        this.descriptorToAbility = descriptorToAbility;
    }
}
