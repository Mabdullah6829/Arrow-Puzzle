package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcej implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f9839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcem f9840b;

    public zzcej(zzcem zzcemVar, String str) {
        Objects.requireNonNull(zzcemVar);
        this.f9840b = zzcemVar;
        this.f9839a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcem zzcemVar = this.f9840b;
        synchronized (zzcemVar) {
            try {
                ArrayList arrayList = zzcemVar.f9844b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((zzcek) obj).zza(this.f9839a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
