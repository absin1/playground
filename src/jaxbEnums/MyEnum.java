package jaxbEnums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "myEnum")
@XmlEnum
public enum MyEnum {
	My_ENUM_1, MY_ENUM_2;
	public String value() {
		return name();
	}

	public static MyEnum fromValue(String v) {
		return valueOf(v);
	}
}
