package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zztl implements zzqv {

    /* JADX INFO: renamed from: a */
    public final zzrg f20881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zztu f20882b;

    public /* synthetic */ zztl(zztu zztuVar, zzrg zzrgVar) {
        this.f20882b = zztuVar;
        this.f20881a = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    /* JADX INFO: renamed from: a */
    public final void mo8842a() {
        zztu.f20911Y.getAndDecrement();
        zzsd zzsdVar = this.f20882b.f20947l;
        if (zzsdVar != null) {
            int i2 = this.f20881a.f20696a;
            final zzsa zzsaVar = new zzsa();
            final zzrw zzrwVar = ((zztz) zzsdVar).f20963a.f20966Y0;
            Handler handler = zzrwVar.f20723a;
            if (handler != null) {
                handler.post(new Runnable(zzsaVar) { // from class: com.google.android.gms.internal.ads.zzrj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrw zzrwVar2 = this.f20704s;
                        zzrwVar2.getClass();
                        String str = zzfm.f16091a;
                        zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                        zzptVar.m8814r(zzptVar.m8818w(), 1032, new zznw());
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    /* JADX INFO: renamed from: d */
    public final void mo8843d() {
        long jM6520v;
        zztu zztuVar = this.f20882b;
        if (equals(zztuVar.f20943h) && zztuVar.f20947l != null) {
            zzto zztoVar = zztuVar.f20949n;
            int i2 = zztoVar.f20894d;
            if (i2 != -1) {
                long j2 = zztoVar.f20895e.f20699d / i2;
                zztb zztbVar = zztuVar.f20953r;
                zztbVar.getClass();
                jM6520v = zzfm.m6520v(zztbVar.f20821a.getSampleRate(), j2);
            } else {
                jM6520v = -9223372036854775807L;
            }
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - zztuVar.f20931T;
            zzsd zzsdVar = zztuVar.f20947l;
            final int i3 = zztuVar.f20949n.f20895e.f20699d;
            final zzrw zzrwVar = ((zztz) zzsdVar).f20963a.f20966Y0;
            final long jM6518t = zzfm.m6518t(jM6520v);
            Handler handler = zzrwVar.f20723a;
            if (handler != null) {
                handler.post(new Runnable(i3, jM6518t, jElapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzro
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrw zzrwVar2 = this.f20713s;
                        zzrwVar2.getClass();
                        String str = zzfm.f16091a;
                        zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                        zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_COPY, new zzpo());
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    /* JADX INFO: renamed from: e */
    public final void mo8844e(final long j2) {
        zzsd zzsdVar;
        zztu zztuVar = this.f20882b;
        if (equals(zztuVar.f20943h) && (zzsdVar = zztuVar.f20947l) != null) {
            zzua zzuaVar = ((zztz) zzsdVar).f20963a;
            zzuaVar.f20977j1 = true;
            final zzrw zzrwVar = zzuaVar.f20966Y0;
            Handler handler = zzrwVar.f20723a;
            if (handler != null) {
                handler.post(new Runnable(j2) { // from class: com.google.android.gms.internal.ads.zzrn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrw zzrwVar2 = this.f20712s;
                        zzrwVar2.getClass();
                        String str = zzfm.f16091a;
                        zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                        zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_ALIAS, new zzpn());
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzb() {
        zzsd zzsdVar;
        zznb zznbVar;
        zztu zztuVar = this.f20882b;
        if (equals(zztuVar.f20943h) && (zzsdVar = zztuVar.f20947l) != null && zztuVar.f20925N && (zznbVar = ((zztz) zzsdVar).f20963a.f21176b0) != null) {
            zznbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzc() {
        zztu zztuVar = this.f20882b;
        if (equals(zztuVar.f20943h) && zztuVar.f20923L) {
            zztuVar.f20924M = true;
        }
    }
}
