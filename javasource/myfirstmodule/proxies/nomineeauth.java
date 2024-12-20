// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum nomineeauth
{
	wetsignature(new java.lang.String[][] { new java.lang.String[] { "en_US", "wetsignature" }, new java.lang.String[] { "hi_IN", "गीला हस्ताक्षर" } }),
	aadhar(new java.lang.String[][] { new java.lang.String[] { "en_US", "aadhar" }, new java.lang.String[] { "hi_IN", "आधार" } }),
	otpauthentiction(new java.lang.String[][] { new java.lang.String[] { "en_US", "otpauthentiction" }, new java.lang.String[] { "hi_IN", "OTP प्रमाणीकरण" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private nomineeauth(java.lang.String[][] captionStrings)
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
