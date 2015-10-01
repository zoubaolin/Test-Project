package com.game.snda.gameassistant;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.api.view.HasViews;

/**
 * Activity的基础类
 * Created by zoubaolin on 15/9/25.
 */
@EActivity
public abstract class BaseActivity extends ActionBarActivity implements HasViews {

    private final static String TAG = BaseActivity.class.getSimpleName();

    @ViewById(R.id.tv_action_bar_text)
    protected TextView actionBarText;

    /**
     * 设置标题栏的标题
     * @param title
     */
    protected void setActionBarText(String title) {
        Log.d(TAG, "zzz---BaseActivity---setActionBarText()");
        if (actionBarText == null) {
            return;
        }
        actionBarText.setText(title);
    }

}
