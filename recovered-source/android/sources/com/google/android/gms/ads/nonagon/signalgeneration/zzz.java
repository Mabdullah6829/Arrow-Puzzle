package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhcc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class zzz implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbzx f3994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzap f3996c;

    public zzz(zzap zzapVar, zzbzx zzbzxVar, boolean z) {
        this.f3994a = zzbzxVar;
        this.f3995b = z;
        this.f3996c = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f3994a.zze(arrayList);
            zzap zzapVar = this.f3996c;
            boolean z = zzapVar.f3849F;
            zzfsm zzfsmVar = zzapVar.f3848E;
            if (!z && !this.f3995b) {
                return;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                Uri uri = (Uri) obj2;
                if (zzap.m3318o4(uri, zzapVar.f3861R, zzapVar.f3862S)) {
                    zzfsmVar.m6643b(zzap.m3319r4(uri, zzapVar.f3858O, "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8767t8)).booleanValue()) {
                        zzfsmVar.m6643b(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        try {
            zzbzx zzbzxVar = this.f3994a;
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
