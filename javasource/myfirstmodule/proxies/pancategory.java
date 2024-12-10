// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum pancategory
{
	sikkim_resident(new java.lang.String[][] { new java.lang.String[] { "en_US", "sikkim resident" }, new java.lang.String[] { "hi_IN", "सिक्किम निवासी" } }),
	officil_liquidiator(new java.lang.String[][] { new java.lang.String[] { "en_US", "officil liquidiator" }, new java.lang.String[] { "hi_IN", "आधिकारिक लिक्विडेटर" } }),
	courtreciever(new java.lang.String[][] { new java.lang.String[] { "en_US", "courtreciever" }, new java.lang.String[] { "hi_IN", "कोर्ट रिसीवर" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private pancategory(java.lang.String[][] captionStrings)
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
