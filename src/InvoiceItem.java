public class InvoiceItem {
     private String id,desc;
     private int qty;
     private double unitPrice;
     public InvoiceItem(String i, String d, int q, double p ) {
         id = i;
         desc = d;
         qty = q;
         unitPrice = p;
     }
     public String getId() {return id;}
     public String getDesc(){return desc;}
     public int getQty(){return qty;}
     public void setqty(int q){ qty = q;}
     public double getunitPrice(){return unitPrice;}
     public void setunitPrice(double p){unitPrice = p;}
     public double getTotal(){return qty*unitPrice;}
     public String toString(){
           return "InvoiceItem[ id= "+this.id+",desc ="+this.desc+",qty ="+this.qty+",unitPrice ="+this.unitPrice+"]";
     }
}
