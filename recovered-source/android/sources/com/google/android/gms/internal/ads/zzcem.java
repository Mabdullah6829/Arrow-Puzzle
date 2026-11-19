package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcem {

    /* JADX INFO: renamed from: a */
    public final HashMap f9843a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f9844b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f9845c;

    /* JADX INFO: renamed from: d */
    public final zzcdz f9846d;

    public zzcem(Context context, zzcdz zzcdzVar) {
        this.f9845c = context;
        this.f9846d = zzcdzVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5376a(String str) {
        try {
            HashMap map = this.f9843a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f9845c) : this.f9845c.getSharedPreferences(str, 0);
            zzcej zzcejVar = new zzcej(this, str);
            map.put(str, zzcejVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcejVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
