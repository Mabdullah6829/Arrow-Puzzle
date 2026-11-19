package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgct {

    /* JADX INFO: renamed from: c */
    public static zzgct f16991c;

    /* JADX INFO: renamed from: a */
    public final String f16992a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f16993b;

    public zzgct(Context context) {
        this.f16992a = context.getPackageName();
        this.f16993b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m6883a(String str, Object obj) throws IOException {
        boolean zCommit;
        boolean z = obj instanceof String;
        String str2 = this.f16992a;
        SharedPreferences sharedPreferences = this.f16993b;
        if (z) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    Log.e("GpidLifecycleSPHandler", AbstractC1456a.m2451r(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                }
                throw new IOException(AbstractC1456a.m2451r(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(AbstractC1456a.m2451r(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    /* JADX INFO: renamed from: b */
    public final void m6884b(String str) throws IOException {
        if (this.f16993b.edit().remove(str).commit()) {
            return;
        }
        int length = str.length();
        String str2 = this.f16992a;
        throw new IOException(AbstractC1456a.m2451r(new StringBuilder(length + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }
}
