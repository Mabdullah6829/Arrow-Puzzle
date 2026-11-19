package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.C5133a;
import com.google.ads.mediation.C5137e;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbol extends zzbnv {

    /* JADX INFO: renamed from: s */
    public final C5137e f9200s;

    public zzbol(C5137e c5137e) {
        this.f9200s = c5137e;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    /* JADX INFO: renamed from: j1 */
    public final void mo5077j1(zzboc zzbocVar) {
        String strMo5082a;
        String strMo5084c;
        String strZzi;
        String strZzj;
        Double dValueOf;
        String strZzl;
        String strMo5085e;
        zzbod zzbodVar = new zzbod(zzbocVar);
        C5137e c5137e = this.f9200s;
        c5137e.getClass();
        zzboc zzbocVar2 = zzbodVar.f9187a;
        C5133a c5133a = new C5133a();
        Object objM3697u0 = null;
        try {
            strMo5082a = zzbocVar2.mo5082a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            strMo5082a = null;
        }
        c5133a.f3731a = strMo5082a;
        c5133a.f3732b = zzbodVar.f9188b;
        try {
            strMo5084c = zzbocVar2.mo5084c();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
            strMo5084c = null;
        }
        c5133a.f3733c = strMo5084c;
        c5133a.f3734d = zzbodVar.f9189c;
        try {
            strZzi = zzbocVar2.zzi();
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
            strZzi = null;
        }
        c5133a.f3735e = strZzi;
        try {
            strZzj = zzbocVar2.zzj();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e4);
            strZzj = null;
        }
        c5133a.f3736f = strZzj;
        try {
            double dZzk = zzbocVar2.zzk();
            dValueOf = dZzk == -1.0d ? null : Double.valueOf(dZzk);
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e5);
        }
        c5133a.f3737g = dValueOf;
        try {
            strZzl = zzbocVar2.zzl();
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e6);
            strZzl = null;
        }
        c5133a.f3738h = strZzl;
        try {
            strMo5085e = zzbocVar2.mo5085e();
        } catch (RemoteException e7) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e7);
            strMo5085e = null;
        }
        c5133a.f3739i = strMo5085e;
        try {
            IObjectWrapper iObjectWrapperMo5089v = zzbocVar2.mo5089v();
            if (iObjectWrapperMo5089v != null) {
                objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperMo5089v);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e8);
        }
        c5133a.f3741k = objM3697u0;
        c5133a.f3743m = true;
        c5133a.f3744n = true;
        VideoController videoController = zzbodVar.f9190d;
        try {
            if (zzbocVar2.mo5087g() != null) {
                videoController.m2761b(zzbocVar2.mo5087g());
            }
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception occurred while getting video controller", e9);
        }
        c5133a.f3740j = videoController;
        ((MediationNativeListener) c5137e.f2923u).mo3293f((AbstractAdViewAdapter) c5137e.f2922t, c5133a);
    }
}
