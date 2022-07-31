package com.github.andrielson.mediator.translate.mediator;

import com.github.andrielson.mediator.translate.model.User;
import com.github.andrielson.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
