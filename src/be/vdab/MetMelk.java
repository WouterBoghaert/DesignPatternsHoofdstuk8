package be.vdab;
import java.math.BigDecimal;
public class MetMelk extends KoffieDecorator {
    public MetMelk(Koffie gedecoreerdeKoffie){
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost(){
        return super.gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }
    @Override
    public String getBereidingswijze(){
        return super.gedecoreerdeKoffie.getBereidingswijze() +
                ", warm de melk, voeg de melk toe";
    }
}
