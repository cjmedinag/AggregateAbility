package co.com.sofka.hojadevida;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.hojadevida.aggregate.Ability;
import co.com.sofka.hojadevida.entity.MildAbility;
import co.com.sofka.hojadevida.valueobjects.DescriptorToAbility;
import co.com.sofka.hojadevida.valueobjects.IdAbility;
import co.com.sofka.hojadevida.valueobjects.IdMildAbility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AbilityTest {

    private Ability ability;
    @BeforeEach
    IdMildAbility idMildAbility = new IdMildAbility("hola");
    DescriptorToAbility descriptorToAbility = new DescriptorToAbility(1);
    MildAbility mildAbility = new MildAbility(idMildAbility, descriptorToAbility);
    IdAbility idAbility = new IdAbility("amor");
    ability = new Ability(idAbility, mildAbility);




    @Test
    public void HabilidadCreada(){
        List<DomainEvent> listevent = habilidad.getUncommittedChanges();
        HabilidadCreado habilidadCreado = (HabilidadCreado) listevent.get(0);
        Assertions.assertEquals("habilidad agregada", habilidadCreada.type);
        Assertions.assertEquals("java", habilidadCreada.HabilidadTecnica(idHabilidad, habilidadBlanda));
    }

}
