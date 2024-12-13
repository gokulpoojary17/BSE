// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import java.util.regex.Pattern;

public class Java_ValidFirstName extends CustomJavaAction<java.lang.Boolean>
{
	private final java.lang.String FirstName;

	public Java_ValidFirstName(
		IContext context,
		java.lang.String _firstName
	)
	{
		super(context);
		this.FirstName = _firstName;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        // Define the regex pattern for minimum 20 letters only
        String namePattern = "^[a-zA-Z]{2,}$";

        // Validate the name using regex
        if (this.FirstName == null || this.FirstName.isEmpty()) {
            return false; // Invalid if FirstName is null or empty
        }

        return Pattern.matches(namePattern, this.FirstName);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Java_ValidFirstName";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
