package com.sharmila.karki.service;

import com.sharmila.karki.domain.CustomEmail;

public interface EmailManager {
	public CustomEmail sendEmail(CustomEmail email);
}
