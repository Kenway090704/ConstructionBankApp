package com.duguang.baseanimation.ui.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * ���е�Activity�̳еĻ���Activity,������ActionBar�˵�
 * 
 */
public abstract class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setView();
		initView();
		setListener();
	}

	/**
	 * ���ò����ļ�
	 */
	public abstract void setView();

	/**
	 * ��ʼ�������ļ��еĿؼ�
	 */
	public abstract void initView();

	/**
	 * ���ÿؼ��ļ���
	 */
	public abstract void setListener();

}
