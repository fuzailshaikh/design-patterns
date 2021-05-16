package com.fuzailshaikh.structural.wrapper;

public class RedStrokedCircle extends ShapeWrapper {

	public RedStrokedCircle(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
   public void draw() {
      super.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
	
}
