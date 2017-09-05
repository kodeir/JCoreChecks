package com.kodeir.jcore.iterations;

/**
 * Created by Sergei "Kodeir" Riabinin on 16/03/17.
 */
public class MonsterPart {

    public MonsterPart(){
        this("default monster part", false);
    }

    private String partName;

    private boolean isDamaged;

    public MonsterPart(String partName, boolean isDamaged) {
        this.partName = partName;
        this.isDamaged = isDamaged;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }
}
