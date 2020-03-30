package co.com.sofka.hojadevida.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

public class IdMildAbility implements ValueObject<String> {

    private final String id;
    public IdMildAbility(String id) {
        this.id = id;
    }

    @Override
    public String value() {
        return this.id;
    }
}
