package com.github.andrielson.mediator.translate.model;

import com.github.andrielson.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
