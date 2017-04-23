package com.cgi.code.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * This class allows us to make a list of all relevant child nodes in ObjectMapping.xml.
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCaseXMLDataContainer {
	@XmlElement(name = "DataSet")
	List<TestCaseXMLData> data;
	
	public List<TestCaseXMLData> getData() {
		return data;
	}
}
