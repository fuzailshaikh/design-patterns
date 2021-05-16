package com.fuzailshaikh.creational.builder;

public class Cage {
    private int id;
    private int capacity;

    public Cage(Builder builder) { 
			this.id = builder.id;
			this.capacity = builder.capacity;
	  }

    public int getId() {
			return id;
		}

		public int getCapacity() {
			return capacity;
		}

		public static class Builder { 
        private int id;
        private int capacity;
  
        public static Builder newInstance() { 
            return new Builder(); 
        } 
  
        private Builder() {} 
  
        public Builder setId(int id) { 
            this.id = id; 
            return this; 
        } 

        public Builder setCapacity(int capacity) { 
            this.capacity = capacity; 
            return this; 
        } 
  
        public Cage build() { 
            return new Cage(this); 
        } 
    } 
}