package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnd {

    /* JADX INFO: renamed from: a */
    public final zzbnc f9186a;

    public zzbnd(zzbnc zzbncVar) {
        Context context;
        this.f9186a = zzbncVar;
        try {
            context = (Context) ObjectWrapper.m3697u0(zzbncVar.mo5069B2());
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.f9186a.mo5070N(new ObjectWrapper(new MediaView(context)));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
            }
        }
    }
}
