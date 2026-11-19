package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbys extends NativeAd {

    /* JADX INFO: renamed from: a */
    public final zzboc f9557a;

    /* JADX INFO: renamed from: c */
    public final zzbyr f9559c;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9558b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f9560d = new ArrayList();

    public zzbys(zzboc zzbocVar) {
        new AtomicLong();
        this.f9557a = zzbocVar;
        zzbyr zzbyrVar = null;
        try {
            List listMo5083b = zzbocVar.mo5083b();
            if (listMo5083b != null) {
                for (Object obj : listMo5083b) {
                    zzbml zzbmlVarM5066k4 = obj instanceof IBinder ? zzbmk.m5066k4((IBinder) obj) : null;
                    if (zzbmlVarM5066k4 != null) {
                        this.f9558b.add(new zzbyr(zzbmlVarM5066k4));
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        try {
            List listMo5091x = this.f9557a.mo5091x();
            if (listMo5091x != null) {
                for (Object obj2 : listMo5091x) {
                    com.google.android.gms.ads.internal.client.zzdg zzdgVarM2909k4 = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdf.m2909k4((IBinder) obj2) : null;
                    if (zzdgVarM2909k4 != null) {
                        this.f9560d.add(new com.google.android.gms.ads.internal.client.zzdh(zzdgVarM2909k4));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
        try {
            zzbml zzbmlVarZzh = this.f9557a.zzh();
            if (zzbmlVarZzh != null) {
                zzbyrVar = new zzbyr(zzbmlVarZzh);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
        }
        this.f9559c = zzbyrVar;
        try {
            if (this.f9557a.mo5086f() != null) {
                new zzbyp(this.f9557a.mo5086f());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    /* JADX INFO: renamed from: a */
    public final String mo3305a() {
        try {
            return this.f9557a.mo5084c();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    /* JADX INFO: renamed from: b */
    public final String mo3306b() {
        try {
            return this.f9557a.mo5082a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    /* JADX INFO: renamed from: c */
    public final ResponseInfo mo3307c() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo5080L;
        try {
            zzdxVarMo5080L = this.f9557a.mo5080L();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            zzdxVarMo5080L = null;
        }
        if (zzdxVarMo5080L != null) {
            return new ResponseInfo(zzdxVarMo5080L);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ IObjectWrapper mo3308d() {
        try {
            return this.f9557a.mo5088k();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5266e() {
        try {
            this.f9557a.mo5081Q();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m5267f() {
        try {
            return this.f9557a.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m5268g() {
        try {
            return this.f9557a.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final com.google.android.gms.ads.internal.client.zzfb m5269h() {
        try {
            zzboc zzbocVar = this.f9557a;
            if (zzbocVar.mo5090w() != null) {
                return new com.google.android.gms.ads.internal.client.zzfb(zzbocVar.mo5090w());
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m5270i() {
        try {
            return this.f9557a.mo5085e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final Double m5271j() {
        try {
            double dZzk = this.f9557a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m5272k() {
        try {
            return this.f9557a.zzl();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f9557a.mo5092y2(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to record native event", e);
        }
    }
}
