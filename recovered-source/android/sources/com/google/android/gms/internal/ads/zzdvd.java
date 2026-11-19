package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvd implements Callable {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.zza f13049a;

    /* JADX INFO: renamed from: b */
    public final Context f13050b;

    /* JADX INFO: renamed from: c */
    public final zzdzt f13051c;

    /* JADX INFO: renamed from: d */
    public final zzeko f13052d;

    /* JADX INFO: renamed from: e */
    public final Executor f13053e;

    /* JADX INFO: renamed from: f */
    public final zzbaw f13054f;

    /* JADX INFO: renamed from: g */
    public final VersionInfoParcel f13055g;

    /* JADX INFO: renamed from: h */
    public final zzfsm f13056h;

    /* JADX INFO: renamed from: i */
    public final zzekz f13057i;

    /* JADX INFO: renamed from: j */
    public final zzflk f13058j;

    public zzdvd(Context context, Executor executor, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzekz zzekzVar, zzflk zzflkVar) {
        this.f13050b = context;
        this.f13053e = executor;
        this.f13054f = zzbawVar;
        this.f13055g = versionInfoParcel;
        this.f13049a = zzaVar;
        this.f13052d = zzekoVar;
        this.f13056h = zzfsmVar;
        this.f13051c = zzdztVar;
        this.f13057i = zzekzVar;
        this.f13058j = zzflkVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        final zzdvf zzdvfVar = new zzdvf(this);
        synchronized (zzdvfVar) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8075E4);
            final zzbaw zzbawVar = zzdvfVar.f13068f;
            final com.google.android.gms.ads.internal.zza zzaVar = zzdvfVar.f13064b;
            final zzekz zzekzVar = zzdvfVar.f13073k;
            final Context context = zzdvfVar.f13065c;
            final zzflk zzflkVar = zzdvfVar.f13074l;
            final VersionInfoParcel versionInfoParcel = zzdvfVar.f13069g;
            final zzdzt zzdztVar = zzdvfVar.f13066d;
            ListenableFuture listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7370d(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // com.google.android.gms.internal.ads.zzhbm
                public final ListenableFuture zza() throws zzclq {
                    zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                    zzcnl zzcnlVar = new zzcnl(0, 0, 0);
                    zzclb zzclbVarM5647a = zzclr.m5647a(context, versionInfoParcel, zzaVar, null, zzbawVar, zzbhw.m4893a(), null, zzcnlVar, zzdztVar, zzekzVar, null, null, zzflkVar, "", false, false);
                    final zzcgc zzcgcVar = new zzcgc(zzclbVarM5647a);
                    zzclbVarM5647a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzclo
                        @Override // com.google.android.gms.internal.ads.zzcmx
                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ void mo3001a(int i2, String str2, String str3, boolean z) {
                            zzcgcVar.m5396c();
                        }
                    };
                    zzclbVarM5647a.loadUrl(str);
                    return zzcgcVar;
                }
            }, zzcfy.f9951f), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdvc
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    zzclb zzclbVar = (zzclb) obj;
                    zzdvf zzdvfVar2 = zzdvfVar;
                    zzclbVar.mo5616v0("/result", zzdvfVar2.f13070h);
                    zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
                    com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(zzdvfVar2.f13065c, null);
                    zzeko zzekoVar = zzdvfVar2.f13071i;
                    zzfsm zzfsmVar = zzdvfVar2.f13072j;
                    zzdzt zzdztVar2 = zzdvfVar2.f13066d;
                    zzdut zzdutVar = zzdvfVar2.f13063a;
                    zzclmVarMo5582K.m5640l(null, zzdutVar, zzdutVar, zzdutVar, zzdutVar, false, null, zzbVar, null, null, zzekoVar, zzfsmVar, zzdztVar2, null, null, null, null, null, null, null, null, null);
                    return zzclbVar;
                }
            }, zzdvfVar.f13067e);
            zzdvfVar.f13075m = listenableFutureM7375i;
            zzcgb.m5394a(listenableFutureM7375i, "NativeJavascriptExecutor.initializeEngine", zzcfy.f9953h);
        }
        return zzdvfVar;
    }
}
