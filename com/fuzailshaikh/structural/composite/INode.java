package com.fuzailshaikh.structural.composite;

public interface INode {
	String getData();	
	void add(INode node);
	void remove(INode node);
	void print();
}
