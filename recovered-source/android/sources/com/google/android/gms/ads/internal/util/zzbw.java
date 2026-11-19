package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzbw implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f3547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbz f3548b;

    public zzbw(zzbz zzbzVar, String str) {
        Objects.requireNonNull(zzbzVar);
        this.f3548b = zzbzVar;
        this.f3547a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbz zzbzVar = this.f3548b;
        synchronized (zzbzVar) {
            try {
                ArrayList arrayList = zzbzVar.f3551b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((zzbx) obj).zza(this.f3547a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
