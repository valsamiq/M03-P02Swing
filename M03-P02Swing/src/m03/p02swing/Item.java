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
    private Integer Code;   //Item Code
    private String Color;   //Item Color   
    private String Size;    //Item Size
    private String Desc;    //Item Description
    private Double pve;     //Item cost-price
    private Double pvp;     //Item sell-price
    private Integer qty;    //Item Stock quantity

    public Item(Integer Code, String Color, String Size, String Desc, Double pve, Double pvp, Integer qty) {
        this.Code = Code;
        this.Color = Color;
        this.Size = Size;
        this.Desc = Desc;
        this.pve = pve;
        this.pvp = pvp;
        this.qty = qty;
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

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    
}
