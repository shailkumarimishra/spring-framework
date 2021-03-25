package com.ioc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class StudentIdEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) {
		String[] str = text.split("-");
		StudentId sid = new StudentId(Integer.parseInt(str[1]), str[0]);
		this.setValue(sid);
	}
}
