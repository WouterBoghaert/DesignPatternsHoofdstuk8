package be.vdab;
public class Barbecue extends BungalowDecorator {
    public Barbecue(VakantieparkArrangement gedecoreerdeBungalow){
        super(gedecoreerdeBungalow);
    }
    
    @Override
    public String getTaak(){
        return super.gedecoreerdeBungalow.getTaak() + " Plaats een barbecue "
                + "bij de bungalow.";
    }
}
