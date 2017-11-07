/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.p02swing;

/**
 *
 * @author balsamiq
 */
public class Item {
    private Integer Code;
    private String Color;
    private String Size;
    private String Desc;
    private Double pve;
    private Double pvp;

    public Item(Integer Code, String Color, String Size, String Desc, Double pve, Double pvp) {
        this.Code = Code;
        this.Color = Color;
        this.Size = Size;
        this.Desc = Desc;
        this.pve = pve;
        this.pvp = pvp;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer Code) {
        this.Code = Code;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Double getPve() {
        return pve;
    }

    public void setPve(Double pve) {
        this.pve = pve;
    }

    public Double getPvp() {
        return pvp;
    }

    public void setPvp(Double pvp) {
        this.pvp = pvp;
    }
    
}
