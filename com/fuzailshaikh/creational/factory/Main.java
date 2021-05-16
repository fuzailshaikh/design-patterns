package com.fuzailshaikh.creational.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> config = new LinkedHashMap<>();
		config.put(Shape.class.getName(), Circle.class.getName());

		// Initialise factory with default configuration
		PluginFactory.init(config);

		try {
			Shape instance = PluginFactory.instanceOf(Shape.class);
			instance.draw();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}
}
