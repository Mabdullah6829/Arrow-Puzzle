package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzecy;
import com.google.android.gms.internal.ads.zzecz;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzax {

    /* JADX INFO: renamed from: a */
    public final Object f3500a = new Object();

    /* JADX INFO: renamed from: b */
    public String f3501b = "";

    /* JADX INFO: renamed from: c */
    public String f3502c = "";

    /* JADX INFO: renamed from: d */
    public boolean f3503d = false;

    /* JADX INFO: renamed from: e */
    public boolean f3504e = false;

    /* JADX INFO: renamed from: f */
    public String f3505f = "";

    /* JADX INFO: renamed from: g */
    public zzecz f3506g;

    /* JADX INFO: renamed from: j */
    public static final String m3095j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, str2));
        ListenableFuture listenableFutureM3116a = new zzbl(context).m3116a(0, str, map, null);
        try {
            return (String) ((zzcgd) listenableFutureM3116a).f9959s.get(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8378W5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Interrupted while retrieving a response from: ".concat(strValueOf), e);
            ((zzcgd) listenableFutureM3116a).cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            int i3 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Timeout while retrieving a response from: ".concat(strValueOf2), e2);
            ((zzcgd) listenableFutureM3116a).cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            int i4 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error retrieving a response from: ".concat(strValueOf3), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3096a(Context context) {
        zzecz zzeczVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue() || (zzeczVar = this.f3506g) == null) {
            return;
        }
        zzeczVar.m6166e(new zzau(this, context), zzecy.f13628v);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3097b(Context context, String str, String str2) {
        zzbio zzbioVar = zzbix.f8346U5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        String strM3095j = m3095j(context, m3105k(context, (String) zzbaVar.f3098c.m5030a(zzbioVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM3095j)) {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM3095j.trim()).optString("debug_mode"));
            m3101f(zEquals);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
                zzj zzjVarM5387g = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
                if (true != zEquals) {
                    str = "";
                }
                zzjVarM5387g.m3178b(str);
            }
            return zEquals;
        } catch (JSONException e) {
            int i3 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3098c(Context context, String str, String str2) {
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        zzs.m3221t(context, m3105k(context, (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8314S5), str, str2));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3099d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m3103h()) {
            return false;
        }
        int i2 = zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Sending troubleshooting signals to the server.");
        m3100e(context, str, str2, str3);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m3100e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m3105k(context, (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8362V5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        String string = builderBuildUpon.build().toString();
        zzf zzfVar = zzs.f3626l;
        new zzbt(context, str, string, null).mo3108b();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:15:0x0036, B:16:0x003a, B:18:0x0040, B:21:0x0046), top: B:25:0x0003 }] */
    /* JADX INFO: renamed from: f */
    public final void m3101f(boolean z) {
        synchronized (this.f3500a) {
            try {
                this.f3504e = z;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().m3177a(z);
                    zzecz zzeczVar = this.f3506g;
                    if (zzeczVar != null) {
                        if (zzeczVar.f13650u) {
                            if (z) {
                                if (!zzeczVar.f13648s) {
                                    zzeczVar.m6172k();
                                }
                            }
                        } else if (z) {
                            zzeczVar.m6171j();
                            if (!zzeczVar.f13648s) {
                                zzeczVar.m6172k();
                            }
                        }
                        if (!zzeczVar.m6167f()) {
                            zzeczVar.m6173l();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3102g() {
        boolean z;
        synchronized (this.f3500a) {
            z = this.f3504e;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3103h() {
        boolean z;
        synchronized (this.f3500a) {
            z = this.f3503d;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final void m3104i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.f3626l.post(new zzaw(this, context, str, z, z2));
        } else {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0034, B:20:0x006f, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    /* JADX INFO: renamed from: k */
    public final Uri m3105k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f3500a) {
            if (TextUtils.isEmpty(this.f3501b)) {
                zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    IOUtils.m3650b(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i2 = zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f3501b = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                    String string = UUID.randomUUID().toString();
                    this.f3501b = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes(StandardCharsets.UTF_8));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        int i3 = zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error writing to file in internal storage.", e);
                    }
                    str4 = this.f3501b;
                } else {
                    str4 = this.f3501b;
                }
            } else {
                str4 = this.f3501b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
