package be.vdab;
public class Fietsen extends BungalowDecorator {
    public Fietsen(VakantieparkArrangement gedecoreerdeBungalow){
        super(gedecoreerdeBungalow);
    }
    
    @Override
    public String getTaak(){
        return super.gedecoreerdeBungalow.getTaak() + " Plaats fietsen bij "
                + "de bungalow.";
    }
}
