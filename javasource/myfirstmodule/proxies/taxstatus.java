// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum taxstatus
{
	AOP(new java.lang.String[][] { new java.lang.String[] { "en_US", "AOP" }, new java.lang.String[] { "hi_IN", "एओपी" } }),
	Artificial_judiciary(new java.lang.String[][] { new java.lang.String[] { "en_US", "Artificial judiciary" }, new java.lang.String[] { "hi_IN", "कृत्रिम न्यायपालिका" } }),
	Bank_c0_operive_Bank(new java.lang.String[][] { new java.lang.String[] { "en_US", "Bank/co-operative Bank" }, new java.lang.String[] { "hi_IN", "बैंक/सहकारी बैंक" } }),
	Body_corporate(new java.lang.String[][] { new java.lang.String[] { "en_US", "Body corporate" }, new java.lang.String[] { "hi_IN", "शारीरिक कॉर्पोरेट" } }),
	body_of_individual(new java.lang.String[][] { new java.lang.String[] { "en_US", "body of individual" }, new java.lang.String[] { "hi_IN", "व्यक्तिगत शरीर" } }),
	company(new java.lang.String[][] { new java.lang.String[] { "en_US", "company" }, new java.lang.String[] { "hi_IN", "कंपनी" } }),
	DFI(new java.lang.String[][] { new java.lang.String[] { "en_US", "DFI" }, new java.lang.String[] { "hi_IN", "डीएफआई" } }),
	FII(new java.lang.String[][] { new java.lang.String[] { "en_US", "FII" }, new java.lang.String[] { "hi_IN", "एफआईआई" } }),
	FCRA(new java.lang.String[][] { new java.lang.String[] { "en_US", "FCRA" }, new java.lang.String[] { "hi_IN", "एफसीआरए" } }),
	Government_Body(new java.lang.String[][] { new java.lang.String[] { "en_US", "Government Body" }, new java.lang.String[] { "hi_IN", "सरकारी निकाय" } }),
	HUF(new java.lang.String[][] { new java.lang.String[] { "en_US", "HUF" }, new java.lang.String[] { "hi_IN", "HUF" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private taxstatus(java.lang.String[][] captionStrings)
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