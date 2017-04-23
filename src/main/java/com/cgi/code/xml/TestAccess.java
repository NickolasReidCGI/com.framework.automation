package com.cgi.code.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;
/**
 * Reads the XML sheet and returns DataSets as a list, see ObjectMapping.xml
 * 
 *
 */
public class TestAccess {

	private static final Logger logger = Logger.getLogger(TestAccess.class.getName());
	
	/**
	 * Moves to the node specified and gets all the xml data found in it.
	 * @param elementId XML node to look in.
	 * @return TestCaseXMLData Object containing lists of data used in our tests.
	 */
	public List<IXMLParam> XmlFactor(String elementId) {
		XMLInputFactory inputFacotry = XMLInputFactory.newFactory();
		StreamSource xml = new StreamSource("XML\\Object Mapping.xml");
		XMLStreamReader streamReader;
		List<IXMLParam> ret = new ArrayList<IXMLParam>();
		try {
			streamReader = inputFacotry.createXMLStreamReader(xml);
			while (streamReader.hasNext()) {
				if (streamReader.isStartElement()
						&& elementId.equals(streamReader.getLocalName())) {
					break;
				}
				streamReader.next();
			}
			JAXBContext context = JAXBContext.newInstance(TestCaseXMLDataContainer.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			TestCaseXMLDataContainer container = unmarshaller.unmarshal(
					streamReader, TestCaseXMLDataContainer.class).getValue();
			ret = combineXMLTest(container.getData());
		} catch (XMLStreamException | JAXBException e) {
			logger.fatal("There was a problem reading the Object Mapping XML file " + 
					e.getClass().getSimpleName() + " " + e.getMessage());
		}
		return ret;
	}

	private List<IXMLParam> combineXMLTest(List<TestCaseXMLData> list) {
		List<IXMLParam> ret = new ArrayList<IXMLParam>();
		//HashMap<String,?> map = null;
		try{
			for (int i = 0; i < list.size(); i++) {
				TestCaseXMLData tmp = list.get(i);
				ret.addAll(tmp.getJscript());
				ret.addAll(tmp.getClassName());
				ret.addAll(tmp.getCss());
				ret.addAll(tmp.getCssSelector());
				ret.addAll(tmp.getId());
				ret.addAll(tmp.getLink());
				ret.addAll(tmp.getLinkText());
				ret.addAll(tmp.getName());
				ret.addAll(tmp.getPartialLinkText());
				ret.addAll(tmp.getTag());
				ret.addAll(tmp.getTagName());
				ret.addAll(tmp.getXpath());
			}
			
			//map.putAll(ret.)
		}
			catch(NullPointerException e)
			{
				logger.fatal("There was a problem reading the Object Mapping XML file " + 
						e.getClass().getSimpleName() + " " + e.getMessage());
			}
		
		return ret;
	}
}
