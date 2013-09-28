package de.coderebell.tts.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;

@Page(role = DefaultPage.class)
@Templated(value="RegisterForm.html#form")
public class RegisterForm extends Composite {

	@Inject
	@DataField
	private Button submitButton;
	
	@Inject
	@DataField
	private Button cancelButton;

	@Inject
	@DataField
	private TextArea username;

	@Inject
	@DataField
	private TextArea email;

	@PostConstruct
	public void initWidget() {		
	}

	@EventHandler("submitButton")
	private void handleSubmitEvent(ClickEvent event) {
		email.setText(username.getText());
		username.setText("Gotcha!");
	}
	
	@EventHandler("cancelButton")
	private void handleCancelEvent(ClickEvent event){
		email.setText("");
		username.setText("");
	}
}
