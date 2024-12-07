// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum wealthsource
{
	salary(new java.lang.String[][] { new java.lang.String[] { "en_US", "salary" } }),
	bussiness_income(new java.lang.String[][] { new java.lang.String[] { "en_US", "bussiness income" } }),
	gift(new java.lang.String[][] { new java.lang.String[] { "en_US", "gift" } }),
	ancestralpropert(new java.lang.String[][] { new java.lang.String[] { "en_US", "ancestralpropert" } }),
	rentalincome(new java.lang.String[][] { new java.lang.String[] { "en_US", "rentalincome" } }),
	prizemoney(new java.lang.String[][] { new java.lang.String[] { "en_US", "prizemoney" } }),
	royalty(new java.lang.String[][] { new java.lang.String[] { "en_US", "royalty" } }),
	others(new java.lang.String[][] { new java.lang.String[] { "en_US", "others" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private wealthsource(java.lang.String[][] captionStrings)
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
