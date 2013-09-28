package de.coderebell.tts.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.util.LogUtil;
import org.jboss.errai.ioc.client.api.EntryPoint;

@EntryPoint
public class App{
	
	@Inject
	RegisterForm form;
	
	@PostConstruct
	public void onModuleLoad() {
		LogUtil.log("Here I am!");
	}
}
