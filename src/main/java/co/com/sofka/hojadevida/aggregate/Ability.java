package co.com.sofka.hojadevida.aggregate;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.hojadevida.entity.MildAbility;
import co.com.sofka.hojadevida.valueobjects.IdAbility;

import java.util.List;

public class Ability extends AggregateEvent <IdAbility>{

    private List<MildAbility> mildAbilities;
    public Ability(IdAbility idAbility, MildAbility mildAbility) {
        super(idAbility);
    }
}
