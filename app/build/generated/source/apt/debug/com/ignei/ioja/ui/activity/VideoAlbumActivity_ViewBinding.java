// Generated code from Butter Knife. Do not modify!
package com.ignei.ioja.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ignei.ioja.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoAlbumActivity_ViewBinding implements Unbinder {
  private VideoAlbumActivity target;

  @UiThread
  public VideoAlbumActivity_ViewBinding(VideoAlbumActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VideoAlbumActivity_ViewBinding(VideoAlbumActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.BackBtn = Utils.findRequiredViewAsType(source, R.id.album_back_btn, "field 'BackBtn'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoAlbumActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.BackBtn = null;
  }
}
