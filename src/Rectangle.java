public class Rectangle {
    private float lenght;
    private float width;
    public Rectangle(){
        lenght = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float l,float w){
        lenght=l;
        width=w;
    }
    public float getLenght(){ return lenght; }
    public void setLenght(float l){lenght=l;}
    public float getWidth(){ return width; }
    public void setWidth(float w){width=w;}
    public double getArea(){ return width*lenght; }
    public double getPerimeter(){ return (width+lenght)*2; }
    public String toString(){
        return "Rectangle[length= "+ this.lenght +", width="+this.width+"]";
    }
}
