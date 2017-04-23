package com.cgi.code.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import org.openqa.selenium.By;
import com.cgi.code.xml.IXMLParam;

/**
 * Holds inner classes that define lists of IXMLParam
 * 
 * 
 */
public class XMLParams {

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class ClassNameParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type className using the XML
		 * element value.
		 */
		public By getSeleniumByObject() {
			return By.className(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class CssParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type cssSelector using the XML
		 * element value.
		 */
		public By getSeleniumByObject() {
			return By.cssSelector(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class CssSelectorParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type cssSelector using the XML
		 * element value.
		 */
		public By getSeleniumByObject() {
			return By.cssSelector(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class IDParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type id using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.id(this.value);
		}
	}
	
	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class LinkParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type linkText using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.linkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class LinkTextParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type linkText using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.linkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class NameParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type name using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.name(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class PartialLinkTextParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type partialLinkText using the XML
		 * element value.
		 */
		public By getSeleniumByObject() {
			return By.partialLinkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class TagNameParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type tagName using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.tagName(this.value);
		}
	}

	public static class TagParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type tagName using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.tagName(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class XPathParam implements IXMLParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		public String getValue() {
			return value;
		}

		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type xpath using the XML element
		 * value.
		 */
		public By getSeleniumByObject() {
			return By.xpath(this.value);
		}
	}
	
	public static class Jscript implements IXMLParam {
		@XmlValue 
		private String value;
		@XmlAttribute(name = "name")
		private String attribute; 
		
		//Need logger and extentTest.log here if value = null ????
		
		public String executeJS() { 
			return value = (value == null) ? "alert('JavaScript Failed');" : value;
		}

		public String getValue() {
			// TODO Auto-generated method stub
			return value = (value == null) ? "alert('JavaScript Failed');" : value;
		}

		public String getAttribute() {
			// TODO Auto-generated method stub
			return attribute;
		}

		public By getSeleniumByObject() {
			// TODO Auto-generated method stub
			return null;
		}
			
		/*@SuppressWarnings("null")
		public JavascriptExecutor executeJS()
		{
			WebDriver ret = null;			
					
			return (JavascriptExecutor) ((JavascriptExecutor) ret).executeScript(value);
		}*/		
	}

}
