package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrg implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final zzdvf f12723s;

    /* JADX INFO: renamed from: t */
    public final Clock f12724t;

    /* JADX INFO: renamed from: u */
    public zzbnz f12725u;

    /* JADX INFO: renamed from: v */
    public zzbpx f12726v;

    /* JADX INFO: renamed from: w */
    public String f12727w;

    /* JADX INFO: renamed from: x */
    public Long f12728x;

    /* JADX INFO: renamed from: y */
    public WeakReference f12729y;

    public zzdrg(zzdvf zzdvfVar, Clock clock) {
        this.f12723s = zzdvfVar;
        this.f12724t = clock;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f12729y;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f12727w != null && this.f12728x != null) {
            HashMap map = new HashMap();
            map.put("id", this.f12727w);
            map.put("time_interval", String.valueOf(this.f12724t.currentTimeMillis() - this.f12728x.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f12723s.m6071d(map);
        }
        this.f12727w = null;
        this.f12728x = null;
        WeakReference weakReference2 = this.f12729y;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f12729y = null;
    }
}
