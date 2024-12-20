// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum paymode
{
	cheque(new java.lang.String[][] { new java.lang.String[] { "en_US", "cheque" }, new java.lang.String[] { "hi_IN", "चेक" } }),
	neft(new java.lang.String[][] { new java.lang.String[] { "en_US", "Neft" }, new java.lang.String[] { "hi_IN", "NEFT" } }),
	rtgs(new java.lang.String[][] { new java.lang.String[] { "en_US", "RTGS" }, new java.lang.String[] { "hi_IN", "RTGS" } }),
	ecs(new java.lang.String[][] { new java.lang.String[] { "en_US", "ECS" }, new java.lang.String[] { "hi_IN", "ईसीएस" } }),
	directcredit(new java.lang.String[][] { new java.lang.String[] { "en_US", "Direct Credit" }, new java.lang.String[] { "hi_IN", "डायरेक्ट क्रेडिट" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private paymode(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
