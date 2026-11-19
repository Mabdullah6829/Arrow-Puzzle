package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzd implements zzlk {
    final /* synthetic */ zzez zza;

    public zzd(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.m9862n(str, str2, bundle, true, true, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j2, long j3) {
        this.zza.m9862n(str, str2, bundle, true, false, Long.valueOf(j2), 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(@Nullable String str, @Nullable String str2, boolean z) {
        return this.zza.m9851c(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.zza.m9863p(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.zza.m9865r(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.zza.m9866s(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    @Nullable
    public final String zzh() {
        return this.zza.m9849a();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    @Nullable
    public final String zzi() {
        return this.zza.m9850b();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    @Nullable
    public final String zzj() {
        return this.zza.m9847H();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    @Nullable
    public final String zzk() {
        return this.zza.m9846G();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.zza.m9848I();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        this.zza.m9843D(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        this.zza.m9844E(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        this.zza.m9868u(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.m9869v(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(@Nullable String str, @Nullable String str2) {
        return this.zza.m9870w(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.zza.m9854f(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    @Nullable
    public final Object zzx(int i2) {
        return this.zza.m9857i(i2);
    }
}
