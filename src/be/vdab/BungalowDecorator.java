package be.vdab;
public abstract class BungalowDecorator implements VakantieparkArrangement {
    protected final VakantieparkArrangement gedecoreerdeBungalow;
    public BungalowDecorator(VakantieparkArrangement bungalow){
        this.gedecoreerdeBungalow = bungalow;
    }
}
