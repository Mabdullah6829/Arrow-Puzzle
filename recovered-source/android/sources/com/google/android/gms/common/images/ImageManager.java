package com.google.android.gms.common.images;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ImageManager {

    /* JADX INFO: renamed from: a */
    public static final Object f4397a = null;

    public final class ImageReceiver extends ResultReceiver {
        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i2, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            if (parcelFileDescriptor != null) {
                new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L));
            }
            throw null;
        }
    }

    public interface OnImageLoadedListener {
    }

    static {
        new HashSet();
    }
}
