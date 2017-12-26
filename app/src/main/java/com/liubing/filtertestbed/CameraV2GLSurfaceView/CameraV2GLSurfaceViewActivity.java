package com.liubing.filtertestbed.CameraV2GLSurfaceView;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.liubing.filtertestbed.CameraV2;
import com.liubing.filtertestbed.R;

/**
 * Created by lb6905 on 2017/7/19.
 */

public class CameraV2GLSurfaceViewActivity extends Activity implements View.OnClickListener{
    private CameraV2GLSurfaceView mCameraV2GLSurfaceView;
    private CameraV2 mCamera;
    private ImageButton takepicture;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCameraV2GLSurfaceView = new CameraV2GLSurfaceView(this);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        mCamera = new CameraV2(this);
        mCamera.setupCamera(dm.widthPixels, dm.heightPixels);
        if (!mCamera.openCamera()) {
            return;
        }
        mCameraV2GLSurfaceView.init(mCamera, false, CameraV2GLSurfaceViewActivity.this);
        setContentView(R.layout.layout);
        FrameLayout main = (FrameLayout)findViewById(R.id.frame_layout);
        main.addView(mCameraV2GLSurfaceView);
         takepicture = (ImageButton)findViewById(R.id.btn_shutter);
        takepicture.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_shutter:


                break;
        }
    }
}
