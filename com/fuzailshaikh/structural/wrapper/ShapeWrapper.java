package com.fuzailshaikh.structural.wrapper;

public class ShapeWrapper implements Shape {
	protected Shape decoratedShape;

   public ShapeWrapper(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}
