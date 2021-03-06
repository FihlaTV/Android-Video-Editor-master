package com.ignei.ioja.ui.activity;

import android.Manifest.permission;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.ignei.ioja.R;
import com.ignei.ioja.base.BaseActivity;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends BaseActivity {

    private RxPermissions mRxPermissions;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

//    @Override
//    protected void initToolbar(ToolbarHelper toolbarHelper) {
//        toolbarHelper.setTitle("视频编辑");
//        toolbarHelper.hideBackArrow();
//    }

    @Override
    protected void initView() {
        mRxPermissions = new RxPermissions(this);
        ImageButton selectVideoBtn = findViewById(R.id.select_video_btn);
        selectVideoBtn.setOnClickListener(view -> mRxPermissions
                .request(permission.WRITE_EXTERNAL_STORAGE,permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        subscribe(d);
                    }

                    @Override
                    public void onNext(Boolean granted) {
                        if (granted) { //已获取权限
                            Intent intent = new Intent(MainActivity.this, VideoAlbumActivity.class);
                            startActivityForResult(intent, 100);
                        } else {
                            Toast.makeText(MainActivity.this, "给点权限行不行？", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                }));

    }


    /**
     * 相册
     * @param view
     */
    public void takeAlbum(View view) {
        mRxPermissions
            .request(permission.WRITE_EXTERNAL_STORAGE,permission.READ_EXTERNAL_STORAGE)
            .subscribe(new Observer<Boolean>() {
                @Override
                public void onSubscribe(Disposable d) {
                    subscribe(d);
                }

                @Override
                public void onNext(Boolean granted) {
                    if (granted) { //已获取权限
                        Intent intent = new Intent(MainActivity.this, VideoAlbumActivity.class);
                        startActivityForResult(intent, 100);
                    } else {
                        Toast.makeText(MainActivity.this, "给点权限行不行？", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });
    }
}
