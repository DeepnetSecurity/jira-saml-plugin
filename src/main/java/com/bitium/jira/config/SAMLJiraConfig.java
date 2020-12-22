package com.bitium.jira.config;

import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import com.bitium.saml.config.SAMLConfig;


public class SAMLJiraConfig extends SAMLConfig {
	public static final String DEFAULT_AUTOCREATE_USER_GROUP = "jira-users";

	public String getAlias() {
		return "jiraSAML";
	}

	//This will be called during uploading and installation
	public SAMLJiraConfig(PluginSettingsFactory pluginSettingsFactory) {
		setPluginSettingsFactory(pluginSettingsFactory);
	}
}
