package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbym extends zzbyn implements zzbpx {

    /* JADX INFO: renamed from: c */
    public final zzclx f9539c;

    /* JADX INFO: renamed from: d */
    public final Context f9540d;

    /* JADX INFO: renamed from: e */
    public final WindowManager f9541e;

    /* JADX INFO: renamed from: f */
    public final zzbie f9542f;

    /* JADX INFO: renamed from: g */
    public DisplayMetrics f9543g;

    /* JADX INFO: renamed from: h */
    public float f9544h;

    /* JADX INFO: renamed from: i */
    public int f9545i;

    /* JADX INFO: renamed from: j */
    public int f9546j;

    /* JADX INFO: renamed from: k */
    public int f9547k;

    /* JADX INFO: renamed from: l */
    public int f9548l;

    /* JADX INFO: renamed from: m */
    public int f9549m;

    /* JADX INFO: renamed from: n */
    public int f9550n;

    /* JADX INFO: renamed from: o */
    public int f9551o;

    public zzbym(zzclx zzclxVar, Context context, zzbie zzbieVar) {
        super(zzclxVar, "");
        this.f9545i = -1;
        this.f9546j = -1;
        this.f9548l = -1;
        this.f9549m = -1;
        this.f9550n = -1;
        this.f9551o = -1;
        this.f9539c = zzclxVar;
        this.f9540d = context;
        this.f9542f = zzbieVar;
        this.f9541e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.f9543g = new DisplayMetrics();
        Display defaultDisplay = this.f9541e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f9543g);
        this.f9544h = this.f9543g.density;
        this.f9547k = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        DisplayMetrics displayMetrics = this.f9543g;
        int i2 = displayMetrics.widthPixels;
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
        this.f9545i = Math.round(i2 / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.f9543g;
        this.f9546j = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        zzclx zzclxVar = this.f9539c;
        zzclb zzclbVar = zzclxVar.f10483s;
        Activity activityZzj = ((zzcme) zzclbVar).zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.f9548l = this.f9545i;
            this.f9549m = this.f9546j;
        } else {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            int[] iArrM3217p = com.google.android.gms.ads.internal.util.zzs.m3217p(activityZzj);
            this.f9548l = Math.round(iArrM3217p[0] / this.f9543g.density);
            this.f9549m = Math.round(iArrM3217p[1] / this.f9543g.density);
        }
        if (((zzcme) zzclbVar).mo5609p().m5677b()) {
            this.f9550n = this.f9545i;
            this.f9551o = this.f9546j;
        } else {
            zzclxVar.measure(0, 0);
        }
        m5265e(this.f9545i, this.f9546j, this.f9548l, this.f9549m, this.f9544h, this.f9547k);
        zzbyl zzbylVar = new zzbyl();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbie zzbieVar = this.f9542f;
        zzbylVar.f9537b = zzbieVar.m5008b(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbylVar.f9536a = zzbieVar.m5008b(intent2);
        zzbylVar.f9538c = zzbieVar.m5008b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        boolean zM5007a = zzbieVar.m5007a();
        boolean z = zzbylVar.f9536a;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", zzbylVar.f9537b).put("calendar", zzbylVar.f9538c).put("storePicture", zM5007a).put("inlineVideo", true);
        } catch (JSONException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzclxVar.mo5128a(jSONObjectPut, "onDeviceFeaturesReceived");
        int[] iArr = new int[2];
        zzclxVar.getLocationOnScreen(iArr);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f3086a;
        int i4 = iArr[0];
        Context context = this.f9540d;
        m5261f(zzfVar2.m3046i(context, i4), zzayVar.f3086a.m3046i(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Dispatching Ready Event.");
        }
        try {
            this.f9552a.mo5128a(new JSONObject().put("js", ((zzcme) zzclbVar).mo5472h().f3396s), "onReadyEventReceived");
        } catch (JSONException e2) {
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while dispatching ready Event.", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[PHI: r5
  0x0074: PHI (r5v4 int) = (r5v3 int), (r5v7 int) binds: [B:11:0x0048, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public final void m5261f(int i2, int i3) {
        int i4;
        Context context = this.f9540d;
        int i5 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            i4 = com.google.android.gms.ads.internal.util.zzs.m3218q((Activity) context)[0];
        } else {
            i4 = 0;
        }
        zzclx zzclxVar = this.f9539c;
        zzclb zzclbVar = zzclxVar.f10483s;
        if (((zzcme) zzclbVar).mo5609p() == null || !((zzcme) zzclbVar).mo5609p().m5677b()) {
            int width = zzclxVar.getWidth();
            int height = zzclxVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8003A0)).booleanValue()) {
                if (width == 0) {
                    width = ((zzcme) zzclbVar).mo5609p() != null ? ((zzcme) zzclbVar).mo5609p().f10603c : 0;
                }
                if (height != 0) {
                    i5 = height;
                } else if (((zzcme) zzclbVar).mo5609p() != null) {
                    i5 = ((zzcme) zzclbVar).mo5609p().f10602b;
                }
            } else {
                i5 = height;
            }
            com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
            this.f9550n = zzayVar.f3086a.m3046i(context, width);
            this.f9551o = zzayVar.f3086a.m3046i(context, i5);
        }
        try {
            this.f9552a.mo5128a(new JSONObject().put("x", i2).put("y", i3 - i4).put("width", this.f9550n).put("height", this.f9551o), "onDefaultPositionReceived");
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while dispatching default position.", e);
        }
        zzbyh zzbyhVar = zzclxVar.mo5582K().f10433P;
        if (zzbyhVar != null) {
            zzbyhVar.f9515e = i2;
            zzbyhVar.f9516f = i3;
        }
    }
}
