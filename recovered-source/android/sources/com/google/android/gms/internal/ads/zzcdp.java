package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdp implements zzcdu {

    /* JADX INFO: renamed from: l */
    public static final List f9776l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public final zziit f9777a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f9778b;

    /* JADX INFO: renamed from: e */
    public final Context f9781e;

    /* JADX INFO: renamed from: f */
    public boolean f9782f;

    /* JADX INFO: renamed from: g */
    public final zzcdr f9783g;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9779c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f9780d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Object f9784h = new Object();

    /* JADX INFO: renamed from: i */
    public final HashSet f9785i = new HashSet();

    /* JADX INFO: renamed from: j */
    public boolean f9786j = false;

    /* JADX INFO: renamed from: k */
    public boolean f9787k = false;

    public zzcdp(Context context, VersionInfoParcel versionInfoParcel, zzcdr zzcdrVar, String str) {
        Preconditions.m3545i(zzcdrVar, "SafeBrowsing config is not present.");
        this.f9781e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9778b = new LinkedHashMap();
        this.f9783g = zzcdrVar;
        Iterator it = zzcdrVar.f9792w.iterator();
        while (it.hasNext()) {
            this.f9785i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f9785i.remove("cookie".toLowerCase(Locale.ENGLISH));
        zziit zziitVarM8523G = zziks.m8523G();
        zziitVarM8523G.m8326l();
        ((zziks) zziitVarM8523G.f19780t).m8537R(9);
        if (str != null) {
            zziitVarM8523G.m8326l();
            ((zziks) zziitVarM8523G.f19780t).m8527H(str);
            zziitVarM8523G.m8326l();
            ((zziks) zziitVarM8523G.f19780t).m8528I(str);
        }
        zziiu zziiuVarM8499D = zziiv.m8499D();
        String str2 = this.f9783g.f9788s;
        if (str2 != null) {
            zziiuVarM8499D.m8326l();
            ((zziiv) zziiuVarM8499D.f19780t).m8500E(str2);
        }
        zziiv zziivVar = (zziiv) zziiuVarM8499D.m8328o();
        zziitVarM8523G.m8326l();
        ((zziks) zziitVarM8523G.f19780t).m8529J(zziivVar);
        zzike zzikeVarM8519D = zzikf.m8519D();
        boolean zM3664c = Wrappers.m3665a(this.f9781e).m3664c();
        zzikeVarM8519D.m8326l();
        ((zzikf) zzikeVarM8519D.f19780t).m8522G(zM3664c);
        String str3 = versionInfoParcel.f3396s;
        if (str3 != null) {
            zzikeVarM8519D.m8326l();
            ((zzikf) zzikeVarM8519D.f19780t).m8520E(str3);
        }
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
        Context context2 = this.f9781e;
        googleApiAvailabilityLight.getClass();
        long jM3401a = GoogleApiAvailabilityLight.m3401a(context2);
        if (jM3401a > 0) {
            zzikeVarM8519D.m8326l();
            ((zzikf) zzikeVarM8519D.f19780t).m8521F(jM3401a);
        }
        zzikf zzikfVar = (zzikf) zzikeVarM8519D.m8328o();
        zziitVarM8523G.m8326l();
        ((zziks) zziitVarM8523G.f19780t).m8534O(zzikfVar);
        this.f9777a = zziitVarM8523G;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    /* JADX INFO: renamed from: a */
    public final void mo5349a(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f9783g.f9790u && !this.f9786j) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcdt.m5353a("Failed to capture the webview bitmap.");
                return;
            }
            this.f9786j = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdo
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdp zzcdpVar = this.f9774s;
                    Bitmap bitmap2 = bitmap;
                    zzidl zzidlVar = zzidl.f19719t;
                    zzidk zzidkVar = new zzidk();
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 0, zzidkVar);
                    synchronized (zzcdpVar.f9784h) {
                        zziit zziitVar = zzcdpVar.f9777a;
                        zzijw zzijwVarM8507D = zzijy.m8507D();
                        zzidl zzidlVarM8143c = zzidkVar.m8143c();
                        zzijwVarM8507D.m8326l();
                        ((zzijy) zzijwVarM8507D.f19780t).m8509F(zzidlVarM8143c);
                        zzijwVarM8507D.m8326l();
                        ((zzijy) zzijwVarM8507D.f19780t).m8508E("image/png");
                        zzijwVarM8507D.m8326l();
                        ((zzijy) zzijwVarM8507D.f19780t).m8510G(2);
                        zzijy zzijyVar = (zzijy) zzijwVarM8507D.m8328o();
                        zziitVar.m8326l();
                        ((zziks) zziitVar.f19780t).m8533N(zzijyVar);
                    }
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                ((zzcfx) zzcfy.f9946a).execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    /* JADX INFO: renamed from: b */
    public final void mo5350b() {
        synchronized (this.f9784h) {
            this.f9778b.keySet();
            ListenableFuture listenableFutureM7367a = zzhcf.m7367a(Collections.EMPTY_MAP);
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) {
                    int length;
                    zzikc zzikcVar;
                    ListenableFuture listenableFutureM7375i;
                    zzcdp zzcdpVar = this.f9771a;
                    Map map = (Map) obj;
                    if (map != null) {
                        try {
                            for (String str : map.keySet()) {
                                JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                                if (jSONArrayOptJSONArray != null) {
                                    Object obj2 = zzcdpVar.f9784h;
                                    synchronized (obj2) {
                                        try {
                                            length = jSONArrayOptJSONArray.length();
                                            synchronized (obj2) {
                                                zzikcVar = (zzikc) zzcdpVar.f9778b.get(str);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (zzikcVar == null) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                        sb.append("Cannot find the corresponding resource object for ");
                                        sb.append(str);
                                        zzcdt.m5353a(sb.toString());
                                    } else {
                                        for (int i2 = 0; i2 < length; i2++) {
                                            String string = jSONArrayOptJSONArray.getJSONObject(i2).getString("threat_type");
                                            zzikcVar.m8326l();
                                            ((zzikd) zzikcVar.f19780t).m8517J(string);
                                        }
                                        zzcdpVar.f9782f = (length > 0) | zzcdpVar.f9782f;
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            if (((Boolean) zzblf.f9122a.m5057c()).booleanValue()) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to get SafeBrowsing metadata", e);
                            }
                            return zzhcf.m7368b(new Exception("Safebrowsing report transmission failed."));
                        }
                    }
                    if (zzcdpVar.f9782f) {
                        synchronized (zzcdpVar.f9784h) {
                            zziit zziitVar = zzcdpVar.f9777a;
                            zziitVar.m8326l();
                            ((zziks) zziitVar.f19780t).m8537R(10);
                        }
                    }
                    boolean z = zzcdpVar.f9782f;
                    if (!(z && zzcdpVar.f9783g.f9794y) && (!(zzcdpVar.f9787k && zzcdpVar.f9783g.f9793x) && (z || !zzcdpVar.f9783g.f9791v))) {
                        return zzhcj.f18518t;
                    }
                    synchronized (zzcdpVar.f9784h) {
                        try {
                            for (zzikc zzikcVar2 : zzcdpVar.f9778b.values()) {
                                zziit zziitVar2 = zzcdpVar.f9777a;
                                zzikd zzikdVar = (zzikd) zzikcVar2.m8328o();
                                zziitVar2.m8326l();
                                ((zziks) zziitVar2.f19780t).m8530K(zzikdVar);
                            }
                            zziit zziitVar3 = zzcdpVar.f9777a;
                            ArrayList arrayList = zzcdpVar.f9779c;
                            zziitVar3.m8326l();
                            ((zziks) zziitVar3.f19780t).m8535P(arrayList);
                            ArrayList arrayList2 = zzcdpVar.f9780d;
                            zziitVar3.m8326l();
                            ((zziks) zziitVar3.f19780t).m8536Q(arrayList2);
                            if (((Boolean) zzblf.f9122a.m5057c()).booleanValue()) {
                                String strM8524D = ((zziks) zziitVar3.f19780t).m8524D();
                                String strM8526F = ((zziks) zziitVar3.f19780t).m8526F();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strM8524D).length() + 38 + String.valueOf(strM8526F).length() + 15);
                                sb2.append("Sending SB report\n  url: ");
                                sb2.append(strM8524D);
                                sb2.append("\n  clickUrl: ");
                                sb2.append(strM8526F);
                                sb2.append("\n  resources: \n");
                                StringBuilder sb3 = new StringBuilder(sb2.toString());
                                for (zzikd zzikdVar2 : Collections.unmodifiableList(((zziks) zziitVar3.f19780t).m8525E())) {
                                    sb3.append("    [");
                                    sb3.append(zzikdVar2.m8513E());
                                    sb3.append("] ");
                                    sb3.append(zzikdVar2.m8512D());
                                }
                                zzcdt.m5353a(sb3.toString());
                            }
                            ListenableFuture listenableFutureM3116a = new com.google.android.gms.ads.internal.util.zzbl(zzcdpVar.f9781e).m3116a(1, zzcdpVar.f9783g.f9789t, null, ((zziks) zziitVar3.m8328o()).m8099h());
                            if (((Boolean) zzblf.f9122a.m5057c()).booleanValue()) {
                                ((zzcgd) listenableFutureM3116a).addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdn
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        List list = zzcdp.f9776l;
                                        zzcdt.m5353a("Pinged SB successfully.");
                                    }
                                }, zzcfy.f9946a);
                            }
                            listenableFutureM7375i = zzhcf.m7375i(listenableFutureM3116a, new zzgti() { // from class: com.google.android.gms.internal.ads.zzcdm
                                @Override // com.google.android.gms.internal.ads.zzgti
                                public final /* synthetic */ Object apply(Object obj3) {
                                    List list = zzcdp.f9776l;
                                    return null;
                                }
                            }, zzcfy.f9953h);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return listenableFutureM7375i;
                }
            };
            zzhcp zzhcpVar = zzcfy.f9953h;
            ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFutureM7367a, zzhbnVar, zzhcpVar);
            ListenableFuture listenableFutureM7373g = zzhcf.m7373g(listenableFutureM7374h, 10L, TimeUnit.SECONDS, zzcfy.f9949d);
            ((zzhay) listenableFutureM7374h).addListener(new zzhcd(listenableFutureM7374h, new zzcdk(this, listenableFutureM7373g)), zzhcpVar);
            f9776l.add(listenableFutureM7373g);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    /* JADX INFO: renamed from: c */
    public final void mo5351c(String str, Map map, int i2) {
        synchronized (this.f9784h) {
            int i3 = 1;
            if (i2 == 3) {
                try {
                    this.f9787k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f9778b;
            if (linkedHashMap.containsKey(str)) {
                if (i2 == 3) {
                    zzikc zzikcVar = (zzikc) linkedHashMap.get(str);
                    zzikcVar.m8326l();
                    ((zzikd) zzikcVar.f19780t).m8518K(4);
                }
                return;
            }
            zzikc zzikcVarM8511F = zzikd.m8511F();
            if (i2 != 0) {
                if (i2 == 1) {
                    i3 = 2;
                } else if (i2 != 2) {
                    i3 = i2 != 3 ? 0 : 4;
                } else {
                    i3 = 3;
                }
            }
            if (i3 != 0) {
                zzikcVarM8511F.m8326l();
                ((zzikd) zzikcVarM8511F.f19780t).m8518K(i3);
            }
            int size = linkedHashMap.size();
            zzikcVarM8511F.m8326l();
            ((zzikd) zzikcVarM8511F.f19780t).m8514G(size);
            zzikcVarM8511F.m8326l();
            ((zzikd) zzikcVarM8511F.f19780t).m8515H(str);
            zzijg zzijgVarM8505D = zzijj.m8505D();
            if (!this.f9785i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f9785i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzije zzijeVarM8502D = zzijf.m8502D();
                        zzidl zzidlVar = zzidl.f19719t;
                        zzidl zzidjVar = str2.isEmpty() ? zzidl.f19719t : new zzidj(str2.getBytes(StandardCharsets.UTF_8));
                        zzijeVarM8502D.m8326l();
                        ((zzijf) zzijeVarM8502D.f19780t).m8503E(zzidjVar);
                        zzidl zzidjVar2 = str3.isEmpty() ? zzidl.f19719t : new zzidj(str3.getBytes(StandardCharsets.UTF_8));
                        zzijeVarM8502D.m8326l();
                        ((zzijf) zzijeVarM8502D.f19780t).m8504F(zzidjVar2);
                        zzijf zzijfVar = (zzijf) zzijeVarM8502D.m8328o();
                        zzijgVarM8505D.m8326l();
                        ((zzijj) zzijgVarM8505D.f19780t).m8506E(zzijfVar);
                    }
                }
            }
            zzijj zzijjVar = (zzijj) zzijgVarM8505D.m8328o();
            zzikcVarM8511F.m8326l();
            ((zzikd) zzikcVarM8511F.f19780t).m8516I(zzijjVar);
            linkedHashMap.put(str, zzikcVarM8511F);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    /* JADX INFO: renamed from: m */
    public final void mo5352m(String str) {
        synchronized (this.f9784h) {
            try {
                if (str == null) {
                    zziit zziitVar = this.f9777a;
                    zziitVar.m8326l();
                    ((zziks) zziitVar.f19780t).m8532M();
                } else {
                    zziit zziitVar2 = this.f9777a;
                    zziitVar2.m8326l();
                    ((zziks) zziitVar2.f19780t).m8531L(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final zzcdr zza() {
        return this.f9783g;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzc() {
        return this.f9783g.f9790u && !this.f9786j;
    }
}
