package be.vdab;
import java.math.BigDecimal;
public class MetChocolade extends KoffieDecorator {
    public MetChocolade(Koffie gedecoreerdeKoffie){
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost(){
        return super.gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }
    @Override
    public String getBereidingswijze(){
        return super.gedecoreerdeKoffie.getBereidingswijze()
                + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
