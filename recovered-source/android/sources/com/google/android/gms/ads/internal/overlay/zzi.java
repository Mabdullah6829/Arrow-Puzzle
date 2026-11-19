package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzat;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class zzi extends RelativeLayout {

    /* JADX INFO: renamed from: s */
    public final zzat f3335s;

    /* JADX INFO: renamed from: t */
    public boolean f3336t;

    public zzi(Context context, String str, String str2, String str3) {
        super(context);
        zzat zzatVar = new zzat(context);
        zzatVar.f3483c = str;
        this.f3335s = zzatVar;
        zzatVar.f3485e = str2;
        zzatVar.f3484d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3336t) {
            return false;
        }
        this.f3335s.m3091a(motionEvent);
        return false;
    }
}
