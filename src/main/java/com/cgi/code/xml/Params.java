package com.cgi.code.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import org.openqa.selenium.By;
import com.cgi.code.xml.IParam;

/**
 * Holds inner classes that define lists of IParam
 * 
 * 
 */
public class Params {

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class ClassNameParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type className using the XML
		 * element value.
		 */
		public By execute() {
			return By.className(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class CssParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type cssSelector using the XML
		 * element value.
		 */
		public By execute() {
			return By.cssSelector(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class CssSelectorParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type cssSelector using the XML
		 * element value.
		 */
		public By execute() {
			return By.cssSelector(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class IDParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type id using the XML element
		 * value.
		 */
		public By execute() {
			return By.id(this.value);
		}
	}
	
	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class LinkParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type linkText using the XML element
		 * value.
		 */
		public By execute() {
			return By.linkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class LinkTextParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type linkText using the XML element
		 * value.
		 */
		public By execute() {
			return By.linkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class NameParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type name using the XML element
		 * value.
		 */
		public By execute() {
			return By.name(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class PartialLinkTextParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type partialLinkText using the XML
		 * element value.
		 */
		public By execute() {
			return By.partialLinkText(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class TagNameParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type tagName using the XML element
		 * value.
		 */
		public By execute() {
			return By.tagName(this.value);
		}
	}

	public static class TagParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type tagName using the XML element
		 * value.
		 */
		public By execute() {
			return By.tagName(this.value);
		}
	}

	/**
	 * 
	 * @author Kevin Cormier
	 * 
	 */
	public static class XPathParam implements IParam {
		@XmlValue
		private String value;
		@XmlAttribute(name = "name")
		private String attribute;

		/**
		 * Gets the value from an XML element.
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Gets the attribute name of an XML element.
		 */
		public String getAttribute() {
			return attribute;
		}

		/**
		 * Returns a Selenium "By" object of type xpath using the XML element
		 * value.
		 */
		public By execute() {
			return By.xpath(this.value);
		}
	}
}
