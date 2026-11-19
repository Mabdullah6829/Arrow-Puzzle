package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwh implements zzfwe {

    /* JADX INFO: renamed from: a */
    public final int[] f16701a = new int[2];

    /* JADX INFO: renamed from: a */
    public final JSONObject m6740a(View view) {
        if (view == null) {
            return zzfwo.m6747a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f16701a;
        view.getLocationOnScreen(iArr);
        return zzfwo.m6747a(iArr[0], iArr[1], width, height);
    }
}
