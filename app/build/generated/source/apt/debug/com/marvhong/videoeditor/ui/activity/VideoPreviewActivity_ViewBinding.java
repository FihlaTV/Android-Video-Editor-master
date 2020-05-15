// Generated code from Butter Knife. Do not modify!
package com.marvhong.videoeditor.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.marvhong.videoeditor.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoPreviewActivity_ViewBinding implements Unbinder {
  private VideoPreviewActivity target;

  private View view2131230822;

  @UiThread
  public VideoPreviewActivity_ViewBinding(VideoPreviewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VideoPreviewActivity_ViewBinding(final VideoPreviewActivity target, View source) {
    this.target = target;

    View view;
    target.mFlVideo = Utils.findRequiredViewAsType(source, R.id.fl, "field 'mFlVideo'", FrameLayout.class);
    target.mVideoView = Utils.findRequiredViewAsType(source, R.id.videoView, "field 'mVideoView'", VideoView.class);
    target.mIvThumb = Utils.findRequiredViewAsType(source, R.id.iv_thumb, "field 'mIvThumb'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.iv_play, "field 'mIvPlay' and method 'onClick'");
    target.mIvPlay = Utils.castView(view, R.id.iv_play, "field 'mIvPlay'", ImageView.class);
    view2131230822 = view;
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
    VideoPreviewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFlVideo = null;
    target.mVideoView = null;
    target.mIvThumb = null;
    target.mIvPlay = null;

    view2131230822.setOnClickListener(null);
    view2131230822 = null;
  }
}
