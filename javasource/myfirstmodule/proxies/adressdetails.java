// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class adressdetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject adressdetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.adressdetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		adresstype("adresstype"),
		adressline1("adressline1"),
		adressline2("adressline2"),
		adressline3("adressline3"),
		pincode("pincode"),
		city("city"),
		state("state"),
		country("country"),
		residencephone("residencephone"),
		residencefax("residencefax"),
		officephone("officephone"),
		officefax("officefax"),
		communicationmode("communicationmode"),
		step5completed("step5completed");

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

	public adressdetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected adressdetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject adressdetailsMendixObject)
	{
		if (adressdetailsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, adressdetailsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.adressdetailsMendixObject = adressdetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'adressdetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.adressdetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.adressdetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.adressdetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.adressdetails(context, mendixObject);
	}

	public static myfirstmodule.proxies.adressdetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.adressdetails.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.adressdetails> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.adressdetails.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of adresstype
	 * @param adresstype
	 */
	public final myfirstmodule.proxies.adresstype getadresstype()
	{
		return getadresstype(getContext());
	}

	/**
	 * @param context
	 * @return value of adresstype
	 */
	public final myfirstmodule.proxies.adresstype getadresstype(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.adresstype.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.adresstype.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of adresstype
	 * @param adresstype
	 */
	public final void setadresstype(myfirstmodule.proxies.adresstype adresstype)
	{
		setadresstype(getContext(), adresstype);
	}

	/**
	 * Set value of adresstype
	 * @param context
	 * @param adresstype
	 */
	public final void setadresstype(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.adresstype adresstype)
	{
		if (adresstype != null) {
			getMendixObject().setValue(context, MemberNames.adresstype.toString(), adresstype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.adresstype.toString(), null);
		}
	}

	/**
	 * @return value of adressline1
	 */
	public final java.lang.String getadressline1()
	{
		return getadressline1(getContext());
	}

	/**
	 * @param context
	 * @return value of adressline1
	 */
	public final java.lang.String getadressline1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.adressline1.toString());
	}

	/**
	 * Set value of adressline1
	 * @param adressline1
	 */
	public final void setadressline1(java.lang.String adressline1)
	{
		setadressline1(getContext(), adressline1);
	}

	/**
	 * Set value of adressline1
	 * @param context
	 * @param adressline1
	 */
	public final void setadressline1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String adressline1)
	{
		getMendixObject().setValue(context, MemberNames.adressline1.toString(), adressline1);
	}

	/**
	 * @return value of adressline2
	 */
	public final java.lang.String getadressline2()
	{
		return getadressline2(getContext());
	}

	/**
	 * @param context
	 * @return value of adressline2
	 */
	public final java.lang.String getadressline2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.adressline2.toString());
	}

	/**
	 * Set value of adressline2
	 * @param adressline2
	 */
	public final void setadressline2(java.lang.String adressline2)
	{
		setadressline2(getContext(), adressline2);
	}

	/**
	 * Set value of adressline2
	 * @param context
	 * @param adressline2
	 */
	public final void setadressline2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String adressline2)
	{
		getMendixObject().setValue(context, MemberNames.adressline2.toString(), adressline2);
	}

	/**
	 * @return value of adressline3
	 */
	public final java.lang.String getadressline3()
	{
		return getadressline3(getContext());
	}

	/**
	 * @param context
	 * @return value of adressline3
	 */
	public final java.lang.String getadressline3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.adressline3.toString());
	}

	/**
	 * Set value of adressline3
	 * @param adressline3
	 */
	public final void setadressline3(java.lang.String adressline3)
	{
		setadressline3(getContext(), adressline3);
	}

	/**
	 * Set value of adressline3
	 * @param context
	 * @param adressline3
	 */
	public final void setadressline3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String adressline3)
	{
		getMendixObject().setValue(context, MemberNames.adressline3.toString(), adressline3);
	}

	/**
	 * @return value of pincode
	 */
	public final java.lang.String getpincode()
	{
		return getpincode(getContext());
	}

	/**
	 * @param context
	 * @return value of pincode
	 */
	public final java.lang.String getpincode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.pincode.toString());
	}

	/**
	 * Set value of pincode
	 * @param pincode
	 */
	public final void setpincode(java.lang.String pincode)
	{
		setpincode(getContext(), pincode);
	}

	/**
	 * Set value of pincode
	 * @param context
	 * @param pincode
	 */
	public final void setpincode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pincode)
	{
		getMendixObject().setValue(context, MemberNames.pincode.toString(), pincode);
	}

	/**
	 * @return value of city
	 */
	public final java.lang.String getcity()
	{
		return getcity(getContext());
	}

	/**
	 * @param context
	 * @return value of city
	 */
	public final java.lang.String getcity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.city.toString());
	}

	/**
	 * Set value of city
	 * @param city
	 */
	public final void setcity(java.lang.String city)
	{
		setcity(getContext(), city);
	}

	/**
	 * Set value of city
	 * @param context
	 * @param city
	 */
	public final void setcity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String city)
	{
		getMendixObject().setValue(context, MemberNames.city.toString(), city);
	}

	/**
	 * @return value of state
	 */
	public final java.lang.String getstate()
	{
		return getstate(getContext());
	}

	/**
	 * @param context
	 * @return value of state
	 */
	public final java.lang.String getstate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.state.toString());
	}

	/**
	 * Set value of state
	 * @param state
	 */
	public final void setstate(java.lang.String state)
	{
		setstate(getContext(), state);
	}

	/**
	 * Set value of state
	 * @param context
	 * @param state
	 */
	public final void setstate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String state)
	{
		getMendixObject().setValue(context, MemberNames.state.toString(), state);
	}

	/**
	 * @return value of country
	 */
	public final java.lang.String getcountry()
	{
		return getcountry(getContext());
	}

	/**
	 * @param context
	 * @return value of country
	 */
	public final java.lang.String getcountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.country.toString());
	}

	/**
	 * Set value of country
	 * @param country
	 */
	public final void setcountry(java.lang.String country)
	{
		setcountry(getContext(), country);
	}

	/**
	 * Set value of country
	 * @param context
	 * @param country
	 */
	public final void setcountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.country.toString(), country);
	}

	/**
	 * @return value of residencephone
	 */
	public final java.lang.String getresidencephone()
	{
		return getresidencephone(getContext());
	}

	/**
	 * @param context
	 * @return value of residencephone
	 */
	public final java.lang.String getresidencephone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.residencephone.toString());
	}

	/**
	 * Set value of residencephone
	 * @param residencephone
	 */
	public final void setresidencephone(java.lang.String residencephone)
	{
		setresidencephone(getContext(), residencephone);
	}

	/**
	 * Set value of residencephone
	 * @param context
	 * @param residencephone
	 */
	public final void setresidencephone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String residencephone)
	{
		getMendixObject().setValue(context, MemberNames.residencephone.toString(), residencephone);
	}

	/**
	 * @return value of residencefax
	 */
	public final java.lang.String getresidencefax()
	{
		return getresidencefax(getContext());
	}

	/**
	 * @param context
	 * @return value of residencefax
	 */
	public final java.lang.String getresidencefax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.residencefax.toString());
	}

	/**
	 * Set value of residencefax
	 * @param residencefax
	 */
	public final void setresidencefax(java.lang.String residencefax)
	{
		setresidencefax(getContext(), residencefax);
	}

	/**
	 * Set value of residencefax
	 * @param context
	 * @param residencefax
	 */
	public final void setresidencefax(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String residencefax)
	{
		getMendixObject().setValue(context, MemberNames.residencefax.toString(), residencefax);
	}

	/**
	 * @return value of officephone
	 */
	public final java.lang.String getofficephone()
	{
		return getofficephone(getContext());
	}

	/**
	 * @param context
	 * @return value of officephone
	 */
	public final java.lang.String getofficephone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.officephone.toString());
	}

	/**
	 * Set value of officephone
	 * @param officephone
	 */
	public final void setofficephone(java.lang.String officephone)
	{
		setofficephone(getContext(), officephone);
	}

	/**
	 * Set value of officephone
	 * @param context
	 * @param officephone
	 */
	public final void setofficephone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String officephone)
	{
		getMendixObject().setValue(context, MemberNames.officephone.toString(), officephone);
	}

	/**
	 * @return value of officefax
	 */
	public final java.lang.String getofficefax()
	{
		return getofficefax(getContext());
	}

	/**
	 * @param context
	 * @return value of officefax
	 */
	public final java.lang.String getofficefax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.officefax.toString());
	}

	/**
	 * Set value of officefax
	 * @param officefax
	 */
	public final void setofficefax(java.lang.String officefax)
	{
		setofficefax(getContext(), officefax);
	}

	/**
	 * Set value of officefax
	 * @param context
	 * @param officefax
	 */
	public final void setofficefax(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String officefax)
	{
		getMendixObject().setValue(context, MemberNames.officefax.toString(), officefax);
	}

	/**
	 * Set value of communicationmode
	 * @param communicationmode
	 */
	public final myfirstmodule.proxies.communicationmode getcommunicationmode()
	{
		return getcommunicationmode(getContext());
	}

	/**
	 * @param context
	 * @return value of communicationmode
	 */
	public final myfirstmodule.proxies.communicationmode getcommunicationmode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.communicationmode.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.communicationmode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of communicationmode
	 * @param communicationmode
	 */
	public final void setcommunicationmode(myfirstmodule.proxies.communicationmode communicationmode)
	{
		setcommunicationmode(getContext(), communicationmode);
	}

	/**
	 * Set value of communicationmode
	 * @param context
	 * @param communicationmode
	 */
	public final void setcommunicationmode(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.communicationmode communicationmode)
	{
		if (communicationmode != null) {
			getMendixObject().setValue(context, MemberNames.communicationmode.toString(), communicationmode.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.communicationmode.toString(), null);
		}
	}

	/**
	 * @return value of step5completed
	 */
	public final java.lang.Boolean getstep5completed()
	{
		return getstep5completed(getContext());
	}

	/**
	 * @param context
	 * @return value of step5completed
	 */
	public final java.lang.Boolean getstep5completed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.step5completed.toString());
	}

	/**
	 * Set value of step5completed
	 * @param step5completed
	 */
	public final void setstep5completed(java.lang.Boolean step5completed)
	{
		setstep5completed(getContext(), step5completed);
	}

	/**
	 * Set value of step5completed
	 * @param context
	 * @param step5completed
	 */
	public final void setstep5completed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean step5completed)
	{
		getMendixObject().setValue(context, MemberNames.step5completed.toString(), step5completed);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return adressdetailsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
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
			final myfirstmodule.proxies.adressdetails that = (myfirstmodule.proxies.adressdetails) obj;
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
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
