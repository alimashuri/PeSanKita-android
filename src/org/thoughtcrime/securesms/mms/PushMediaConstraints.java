package org.thoughtcrime.securesms.mms;

import android.content.Context;

import org.thoughtcrime.securesms.util.Util;

public class PushMediaConstraints extends MediaConstraints {
  private static final int MAX_IMAGE_DIMEN_LOWMEM = 768;
  private static final int MAX_IMAGE_DIMEN        = 4096;
  private static final int KB                     = 1024;
  private static final int MB                     = 1024 * KB;

  @Override
  public int getImageMaxWidth(Context context) {
    return Util.isLowMemory(context) ? MAX_IMAGE_DIMEN_LOWMEM : MAX_IMAGE_DIMEN;
  }

  @Override
  public int getImageMaxHeight(Context context) {
    return getImageMaxWidth(context);
  }

  @Override
  public int getImageMaxSize() {
    return 6 * MB;
  }

  @Override
  public int getGifMaxSize() {
    return 6 * MB;
  }

  @Override
  public int getVideoMaxSize() {
    return 100 * MB;
  }

  @Override
  public int getAudioMaxSize() {
    return 100 * MB;
  }

  @Override
  public int getFileMaxSize() {
    return 100 * MB;
  }
}
