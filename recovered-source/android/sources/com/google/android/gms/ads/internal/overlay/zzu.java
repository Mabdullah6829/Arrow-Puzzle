package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final ImageButton f3384s;

    /* JADX INFO: renamed from: t */
    public final zzm f3385t;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzu(android.content.Context r7, com.google.android.gms.ads.internal.overlay.zzt r8, com.google.android.gms.ads.internal.overlay.zzm r9) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzu.<init>(android.content.Context, com.google.android.gms.ads.internal.overlay.zzt, com.google.android.gms.ads.internal.overlay.zzm):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.f3385t;
        if (zzmVar != null) {
            zzmVar.f3360P = 2;
            zzmVar.f3361t.finish();
        }
    }
}
