package net.runelite.client.plugins.storagetracker.leprechaun;

public class BottomlessEntry extends LeprechaunEntry {

    private int compostType;
    private int compostAmount;

    BottomlessEntry(int type, String name, int max){
        super(type, name, max);
    }

    public String getCompostName(){
        switch (compostType){
            case 0:
                return "Empty";
            case 1:
                return "Normal compost";
            case 2:
                return "Supercompost";
            case 3:
                return "Ultracompost";
            default:
                return "invalid type"; //debug
        }
    }

    public void setCompostType(){
        //TODO
    }

    public int getCompostAmount(){
        return compostAmount;
    }

    public void setCompostAmount(int amt){
        compostAmount = amt;
    }

}
