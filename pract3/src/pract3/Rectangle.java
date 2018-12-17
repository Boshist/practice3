package pract3; 

public class Rectangle extends Shape{ 

protected double width; 
protected double length; 

Rectangle() 
{ 
this.color="white"; 
this.filled=true; 

this.width=1; 
this.length=1; 
} 

Rectangle(double width, double length) 
{ 
this.color="white"; 
this.filled=true; 

this.width=width; 
this.length=length; 
} 

Rectangle(double width, double length, String color, boolean filled) 
{ 
this.color=color; 
this.filled=filled; 

this.width=width; 
this.length=length; 
} 

public double getWidth() 
{ 
return this.width; 
} 

public void setWidth(double width) 
{ 
this.width=width; 
} 

public double getLength() 
{ 
return this.length; 
} 

public void setLength(double length) 
{ 
this.length=length; 
} 

@Override 
public double getArea() 
{ 
return this.length*this.width; 
} 

@Override 
public double getPerimeter() 
{ 
return (this.length+this.width)*2; 
} 

@Override 
public String toString() 
{ 
return "Color = "+this.color+", filled - "+this.filled+", length = "+this.length+", width = "+this.width; 
} 
}