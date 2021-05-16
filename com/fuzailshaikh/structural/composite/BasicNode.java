package com.fuzailshaikh.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BasicNode implements INode {
	String data;
	List<INode> children;

	BasicNode(String data) {
		this.data = data;
		this.children = new ArrayList<>();
	}

	@Override
	public String getData() {
		return data;
	}

	@Override
	public void add(INode node) {
		this.children.add(node);
	}

	@Override
	public void remove(INode node) {
		this.children.remove(node);
	}

	public void print() {
		System.out.println("Data: " + data);
		for (INode iNode : children) {
			iNode.print();
		}
	}
	
}
