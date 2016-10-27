package com.lzy.bottomdialogdemo;

import com.lzy.bottomdialogdemo.bottomdialog.BottomDialog;
import com.lzy.bottomdialogdemo.bottomdialog.BottomDialog.OnBottomDialogItemOnClickListener;
import com.lzy.bottomdialogdemo.bottomdialog.bean.DialogListViewItem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * 类描述：BottomDialog测试类
 * 
 * @Time 2016年4月18日
 * @author lizy18
 */
public class MainActivity extends Activity implements
		OnBottomDialogItemOnClickListener {

	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
	}

	/**
	 * 功能描述：初始化布局控件
	 * 
	 * @Time 2016年4月18日
	 * @Author lizy18
	 */
	private void initViews() {
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				showBottomDialog();
			}
		});

	}

	/**
	 * 功能描述：展示BottomDialog
	 * 
	 * @Time 2016年4月18日
	 * @Author lizy18
	 */
	protected void showBottomDialog() {
		BottomDialog dialog = new BottomDialog(MainActivity.this,
				R.style.transparentFrameWindowStyle);
		dialog.setOnBottomDialogItemOnClickListener(this);
		dialog.addItem(new DialogListViewItem("版本更新"));
		dialog.addItem(new DialogListViewItem("反馈"));
		dialog.addItem(new DialogListViewItem("退出QQ"));
		dialog.show();
	}

	/**
	 * 功能描述:点击事件的处理
	 */
	@Override
	public void onItemClick(DialogListViewItem item, int position) {
		switch (position) {
		case 0:
			Toast.makeText(MainActivity.this,
					"点击了位置" + position + ":  " + item.getText(),
					Toast.LENGTH_SHORT).show();
			break;
		case 1:
			Toast.makeText(MainActivity.this,
					"点击了位置" + position + ":  " + item.getText(),
					Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}

	}

}
