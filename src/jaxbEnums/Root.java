package jaxbEnums;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "local", "ref" })
@XmlRootElement(name = "root")
public class Root {
	@XmlElement(required = true)
	protected MyEnum local;
	@XmlElement(required = true)
	protected MyEnum ref;

	public MyEnum getLocal() {
		return local;
	}

	public void setLocal(MyEnum local) {
		this.local = local;
	}

	public MyEnum getRef() {
		return ref;
	}

	public void setRef(MyEnum ref) {
		this.ref = ref;
	}

}
