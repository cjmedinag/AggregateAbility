package co.com.sofka.hojadevida.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

public class DescriptorToAbility implements ValueObject<Long> {

    private final Long value;

    public DescriptorToAbility(Long value) {
        this.value = value;
    }

    @Override
    public Long value() {
        return this.value;
    }
}
