package com.cgi.code.xml;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.cgi.code.xml.XMLParams.Jscript;
import com.cgi.code.xml.XMLParams.ClassNameParam;
import com.cgi.code.xml.XMLParams.CssParam;
import com.cgi.code.xml.XMLParams.CssSelectorParam;
import com.cgi.code.xml.XMLParams.IDParam;
import com.cgi.code.xml.XMLParams.LinkParam;
import com.cgi.code.xml.XMLParams.LinkTextParam;
import com.cgi.code.xml.XMLParams.NameParam;
import com.cgi.code.xml.XMLParams.PartialLinkTextParam;
import com.cgi.code.xml.XMLParams.TagNameParam;
import com.cgi.code.xml.XMLParams.TagParam;
import com.cgi.code.xml.XMLParams.XPathParam;

/**
 * Used with JAXB to create objects containing lists of elements to be used the
 * framework. The elements are organized by type.
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCaseXMLData {	
	@XmlElementWrapper(name = "Jscript")
	@XmlElement(name = "item")
	private Collection<Jscript> Jscript;
	@XmlElementWrapper(name = "className")
	@XmlElement(name = "item")
	private Collection<ClassNameParam> className;
	@XmlElementWrapper(name = "css")
	@XmlElement(name = "item")
	private Collection<CssParam> css;
	@XmlElementWrapper(name = "cssSelector")
	@XmlElement(name = "item")
	private Collection<CssSelectorParam> cssSelector;
	@XmlElementWrapper(name = "id")
	@XmlElement(name = "item")
	private Collection<IDParam> id;
	@XmlElementWrapper(name = "link")
	@XmlElement(name = "item")
	private Collection<LinkParam> link;
	@XmlElementWrapper(name = "linkText")
	@XmlElement(name = "item")
	private Collection<LinkTextParam> linkText;
	@XmlElementWrapper(name = "name")
	@XmlElement(name = "item")
	private Collection<NameParam> name;
	@XmlElementWrapper(name = "partialLinkText")
	@XmlElement(name = "item")
	private Collection<PartialLinkTextParam> partialLinkText;
	@XmlElementWrapper(name = "tag")
	@XmlElement(name = "item")
	private Collection<TagParam> tag;
	@XmlElementWrapper(name = "tagName")
	@XmlElement(name = "item")
	private Collection<TagNameParam> tagName;
	@XmlElementWrapper(name = "xpath")
	@XmlElement(name = "item")
	private Collection<XPathParam> xpath;

	public Collection<ClassNameParam> getClassName() {
		return className;
	}

	public void addClassName(Collection<ClassNameParam> className) {
		if (className != null) {
			this.className.addAll(className);
		}
	}

	public Collection<CssParam> getCss() {
		return css;
	}

	public void addCss(Collection<CssParam> css) {
		if (css != null) {
			this.css.addAll(css);
		}
	}

	public Collection<CssSelectorParam> getCssSelector() {
		return cssSelector;
	}

	public void addCssSelector(Collection<CssSelectorParam> cssSelector) {
		if (cssSelector != null) {
			this.cssSelector.addAll(cssSelector);
		}
	}

	public Collection<IDParam> getId() {
		return id;
	}

	public void addId(Collection<IDParam> id) {
		if (id != null) {
			this.id.addAll(id);
		}
	}

	public Collection<LinkParam> getLink() {
		return link;
	}

	public void addLink(Collection<LinkParam> link) {
		if (link != null) {
			this.link.addAll(link);
		}
	}

	public Collection<LinkTextParam> getLinkText() {
		return linkText;
	}

	public void addLinkText(Collection<LinkTextParam> linkText) {
		if (linkText != null) {
			this.linkText.addAll(linkText);
		}
	}

	public Collection<NameParam> getName() {
		return name;
	}

	public void addName(Collection<NameParam> name) {
		if (name != null) {
			this.name.addAll(name);
		}
	}

	public Collection<PartialLinkTextParam> getPartialLinkText() {
		return partialLinkText;
	}

	public void addPartialLinkText(Collection<PartialLinkTextParam> partialLinkText) {
		if (partialLinkText != null) {
			this.partialLinkText.addAll(partialLinkText);
		}
	}

	public Collection<TagParam> getTag() {
		return tag;
	}

	public void addTag(Collection<TagParam> tag) {
		if (tag != null) {
			this.tag.addAll(tag);
		}
	}

	public Collection<TagNameParam> getTagName() {
		return tagName;
	}

	public void addTagName(Collection<TagNameParam> tagName) {
		if (tagName != null) {
			this.tagName.addAll(tagName);
		}
	}

	public Collection<XPathParam> getXpath() {
		return xpath;
	}

	public void addXpath(Collection<XPathParam> xpath) {
		if (xpath != null) {
			this.xpath.addAll(xpath);
		}
	}
	
	public Collection<Jscript> getJscript() {
		return Jscript;
	}

	public void addJscript(Collection<Jscript> Jscript) {
		if (Jscript != null) {
			this.Jscript.addAll(Jscript);
		}
	}
}
