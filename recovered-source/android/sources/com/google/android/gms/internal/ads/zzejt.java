package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejt extends zzeju {

    /* JADX INFO: renamed from: h */
    public static final SparseArray f14047h;

    /* JADX INFO: renamed from: c */
    public final Context f14048c;

    /* JADX INFO: renamed from: d */
    public final zzdce f14049d;

    /* JADX INFO: renamed from: e */
    public final TelephonyManager f14050e;

    /* JADX INFO: renamed from: f */
    public final zzejl f14051f;

    /* JADX INFO: renamed from: g */
    public zzbic.zzq f14052g;

    static {
        SparseArray sparseArray = new SparseArray();
        f14047h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbic.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbic.zzaf.zzd zzdVar = zzbic.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbic.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbic.zzaf.zzd zzdVar2 = zzbic.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbic.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzejt(Context context, zzdce zzdceVar, zzejl zzejlVar, zzejh zzejhVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        super(zzejhVar, zzjVar);
        this.f14048c = context;
        this.f14049d = zzdceVar;
        this.f14051f = zzejlVar;
        this.f14050e = (TelephonyManager) context.getSystemService("phone");
    }
}
