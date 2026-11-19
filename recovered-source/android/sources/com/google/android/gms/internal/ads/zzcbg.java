package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbg extends zzcbd {

    /* JADX INFO: renamed from: b */
    public final Context f9666b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f9667c;

    /* JADX INFO: renamed from: d */
    public final zzbut f9668d;

    /* JADX INFO: renamed from: e */
    public final VersionInfoParcel f9669e;

    /* JADX INFO: renamed from: g */
    public final Executor f9671g;

    /* JADX INFO: renamed from: a */
    public final Object f9665a = new Object();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f9670f = new AtomicBoolean(false);

    public zzcbg(Context context, zzbut zzbutVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.f9666b = context.getApplicationContext();
        this.f9669e = versionInfoParcel;
        this.f9668d = zzbutVar;
        this.f9671g = executor;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m5303b(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbkx.f9064f.m5057c()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.f3396s);
            jSONObject.put("mf", zzbkx.f9065g.m5057c());
            jSONObject.put("cl", "910357297");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m3701d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m5304a() {
        synchronized (this.f9665a) {
            try {
                if (this.f9667c == null) {
                    this.f9667c = this.f9666b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences sharedPreferences = this.f9667c;
        long j2 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        if (System.currentTimeMillis() - j2 < ((Long) zzbkx.f9066h.m5057c()).longValue()) {
            return zzhcj.f18518t;
        }
        return zzhcf.m7375i(this.f9668d.m5149a(m5303b(this.f9666b, this.f9669e)), new zzgti() { // from class: com.google.android.gms.internal.ads.zzcbe
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                SharedPreferences sharedPreferences2;
                JSONObject jSONObject = (JSONObject) obj;
                zzbio zzbioVar = zzbix.f8436a;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                zzbiq zzbiqVar = zzbaVar.f3097b;
                zzbip zzbipVar = zzbaVar.f3096a;
                zzcbg zzcbgVar = this.f9663a;
                Context context = zzcbgVar.f9666b;
                SharedPreferences sharedPreferencesM5025a = zzbiq.m5025a(context);
                if (sharedPreferencesM5025a != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesM5025a.edit();
                    Objects.requireNonNull(zzbipVar);
                    ArrayList arrayList = zzbipVar.f7983a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        zzbio zzbioVar2 = (zzbio) obj2;
                        if (zzbioVar2.f7979a == 1) {
                            zzbioVar2.mo5013b(editorEdit, zzbioVar2.mo5014c(jSONObject));
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Flag Json is null.");
                    }
                    if (((Boolean) zzbkx.f9073o.m5057c()).booleanValue() || ((Boolean) zzbkx.f9074p.m5057c()).booleanValue()) {
                        zzbiq zzbiqVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3097b;
                        editorEdit.apply();
                    } else {
                        zzbiq zzbiqVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3097b;
                        editorEdit.commit();
                    }
                    if (((Boolean) zzbkx.f9063e.m5057c()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        zzbiq zzbiqVar4 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3097b;
                        try {
                            sharedPreferences2 = context.getSharedPreferences("google_adapter_flags", 0);
                        } catch (IllegalStateException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
                            sharedPreferences2 = null;
                        }
                        if (sharedPreferences2 != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (next.startsWith("adapter:")) {
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            editorEdit2.putString("flag_configuration", jSONObject2.toString());
                            editorEdit2.apply();
                        }
                    }
                    SharedPreferences sharedPreferences3 = zzcbgVar.f9667c;
                    if (sharedPreferences3 != null) {
                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                }
                return null;
            }
        }, ((Boolean) zzbkx.f9071m.m5057c()).booleanValue() ? this.f9671g : zzcfy.f9953h);
    }
}
