package com.github.andrielson.mediator.translate.mediator;

import com.github.andrielson.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
