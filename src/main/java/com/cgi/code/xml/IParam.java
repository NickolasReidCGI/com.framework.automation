package com.cgi.code.xml;

import org.openqa.selenium.By;
/**
 * 
 *
 */
public interface IParam {
	/**
	 * Gets the value from an XML element.
	 */
	public String getValue();
	/**
	 * Gets the attribute name of an XML element.
	 */
	public String getAttribute();
	/**
	 * Returns a Selenium "By" object.
	 */
	public By execute();
}





