package co.com.sofka.hojadevida.valueobjects;


import co.com.sofka.domain.generic.ValueObject;

public class IdAbility implements ValueObject<String> {
    private final String id;

    public IdAbility(String id) {
        this.id = id;
    }

    @Override
    public String value() {
        return id;
    }
}
