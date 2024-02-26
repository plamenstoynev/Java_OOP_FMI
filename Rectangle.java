package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    String color;

    public Rectangle(){};

    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    String getColor(){
        return this.color;
    }

    public void setWidth(double width){
        if(width <= 0)
            throw new RuntimeException("Width can't be zero or negative number");
        else
            this.width = width;
    }

    public void setHeight(double height){
        if(height < 0)
            throw new RuntimeException("Height can't be zero or below");
        else
            this.height = height;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
}
