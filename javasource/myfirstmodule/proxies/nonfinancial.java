// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum nonfinancial
{
	listetd_for(new java.lang.String[][] { new java.lang.String[] { "en_US", "listetd for" } }),
	related_tolistedentiry(new java.lang.String[][] { new java.lang.String[] { "en_US", "related tolistedentiry" } }),
	activenffe(new java.lang.String[][] { new java.lang.String[] { "en_US", "activenffe" } }),
	passivenffe(new java.lang.String[][] { new java.lang.String[] { "en_US", "passivenffe" } }),
	notapplicable_for_nffe(new java.lang.String[][] { new java.lang.String[] { "en_US", "notapplicable for nffe" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private nonfinancial(java.lang.String[][] captionStrings)
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