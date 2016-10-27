package com.lzy.bottomdialogdemo.bottomdialog.bean;

/**
 * 类描述：ButtomDialog中ListView数据应用的实体类
 * 
 * @Time 2016年4月18日
 * @author lizy18
 */
public class DialogListViewItem {
	CharSequence text;

	public DialogListViewItem(CharSequence text) {
		this.text = text;
	}

	public CharSequence getText() {
		return text;
	}

	public void setText(CharSequence text) {
		this.text = text;
	}

}
