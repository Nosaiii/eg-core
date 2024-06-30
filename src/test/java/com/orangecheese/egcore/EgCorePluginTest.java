package com.orangecheese.egcore;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EgCorePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EgCorePlugin.class);
		RuneLite.main(args);
	}
}