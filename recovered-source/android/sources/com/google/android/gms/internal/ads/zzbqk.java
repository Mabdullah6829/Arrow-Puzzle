package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.webkit.ProxyConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqk implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.zzb f9271a;

    /* JADX INFO: renamed from: b */
    public final zzdzt f9272b;

    /* JADX INFO: renamed from: d */
    public final zzbyh f9274d;

    /* JADX INFO: renamed from: e */
    public final zzeko f9275e;

    /* JADX INFO: renamed from: f */
    public final zzctq f9276f;

    /* JADX INFO: renamed from: g */
    public final zzdca f9277g;

    /* JADX INFO: renamed from: c */
    public com.google.android.gms.ads.internal.util.client.zzu f9273c = null;

    /* JADX INFO: renamed from: h */
    public com.google.android.gms.ads.internal.overlay.zzaa f9278h = null;

    /* JADX INFO: renamed from: i */
    public final zzhcp f9279i = zzcfy.f9953h;

    public zzbqk(com.google.android.gms.ads.internal.zzb zzbVar, zzbyh zzbyhVar, zzeko zzekoVar, zzdzt zzdztVar, zzctq zzctqVar, zzdca zzdcaVar) {
        this.f9271a = zzbVar;
        this.f9274d = zzbyhVar;
        this.f9275e = zzekoVar;
        this.f9272b = zzdztVar;
        this.f9276f = zzctqVar;
        this.f9277g = zzdcaVar;
    }

    /* JADX INFO: renamed from: b */
    public static int m5103b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    /* JADX INFO: renamed from: c */
    public static Uri m5104c(Context context, zzbaw zzbawVar, Uri uri, View view, Activity activity, zzflk zzflkVar) {
        if (zzbawVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8806vd)).booleanValue() || zzflkVar == null) {
                    if (zzbawVar.m4706c(uri)) {
                        return zzbawVar.m4705b(uri, context, view, activity);
                    }
                } else if (zzbawVar.m4706c(uri)) {
                    return zzflkVar.m6489a(uri, context, view, activity);
                }
            } catch (zzbax unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: d */
    public static Uri m5105d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error adding click uptime parameter to url: ".concat(strValueOf), e);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzctq zzctqVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        zzclb zzclbVar = (zzclb) zzaVar;
        if (zzclbVar.mo5565B() != null) {
            map2 = zzclbVar.mo5565B().f15961w0;
        }
        String strM5373a = zzcei.m5373a(str, zzclbVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.f9271a;
        if (zzbVar != null && !zzbVar.m3246a()) {
            zzbVar.m3247b(strM5373a);
        } else {
            ListenableFuture listenableFutureM5822a = (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8804vb)).booleanValue() && (zzctqVar = this.f9276f) != null && zzctq.m5821b(strM5373a)) ? zzctqVar.m5822a(strM5373a, com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e) : zzhcf.m7367a(strM5373a);
            listenableFutureM5822a.addListener(new zzhcd(listenableFutureM5822a, new zzbqg(this, map, zzaVar, str2)), this.f9279i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(com.google.android.gms.internal.ads.zzbix.f8165J9)).booleanValue() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(com.google.android.gms.internal.ads.zzbix.f8080E9)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(com.google.android.gms.internal.ads.zzbix.f8063D9)).booleanValue()) != false) goto L55;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5106e(com.google.android.gms.ads.internal.client.zza r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqk.m5106e(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: f */
    public final void m5107f(Context context, String str, String str2) {
        zzeko zzekoVar = this.f9275e;
        zzekoVar.m6259e(str);
        zzdzt zzdztVar = this.f9272b;
        if (zzdztVar != null) {
            zzgvp.m7174a("dialog_not_shown_reason", str2);
            zzekz.m6260l4(context, zzdztVar, zzekoVar, str, "dialog_not_shown", zzgyt.m7265e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    /* JADX INFO: renamed from: g */
    public final void m5108g(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Uri uriBuild;
        Intent intent;
        Intent intentM5102b;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoM5101a;
        boolean z4 = true;
        m5109h(true);
        zzclb zzclbVar = (zzclb) zzaVar;
        Context context = zzclbVar.getContext();
        zzbaw zzbawVarMo5611q = zzclbVar.mo5611q();
        View viewMo5577H = zzclbVar.mo5577H();
        zzflk zzflkVarMo5584N = zzclbVar.mo5584N();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentM5102b = null;
        } else {
            Uri uriM5105d = m5105d(m5104c(context, zzbawVarMo5611q, Uri.parse(str2), viewMo5577H, null, zzflkVarMo5584N));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8798v5)).booleanValue()) {
                    z4 = false;
                }
            }
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uriM5105d.getScheme())) {
                uriBuild = uriM5105d.buildUpon().scheme(ProxyConfig.MATCH_HTTPS).build();
            } else {
                uriBuild = ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(uriM5105d.getScheme()) ? uriM5105d.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriM5105d);
            intent2.setAction("android.intent.action.VIEW");
            if (uriBuild == null) {
                intent = null;
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(268435456);
                intent3.setData(uriBuild);
                intent3.setAction("android.intent.action.VIEW");
                intent = intent3;
            }
            if (z4) {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzs.m3196O(context, intent2);
                com.google.android.gms.ads.internal.util.zzs.m3196O(context, intent);
            }
            ResolveInfo resolveInfoM5101a2 = zzbqj.m5101a(intent2, arrayList, context);
            if (resolveInfoM5101a2 != null) {
                intentM5102b = zzbqj.m5102b(intent2, resolveInfoM5101a2);
            } else if (intent != null && (resolveInfoM5101a = zzbqj.m5101a(intent, new ArrayList(), context)) != null) {
                intentM5102b = zzbqj.m5102b(intent2, resolveInfoM5101a);
                if (zzbqj.m5101a(intentM5102b, new ArrayList(), context) == null) {
                    if (!arrayList.isEmpty()) {
                        intentM5102b = intent2;
                    } else if (!z6) {
                        if (z5) {
                            intentM5102b = zzbqj.m5102b(intent2, (ResolveInfo) arrayList.get(0));
                        } else {
                            intentM5102b = intent2;
                        }
                    } else if (z5) {
                        intentM5102b = zzbqj.m5102b(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentM5102b = intent2;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentM5102b = intent2;
            } else if (!z6 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i2);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i3 = i2 + 1;
                            if (!it.hasNext()) {
                                i2 = i3;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentM5102b = zzbqj.m5102b(intent2, resolveInfo);
                            }
                        }
                    } else if (z5) {
                        intentM5102b = zzbqj.m5102b(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentM5102b = intent2;
                    }
                }
            } else if (z5) {
                intentM5102b = zzbqj.m5102b(intent2, (ResolveInfo) arrayList.get(0));
            } else {
                intentM5102b = intent2;
            }
        }
        if (!z || this.f9275e == null || intentM5102b == null || !m5106e(zzaVar, zzclbVar.getContext(), intentM5102b.getData().toString(), str)) {
            try {
                ((zzcmr) zzaVar).mo5652x(new com.google.android.gms.ads.internal.overlay.zzc(intentM5102b, this.f9278h), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(message);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5109h(boolean z) {
        zzbyh zzbyhVar = this.f9274d;
        if (zzbyhVar != null) {
            zzbyhVar.m5259f(z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5110i(int i2) {
        zzdzt zzdztVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8849y5)).booleanValue() || (zzdztVar = this.f9272b) == null) {
            return;
        }
        zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
        zzdzsVarM6111a.m6107b("action", "cct_action");
        switch (i2) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdzsVarM6111a.m6107b("cct_open_status", str);
        zzdzsVarM6111a.m6108c();
    }
}
