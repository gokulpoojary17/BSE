// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class nominations implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nominationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.nominations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		holdername("holdername"),
		nomineefirstname("nomineefirstname"),
		nomineemidllename("nomineemidllename"),
		nomineelastname("nomineelastname"),
		nomineeminor("nomineeminor"),
		nomineerelation("nomineerelation"),
		applicable("applicable"),
		dateofbirth("dateofbirth"),
		panexempt("panexempt"),
		nomineepan("nomineepan"),
		nomineeauthentication("nomineeauthentication"),
		step6completed("step6completed"),
		gaurdianfirstname("gaurdianfirstname"),
		guardianlastname("guardianlastname"),
		gaurdianmiddlename("gaurdianmiddlename"),
		guardianpanexempt("guardianpanexempt"),
		guardianpancategory("guardianpancategory"),
		guardianpkern("guardianpkern"),
		gaurdiandateofbirth("gaurdiandateofbirth"),
		gaurdianpan("gaurdianpan"),
		dataid("dataid");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public nominations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected nominations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nominationsMendixObject)
	{
		if (nominationsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, nominationsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.nominationsMendixObject = nominationsMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.nominations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.nominations(context, mendixObject);
	}

	public static myfirstmodule.proxies.nominations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.nominations.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.nominations> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.nominations.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of holdername
	 */
	public final java.lang.String getholdername()
	{
		return getholdername(getContext());
	}

	/**
	 * @param context
	 * @return value of holdername
	 */
	public final java.lang.String getholdername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.holdername.toString());
	}

	/**
	 * Set value of holdername
	 * @param holdername
	 */
	public final void setholdername(java.lang.String holdername)
	{
		setholdername(getContext(), holdername);
	}

	/**
	 * Set value of holdername
	 * @param context
	 * @param holdername
	 */
	public final void setholdername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String holdername)
	{
		getMendixObject().setValue(context, MemberNames.holdername.toString(), holdername);
	}

	/**
	 * @return value of nomineefirstname
	 */
	public final java.lang.String getnomineefirstname()
	{
		return getnomineefirstname(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineefirstname
	 */
	public final java.lang.String getnomineefirstname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nomineefirstname.toString());
	}

	/**
	 * Set value of nomineefirstname
	 * @param nomineefirstname
	 */
	public final void setnomineefirstname(java.lang.String nomineefirstname)
	{
		setnomineefirstname(getContext(), nomineefirstname);
	}

	/**
	 * Set value of nomineefirstname
	 * @param context
	 * @param nomineefirstname
	 */
	public final void setnomineefirstname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nomineefirstname)
	{
		getMendixObject().setValue(context, MemberNames.nomineefirstname.toString(), nomineefirstname);
	}

	/**
	 * @return value of nomineemidllename
	 */
	public final java.lang.String getnomineemidllename()
	{
		return getnomineemidllename(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineemidllename
	 */
	public final java.lang.String getnomineemidllename(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nomineemidllename.toString());
	}

	/**
	 * Set value of nomineemidllename
	 * @param nomineemidllename
	 */
	public final void setnomineemidllename(java.lang.String nomineemidllename)
	{
		setnomineemidllename(getContext(), nomineemidllename);
	}

	/**
	 * Set value of nomineemidllename
	 * @param context
	 * @param nomineemidllename
	 */
	public final void setnomineemidllename(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nomineemidllename)
	{
		getMendixObject().setValue(context, MemberNames.nomineemidllename.toString(), nomineemidllename);
	}

	/**
	 * @return value of nomineelastname
	 */
	public final java.lang.String getnomineelastname()
	{
		return getnomineelastname(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineelastname
	 */
	public final java.lang.String getnomineelastname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nomineelastname.toString());
	}

	/**
	 * Set value of nomineelastname
	 * @param nomineelastname
	 */
	public final void setnomineelastname(java.lang.String nomineelastname)
	{
		setnomineelastname(getContext(), nomineelastname);
	}

	/**
	 * Set value of nomineelastname
	 * @param context
	 * @param nomineelastname
	 */
	public final void setnomineelastname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nomineelastname)
	{
		getMendixObject().setValue(context, MemberNames.nomineelastname.toString(), nomineelastname);
	}

	/**
	 * Get value of nomineeminor
	 * @param nomineeminor
	 */
	public final myfirstmodule.proxies.nomineeminor getnomineeminor()
	{
		return getnomineeminor(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineeminor
	 */
	public final myfirstmodule.proxies.nomineeminor getnomineeminor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.nomineeminor.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.nomineeminor.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of nomineeminor
	 * @param nomineeminor
	 */
	public final void setnomineeminor(myfirstmodule.proxies.nomineeminor nomineeminor)
	{
		setnomineeminor(getContext(), nomineeminor);
	}

	/**
	 * Set value of nomineeminor
	 * @param context
	 * @param nomineeminor
	 */
	public final void setnomineeminor(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.nomineeminor nomineeminor)
	{
		if (nomineeminor != null) {
			getMendixObject().setValue(context, MemberNames.nomineeminor.toString(), nomineeminor.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.nomineeminor.toString(), null);
		}
	}

	/**
	 * @return value of nomineerelation
	 */
	public final java.lang.String getnomineerelation()
	{
		return getnomineerelation(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineerelation
	 */
	public final java.lang.String getnomineerelation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nomineerelation.toString());
	}

	/**
	 * Set value of nomineerelation
	 * @param nomineerelation
	 */
	public final void setnomineerelation(java.lang.String nomineerelation)
	{
		setnomineerelation(getContext(), nomineerelation);
	}

	/**
	 * Set value of nomineerelation
	 * @param context
	 * @param nomineerelation
	 */
	public final void setnomineerelation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nomineerelation)
	{
		getMendixObject().setValue(context, MemberNames.nomineerelation.toString(), nomineerelation);
	}

	/**
	 * @return value of applicable
	 */
	public final java.lang.String getapplicable()
	{
		return getapplicable(getContext());
	}

	/**
	 * @param context
	 * @return value of applicable
	 */
	public final java.lang.String getapplicable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.applicable.toString());
	}

	/**
	 * Set value of applicable
	 * @param applicable
	 */
	public final void setapplicable(java.lang.String applicable)
	{
		setapplicable(getContext(), applicable);
	}

	/**
	 * Set value of applicable
	 * @param context
	 * @param applicable
	 */
	public final void setapplicable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String applicable)
	{
		getMendixObject().setValue(context, MemberNames.applicable.toString(), applicable);
	}

	/**
	 * @return value of dateofbirth
	 */
	public final java.util.Date getdateofbirth()
	{
		return getdateofbirth(getContext());
	}

	/**
	 * @param context
	 * @return value of dateofbirth
	 */
	public final java.util.Date getdateofbirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.dateofbirth.toString());
	}

	/**
	 * Set value of dateofbirth
	 * @param dateofbirth
	 */
	public final void setdateofbirth(java.util.Date dateofbirth)
	{
		setdateofbirth(getContext(), dateofbirth);
	}

	/**
	 * Set value of dateofbirth
	 * @param context
	 * @param dateofbirth
	 */
	public final void setdateofbirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.dateofbirth.toString(), dateofbirth);
	}

	/**
	 * Get value of panexempt
	 * @param panexempt
	 */
	public final myfirstmodule.proxies.panexempt getpanexempt()
	{
		return getpanexempt(getContext());
	}

	/**
	 * @param context
	 * @return value of panexempt
	 */
	public final myfirstmodule.proxies.panexempt getpanexempt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.panexempt.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.panexempt.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of panexempt
	 * @param panexempt
	 */
	public final void setpanexempt(myfirstmodule.proxies.panexempt panexempt)
	{
		setpanexempt(getContext(), panexempt);
	}

	/**
	 * Set value of panexempt
	 * @param context
	 * @param panexempt
	 */
	public final void setpanexempt(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.panexempt panexempt)
	{
		if (panexempt != null) {
			getMendixObject().setValue(context, MemberNames.panexempt.toString(), panexempt.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.panexempt.toString(), null);
		}
	}

	/**
	 * @return value of nomineepan
	 */
	public final java.lang.String getnomineepan()
	{
		return getnomineepan(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineepan
	 */
	public final java.lang.String getnomineepan(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nomineepan.toString());
	}

	/**
	 * Set value of nomineepan
	 * @param nomineepan
	 */
	public final void setnomineepan(java.lang.String nomineepan)
	{
		setnomineepan(getContext(), nomineepan);
	}

	/**
	 * Set value of nomineepan
	 * @param context
	 * @param nomineepan
	 */
	public final void setnomineepan(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nomineepan)
	{
		getMendixObject().setValue(context, MemberNames.nomineepan.toString(), nomineepan);
	}

	/**
	 * Get value of nomineeauthentication
	 * @param nomineeauthentication
	 */
	public final myfirstmodule.proxies.nomineeauth getnomineeauthentication()
	{
		return getnomineeauthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of nomineeauthentication
	 */
	public final myfirstmodule.proxies.nomineeauth getnomineeauthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.nomineeauthentication.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.nomineeauth.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of nomineeauthentication
	 * @param nomineeauthentication
	 */
	public final void setnomineeauthentication(myfirstmodule.proxies.nomineeauth nomineeauthentication)
	{
		setnomineeauthentication(getContext(), nomineeauthentication);
	}

	/**
	 * Set value of nomineeauthentication
	 * @param context
	 * @param nomineeauthentication
	 */
	public final void setnomineeauthentication(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.nomineeauth nomineeauthentication)
	{
		if (nomineeauthentication != null) {
			getMendixObject().setValue(context, MemberNames.nomineeauthentication.toString(), nomineeauthentication.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.nomineeauthentication.toString(), null);
		}
	}

	/**
	 * @return value of step6completed
	 */
	public final java.lang.Boolean getstep6completed()
	{
		return getstep6completed(getContext());
	}

	/**
	 * @param context
	 * @return value of step6completed
	 */
	public final java.lang.Boolean getstep6completed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.step6completed.toString());
	}

	/**
	 * Set value of step6completed
	 * @param step6completed
	 */
	public final void setstep6completed(java.lang.Boolean step6completed)
	{
		setstep6completed(getContext(), step6completed);
	}

	/**
	 * Set value of step6completed
	 * @param context
	 * @param step6completed
	 */
	public final void setstep6completed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean step6completed)
	{
		getMendixObject().setValue(context, MemberNames.step6completed.toString(), step6completed);
	}

	/**
	 * @return value of gaurdianfirstname
	 */
	public final java.lang.String getgaurdianfirstname()
	{
		return getgaurdianfirstname(getContext());
	}

	/**
	 * @param context
	 * @return value of gaurdianfirstname
	 */
	public final java.lang.String getgaurdianfirstname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.gaurdianfirstname.toString());
	}

	/**
	 * Set value of gaurdianfirstname
	 * @param gaurdianfirstname
	 */
	public final void setgaurdianfirstname(java.lang.String gaurdianfirstname)
	{
		setgaurdianfirstname(getContext(), gaurdianfirstname);
	}

	/**
	 * Set value of gaurdianfirstname
	 * @param context
	 * @param gaurdianfirstname
	 */
	public final void setgaurdianfirstname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gaurdianfirstname)
	{
		getMendixObject().setValue(context, MemberNames.gaurdianfirstname.toString(), gaurdianfirstname);
	}

	/**
	 * @return value of guardianlastname
	 */
	public final java.lang.String getguardianlastname()
	{
		return getguardianlastname(getContext());
	}

	/**
	 * @param context
	 * @return value of guardianlastname
	 */
	public final java.lang.String getguardianlastname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.guardianlastname.toString());
	}

	/**
	 * Set value of guardianlastname
	 * @param guardianlastname
	 */
	public final void setguardianlastname(java.lang.String guardianlastname)
	{
		setguardianlastname(getContext(), guardianlastname);
	}

	/**
	 * Set value of guardianlastname
	 * @param context
	 * @param guardianlastname
	 */
	public final void setguardianlastname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String guardianlastname)
	{
		getMendixObject().setValue(context, MemberNames.guardianlastname.toString(), guardianlastname);
	}

	/**
	 * @return value of gaurdianmiddlename
	 */
	public final java.lang.String getgaurdianmiddlename()
	{
		return getgaurdianmiddlename(getContext());
	}

	/**
	 * @param context
	 * @return value of gaurdianmiddlename
	 */
	public final java.lang.String getgaurdianmiddlename(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.gaurdianmiddlename.toString());
	}

	/**
	 * Set value of gaurdianmiddlename
	 * @param gaurdianmiddlename
	 */
	public final void setgaurdianmiddlename(java.lang.String gaurdianmiddlename)
	{
		setgaurdianmiddlename(getContext(), gaurdianmiddlename);
	}

	/**
	 * Set value of gaurdianmiddlename
	 * @param context
	 * @param gaurdianmiddlename
	 */
	public final void setgaurdianmiddlename(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gaurdianmiddlename)
	{
		getMendixObject().setValue(context, MemberNames.gaurdianmiddlename.toString(), gaurdianmiddlename);
	}

	/**
	 * @return value of guardianpanexempt
	 */
	public final java.lang.Boolean getguardianpanexempt()
	{
		return getguardianpanexempt(getContext());
	}

	/**
	 * @param context
	 * @return value of guardianpanexempt
	 */
	public final java.lang.Boolean getguardianpanexempt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.guardianpanexempt.toString());
	}

	/**
	 * Set value of guardianpanexempt
	 * @param guardianpanexempt
	 */
	public final void setguardianpanexempt(java.lang.Boolean guardianpanexempt)
	{
		setguardianpanexempt(getContext(), guardianpanexempt);
	}

	/**
	 * Set value of guardianpanexempt
	 * @param context
	 * @param guardianpanexempt
	 */
	public final void setguardianpanexempt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean guardianpanexempt)
	{
		getMendixObject().setValue(context, MemberNames.guardianpanexempt.toString(), guardianpanexempt);
	}

	/**
	 * Get value of guardianpancategory
	 * @param guardianpancategory
	 */
	public final myfirstmodule.proxies.pancategory getguardianpancategory()
	{
		return getguardianpancategory(getContext());
	}

	/**
	 * @param context
	 * @return value of guardianpancategory
	 */
	public final myfirstmodule.proxies.pancategory getguardianpancategory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.guardianpancategory.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.pancategory.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of guardianpancategory
	 * @param guardianpancategory
	 */
	public final void setguardianpancategory(myfirstmodule.proxies.pancategory guardianpancategory)
	{
		setguardianpancategory(getContext(), guardianpancategory);
	}

	/**
	 * Set value of guardianpancategory
	 * @param context
	 * @param guardianpancategory
	 */
	public final void setguardianpancategory(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.pancategory guardianpancategory)
	{
		if (guardianpancategory != null) {
			getMendixObject().setValue(context, MemberNames.guardianpancategory.toString(), guardianpancategory.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.guardianpancategory.toString(), null);
		}
	}

	/**
	 * @return value of guardianpkern
	 */
	public final java.lang.String getguardianpkern()
	{
		return getguardianpkern(getContext());
	}

	/**
	 * @param context
	 * @return value of guardianpkern
	 */
	public final java.lang.String getguardianpkern(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.guardianpkern.toString());
	}

	/**
	 * Set value of guardianpkern
	 * @param guardianpkern
	 */
	public final void setguardianpkern(java.lang.String guardianpkern)
	{
		setguardianpkern(getContext(), guardianpkern);
	}

	/**
	 * Set value of guardianpkern
	 * @param context
	 * @param guardianpkern
	 */
	public final void setguardianpkern(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String guardianpkern)
	{
		getMendixObject().setValue(context, MemberNames.guardianpkern.toString(), guardianpkern);
	}

	/**
	 * @return value of gaurdiandateofbirth
	 */
	public final java.lang.String getgaurdiandateofbirth()
	{
		return getgaurdiandateofbirth(getContext());
	}

	/**
	 * @param context
	 * @return value of gaurdiandateofbirth
	 */
	public final java.lang.String getgaurdiandateofbirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.gaurdiandateofbirth.toString());
	}

	/**
	 * Set value of gaurdiandateofbirth
	 * @param gaurdiandateofbirth
	 */
	public final void setgaurdiandateofbirth(java.lang.String gaurdiandateofbirth)
	{
		setgaurdiandateofbirth(getContext(), gaurdiandateofbirth);
	}

	/**
	 * Set value of gaurdiandateofbirth
	 * @param context
	 * @param gaurdiandateofbirth
	 */
	public final void setgaurdiandateofbirth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gaurdiandateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.gaurdiandateofbirth.toString(), gaurdiandateofbirth);
	}

	/**
	 * @return value of gaurdianpan
	 */
	public final java.lang.String getgaurdianpan()
	{
		return getgaurdianpan(getContext());
	}

	/**
	 * @param context
	 * @return value of gaurdianpan
	 */
	public final java.lang.String getgaurdianpan(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.gaurdianpan.toString());
	}

	/**
	 * Set value of gaurdianpan
	 * @param gaurdianpan
	 */
	public final void setgaurdianpan(java.lang.String gaurdianpan)
	{
		setgaurdianpan(getContext(), gaurdianpan);
	}

	/**
	 * Set value of gaurdianpan
	 * @param context
	 * @param gaurdianpan
	 */
	public final void setgaurdianpan(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gaurdianpan)
	{
		getMendixObject().setValue(context, MemberNames.gaurdianpan.toString(), gaurdianpan);
	}

	/**
	 * @return value of dataid
	 */
	public final java.lang.Integer getdataid()
	{
		return getdataid(getContext());
	}

	/**
	 * @param context
	 * @return value of dataid
	 */
	public final java.lang.Integer getdataid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.dataid.toString());
	}

	/**
	 * Set value of dataid
	 * @param dataid
	 */
	public final void setdataid(java.lang.Integer dataid)
	{
		setdataid(getContext(), dataid);
	}

	/**
	 * Set value of dataid
	 * @param context
	 * @param dataid
	 */
	public final void setdataid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer dataid)
	{
		getMendixObject().setValue(context, MemberNames.dataid.toString(), dataid);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nominationsMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.nominations that = (myfirstmodule.proxies.nominations) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}