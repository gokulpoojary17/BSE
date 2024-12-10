// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package webactions.proxies;

public enum PictureQuality
{
	original(new java.lang.String[][] { new java.lang.String[] { "en_US", "Original" }, new java.lang.String[] { "hi_IN", "मूल" } }),
	low(new java.lang.String[][] { new java.lang.String[] { "en_US", "Low" }, new java.lang.String[] { "hi_IN", "कम" } }),
	medium(new java.lang.String[][] { new java.lang.String[] { "en_US", "Medium" }, new java.lang.String[] { "hi_IN", "मध्यम" } }),
	high(new java.lang.String[][] { new java.lang.String[] { "en_US", "High" }, new java.lang.String[] { "hi_IN", "उच्च" } }),
	custom(new java.lang.String[][] { new java.lang.String[] { "en_US", "Custom" }, new java.lang.String[] { "hi_IN", "कस्टम" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private PictureQuality(java.lang.String[][] captionStrings)
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
