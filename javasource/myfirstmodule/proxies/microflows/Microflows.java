// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static void aDD_Micro(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.ADD_Micro").withParams(params).execute(context);
	}
	public static void isactive(IContext context, myfirstmodule.proxies.basicdetails _basicdetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		Core.microflowCall("MyFirstModule.isactive").withParams(params).execute(context);
	}
	public static void showform1(IContext context, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		Core.microflowCall("MyFirstModule.showform1").withParams(params).execute(context);
	}
	public static void showform2(IContext context, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.showform2").withParams(params).execute(context);
	}
	public static void showform3(IContext context, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.showform3").withParams(params).execute(context);
	}
	public static void showform5(IContext context, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.showform5").withParams(params).execute(context);
	}
	public static void showform6(IContext context, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.showform6").withParams(params).execute(context);
	}
	public static void showform7(IContext context, myfirstmodule.proxies.nominations _nominations, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.basicdetails _basicdetails, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.showform7").withParams(params).execute(context);
	}
	public static void sHOWPAGES(IContext context, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument, myfirstmodule.proxies.adressdetails _adressdetails_1, myfirstmodule.proxies.FACTA _fACTA)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		params.put("adressdetails_1", _adressdetails_1 == null ? null : _adressdetails_1.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		Core.microflowCall("MyFirstModule.SHOWPAGES").withParams(params).execute(context);
	}
	public static void step1valid(IContext context, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.step1valid").withParams(params).execute(context);
	}
	public static void step2valid(IContext context, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.step2valid").withParams(params).execute(context);
	}
	public static void step3valid(IContext context, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.step3valid").withParams(params).execute(context);
	}
	public static void step5valid(IContext context, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.FACTA _fACTA, myfirstmodule.proxies.nominations _nominations, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.step5valid").withParams(params).execute(context);
	}
	public static void step6valid(IContext context, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.nominations _nominations, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.FACTA _fACTA, system.proxies.FileDocument _fileDocument, system.proxies.FileDocument _fileDocument_2)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		params.put("FileDocument_2", _fileDocument_2 == null ? null : _fileDocument_2.getMendixObject());
		Core.microflowCall("MyFirstModule.step6valid").withParams(params).execute(context);
	}
	public static void step7valid(IContext context, myfirstmodule.proxies.adressdetails _adressdetails, myfirstmodule.proxies.bankdetails _bankdetails, myfirstmodule.proxies.basicdetails _basicdetails, myfirstmodule.proxies.clientdetails _clientdetails, myfirstmodule.proxies.holderdetails _holderdetails, myfirstmodule.proxies.nominations _nominations, myfirstmodule.proxies.FACTA _fACTA, system.proxies.FileDocument _fileDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("adressdetails", _adressdetails == null ? null : _adressdetails.getMendixObject());
		params.put("bankdetails", _bankdetails == null ? null : _bankdetails.getMendixObject());
		params.put("basicdetails", _basicdetails == null ? null : _basicdetails.getMendixObject());
		params.put("clientdetails", _clientdetails == null ? null : _clientdetails.getMendixObject());
		params.put("holderdetails", _holderdetails == null ? null : _holderdetails.getMendixObject());
		params.put("nominations", _nominations == null ? null : _nominations.getMendixObject());
		params.put("FACTA", _fACTA == null ? null : _fACTA.getMendixObject());
		params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
		Core.microflowCall("MyFirstModule.step7valid").withParams(params).execute(context);
	}
}
