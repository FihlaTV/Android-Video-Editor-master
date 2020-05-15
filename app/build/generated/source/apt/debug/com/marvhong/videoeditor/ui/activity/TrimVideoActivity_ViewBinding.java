// Generated code from Butter Knife. Do not modify!
package com.marvhong.videoeditor.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.marvhong.videoeditor.R;
import com.marvhong.videoeffect.GlVideoView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TrimVideoActivity_ViewBinding implements Unbinder {
  private TrimVideoActivity target;

  private View view2131230837;

  private View view2131230834;

  @UiThread
  public TrimVideoActivity_ViewBinding(TrimVideoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TrimVideoActivity_ViewBinding(final TrimVideoActivity target, View source) {
    this.target = target;

    View view;
    target.mSurfaceView = Utils.findRequiredViewAsType(source, R.id.glsurfaceview, "field 'mSurfaceView'", GlVideoView.class);
    target.mTvShootTip = Utils.findRequiredViewAsType(source, R.id.video_shoot_tip, "field 'mTvShootTip'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.video_thumb_listview, "field 'mRecyclerView'", RecyclerView.class);
    target.mIvPosition = Utils.findRequiredViewAsType(source, R.id.positionIcon, "field 'mIvPosition'", ImageView.class);
    target.seekBarLayout = Utils.findRequiredViewAsType(source, R.id.id_seekBarLayout, "field 'seekBarLayout'", LinearLayout.class);
    target.mRlVideo = Utils.findRequiredViewAsType(source, R.id.layout_surface_view, "field 'mRlVideo'", RelativeLayout.class);
    target.mLlTrimContainer = Utils.findRequiredViewAsType(source, R.id.ll_trim_container, "field 'mLlTrimContainer'", LinearLayout.class);
    target.mHsvEffect = Utils.findRequiredViewAsType(source, R.id.hsv_effect, "field 'mHsvEffect'", HorizontalScrollView.class);
    target.mLlEffectContainer = Utils.findRequiredViewAsType(source, R.id.ll_effect_container, "field 'mLlEffectContainer'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_trim_tab, "method 'onClick'");
    view2131230837 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_effect_tab, "method 'onClick'");
    view2131230834 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TrimVideoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSurfaceView = null;
    target.mTvShootTip = null;
    target.mRecyclerView = null;
    target.mIvPosition = null;
    target.seekBarLayout = null;
    target.mRlVideo = null;
    target.mLlTrimContainer = null;
    target.mHsvEffect = null;
    target.mLlEffectContainer = null;

    view2131230837.setOnClickListener(null);
    view2131230837 = null;
    view2131230834.setOnClickListener(null);
    view2131230834 = null;
  }
}
