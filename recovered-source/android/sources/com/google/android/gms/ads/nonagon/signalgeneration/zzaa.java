package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaa implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbzx f3813a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3814b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzap f3815c;

    public zzaa(zzap zzapVar, zzbzx zzbzxVar, boolean z) {
        this.f3813a = zzbzxVar;
        this.f3814b = z;
        this.f3815c = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzap zzapVar = this.f3815c;
            zzapVar.getClass();
            ArrayList arrayList = zzapVar.f3860Q;
            ArrayList arrayList2 = zzapVar.f3859P;
            zzfsm zzfsmVar = zzapVar.f3848E;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (zzap.m3318o4((Uri) it.next(), arrayList2, arrayList)) {
                    zzapVar.f3855L.getAndIncrement();
                    break;
                }
            }
            this.f3813a.zze(list);
            if (!zzapVar.f3850G && !this.f3814b) {
                return;
            }
            for (Uri uri : list) {
                if (zzap.m3318o4(uri, arrayList2, arrayList)) {
                    zzfsmVar.m6643b(zzap.m3319r4(uri, zzapVar.f3858O, "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8767t8)).booleanValue()) {
                        zzfsmVar.m6643b(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        try {
            zzbzx zzbzxVar = this.f3813a;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbzxVar.mo5280j0(sb.toString());
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
