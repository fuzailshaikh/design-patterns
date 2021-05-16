package com.fuzailshaikh.creational.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public class PluginFactory {
	private static final Map<String, String> config = new LinkedHashMap<>();

	public static void init(Map<String, String> details) {
		config.putAll(details);
	}

	public static <T> T instanceOf(Class<T> targetInterface)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		String implName = config.get(targetInterface.getName());
		if (implName == null) {
			throw new InstantiationException("The interface " + targetInterface.getName() + " has no mapping to an impl");
		}

		Class<? extends T> implClass = (Class<? extends T>) Class.forName(implName);
		T result = implClass.getDeclaredConstructor().newInstance();
		if (result == null) {
			throw new InstantiationException("The interface " + targetInterface.getName() + " has no mapping to an impl.");
		}
		
		return result;
	}

}
