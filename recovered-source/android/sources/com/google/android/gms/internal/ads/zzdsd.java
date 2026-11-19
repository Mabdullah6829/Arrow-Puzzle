package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsd implements zzdqj, zzdib {

    /* JADX INFO: renamed from: A */
    public final zzflg f12781A;

    /* JADX INFO: renamed from: B */
    public boolean f12782B = false;

    /* JADX INFO: renamed from: C */
    public boolean f12783C = false;

    /* JADX INFO: renamed from: D */
    public boolean f12784D = true;

    /* JADX INFO: renamed from: E */
    public final zzbvu f12785E;

    /* JADX INFO: renamed from: F */
    public final zzbvv f12786F;

    /* JADX INFO: renamed from: s */
    public final zzbvy f12787s;

    /* JADX INFO: renamed from: t */
    public final zzddr f12788t;

    /* JADX INFO: renamed from: u */
    public final zzdfs f12789u;

    /* JADX INFO: renamed from: v */
    public final zzdcx f12790v;

    /* JADX INFO: renamed from: w */
    public final zzdle f12791w;

    /* JADX INFO: renamed from: x */
    public final Context f12792x;

    /* JADX INFO: renamed from: y */
    public final zzfkn f12793y;

    /* JADX INFO: renamed from: z */
    public final VersionInfoParcel f12794z;

    public zzdsd(zzbvu zzbvuVar, zzbvv zzbvvVar, zzbvy zzbvyVar, zzddr zzddrVar, zzdfs zzdfsVar, zzdcx zzdcxVar, zzdle zzdleVar, Context context, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzflg zzflgVar) {
        this.f12785E = zzbvuVar;
        this.f12786F = zzbvvVar;
        this.f12787s = zzbvyVar;
        this.f12788t = zzddrVar;
        this.f12789u = zzdfsVar;
        this.f12790v = zzdcxVar;
        this.f12791w = zzdleVar;
        this.f12792x = context;
        this.f12793y = zzfknVar;
        this.f12794z = versionInfoParcel;
        this.f12781A = zzflgVar;
    }

    /* JADX INFO: renamed from: t */
    public static final HashMap m6044t(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: C */
    public final void mo5944C() {
        try {
            zzbvy zzbvyVar = this.f12787s;
            if (zzbvyVar != null) {
                zzbvyVar.mo5210B();
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: G */
    public final void mo5946G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: O */
    public final void mo5947O(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: a */
    public final void mo5948a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: b */
    public final void mo5949b(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: c */
    public final void mo5950c() {
        this.f12783C = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: e */
    public final JSONObject mo5952e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: f */
    public final void mo5954f(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: g */
    public final void mo5955g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.f12783C && this.f12793y.f15901L) {
            return;
        }
        m6045u(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: h */
    public final void mo5956h(View view) {
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            zzbvy zzbvyVar = this.f12787s;
            if (zzbvyVar != null) {
                zzbvyVar.mo5213G1(objectWrapper);
                return;
            }
            zzbvu zzbvuVar = this.f12785E;
            if (zzbvuVar != null) {
                Parcel parcelM4810u = zzbvuVar.m4810u();
                zzben.m4817e(parcelM4810u, objectWrapper);
                zzbvuVar.m4811u0(16, parcelM4810u);
            } else {
                zzbvv zzbvvVar = this.f12786F;
                if (zzbvvVar != null) {
                    Parcel parcelM4810u2 = zzbvvVar.m4810u();
                    zzben.m4817e(parcelM4810u2, objectWrapper);
                    zzbvvVar.m4811u0(14, parcelM4810u2);
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: i */
    public final JSONObject mo5957i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: RemoteException -> 0x0036, JSONException -> 0x0054, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0054, blocks: (B:46:0x00bb, B:48:0x00d4), top: B:68:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:78:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00d2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: j */
    public final void mo5958j(View view, Map map, Map map2, zzdry zzdryVar, zzdry zzdryVar2) {
        Object obj;
        ArrayList arrayList;
        ClassLoader classLoader;
        int size;
        int i2;
        Object obj2;
        IObjectWrapper iObjectWrapperMo5220f;
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            JSONObject jSONObject = this.f12793y.f15935j0;
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8507e2)).booleanValue();
            zzbvv zzbvvVar = this.f12786F;
            zzbvu zzbvuVar = this.f12785E;
            zzbvy zzbvyVar = this.f12787s;
            boolean z = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8524f2)).booleanValue() && next.equals("3010")) {
                                Object objM3697u0 = null;
                                if (zzbvyVar != null) {
                                    try {
                                        iObjectWrapperMo5220f = zzbvyVar.mo5220f();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (zzbvuVar != null) {
                                    iObjectWrapperMo5220f = zzbvuVar.m5207D0();
                                } else {
                                    iObjectWrapperMo5220f = zzbvvVar != null ? zzbvvVar.m5208k() : null;
                                }
                                if (iObjectWrapperMo5220f != null) {
                                    objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperMo5220f);
                                }
                                if (objM3697u0 != null) {
                                    cls = objM3697u0.getClass();
                                    arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.m3117a(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                    classLoader = this.f12792x.getClassLoader();
                                    size = arrayList.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            obj2 = arrayList.get(i2);
                                            i2++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.m3117a(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                    classLoader = this.f12792x.getClassLoader();
                                    size = arrayList.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            obj2 = arrayList.get(i2);
                                            i2++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.f12784D = z;
            HashMap mapM6044t = m6044t(map);
            HashMap mapM6044t2 = m6044t(map2);
            if (zzbvyVar != null) {
                zzbvyVar.mo5215X0(objectWrapper, new ObjectWrapper(mapM6044t), new ObjectWrapper(mapM6044t2));
                return;
            }
            if (zzbvuVar != null) {
                ObjectWrapper objectWrapper2 = new ObjectWrapper(mapM6044t);
                ObjectWrapper objectWrapper3 = new ObjectWrapper(mapM6044t2);
                Parcel parcelM4810u = zzbvuVar.m4810u();
                zzben.m4817e(parcelM4810u, objectWrapper);
                zzben.m4817e(parcelM4810u, objectWrapper2);
                zzben.m4817e(parcelM4810u, objectWrapper3);
                zzbvuVar.m4811u0(22, parcelM4810u);
                Parcel parcelM4810u2 = zzbvuVar.m4810u();
                zzben.m4817e(parcelM4810u2, objectWrapper);
                zzbvuVar.m4811u0(12, parcelM4810u2);
                return;
            }
            if (zzbvvVar != null) {
                ObjectWrapper objectWrapper4 = new ObjectWrapper(mapM6044t);
                ObjectWrapper objectWrapper5 = new ObjectWrapper(mapM6044t2);
                Parcel parcelM4810u3 = zzbvvVar.m4810u();
                zzben.m4817e(parcelM4810u3, objectWrapper);
                zzben.m4817e(parcelM4810u3, objectWrapper4);
                zzben.m4817e(parcelM4810u3, objectWrapper5);
                zzbvvVar.m4811u0(22, parcelM4810u3);
                Parcel parcelM4810u4 = zzbvvVar.m4810u();
                zzben.m4817e(parcelM4810u4, objectWrapper);
                zzbvvVar.m4811u0(10, parcelM4810u4);
            }
        } catch (RemoteException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: k */
    public final int mo5959k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: l */
    public final void mo5960l() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: m */
    public final void mo5961m(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i2) {
        if (!this.f12783C) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f12793y.f15901L) {
            m6045u(view2);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: n */
    public final void mo5962n(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: o */
    public final void mo5963o(zzbnz zzbnzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: p */
    public final void mo5964p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: q */
    public final void mo5965q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z = this.f12782B;
            zzfkn zzfknVar = this.f12793y;
            if (!z) {
                this.f12782B = com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3099d(this.f12792x, this.f12794z.f3396s, zzfknVar.f15885C.toString(), this.f12781A.f16043g);
            }
            if (this.f12784D) {
                zzbvy zzbvyVar = this.f12787s;
                zzddr zzddrVar = this.f12788t;
                if (zzbvyVar != null) {
                    if (zzfknVar.f15888D0) {
                        if (zzbvyVar.mo5225r()) {
                            return;
                        }
                        zzbvyVar.mo5227v();
                        zzddrVar.m5905u();
                        return;
                    }
                    if (zzbvyVar.mo5225r() && zzfknVar.f15924e == 4) {
                        this.f12789u.m5913u();
                        return;
                    } else {
                        zzbvyVar.mo5227v();
                        zzddrVar.m5905u();
                        return;
                    }
                }
                zzbvu zzbvuVar = this.f12785E;
                if (zzbvuVar != null) {
                    Parcel parcelM4809k0 = zzbvuVar.m4809k0(13, zzbvuVar.m4810u());
                    ClassLoader classLoader = zzben.f7689a;
                    boolean z2 = parcelM4809k0.readInt() != 0;
                    parcelM4809k0.recycle();
                    if (!z2) {
                        zzbvuVar.m4811u0(10, zzbvuVar.m4810u());
                        zzddrVar.m5905u();
                        return;
                    }
                }
                zzbvv zzbvvVar = this.f12786F;
                if (zzbvvVar != null) {
                    Parcel parcelM4809k1 = zzbvvVar.m4809k0(11, zzbvvVar.m4810u());
                    ClassLoader classLoader2 = zzben.f7689a;
                    boolean z3 = parcelM4809k1.readInt() != 0;
                    parcelM4809k1.recycle();
                    if (z3) {
                        return;
                    }
                    zzbvvVar.m4811u0(8, zzbvvVar.m4810u());
                    zzddrVar.m5905u();
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: r */
    public final void mo5864r() {
        try {
            zzbvy zzbvyVar = this.f12787s;
            if (zzbvyVar == null || !zzbvyVar.mo5225r()) {
                return;
            }
            zzfkn zzfknVar = this.f12793y;
            if (zzfknVar.f15924e != 4 && !zzfknVar.f15888D0) {
                return;
            }
            zzbvyVar.mo5227v();
            this.f12788t.m5905u();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: s */
    public final boolean mo5967s(Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m6045u(View view) {
        try {
            zzbvy zzbvyVar = this.f12787s;
            zzdle zzdleVar = this.f12791w;
            zzdcx zzdcxVar = this.f12790v;
            if (zzbvyVar != null && !zzbvyVar.mo5212F1()) {
                zzbvyVar.mo5214W(new ObjectWrapper(view));
                zzdcxVar.mo2730k();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
                    zzdleVar.mo5626C();
                    return;
                }
                return;
            }
            zzbvu zzbvuVar = this.f12785E;
            if (zzbvuVar != null) {
                Parcel parcelM4809k0 = zzbvuVar.m4809k0(14, zzbvuVar.m4810u());
                ClassLoader classLoader = zzben.f7689a;
                boolean z = parcelM4809k0.readInt() != 0;
                parcelM4809k0.recycle();
                if (!z) {
                    ObjectWrapper objectWrapper = new ObjectWrapper(view);
                    Parcel parcelM4810u = zzbvuVar.m4810u();
                    zzben.m4817e(parcelM4810u, objectWrapper);
                    zzbvuVar.m4811u0(11, parcelM4810u);
                    zzdcxVar.mo2730k();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
                        zzdleVar.mo5626C();
                        return;
                    }
                    return;
                }
            }
            zzbvv zzbvvVar = this.f12786F;
            if (zzbvvVar != null) {
                Parcel parcelM4809k1 = zzbvvVar.m4809k0(12, zzbvvVar.m4810u());
                ClassLoader classLoader2 = zzben.f7689a;
                boolean z2 = parcelM4809k1.readInt() != 0;
                parcelM4809k1.recycle();
                if (z2) {
                    return;
                }
                ObjectWrapper objectWrapper2 = new ObjectWrapper(view);
                Parcel parcelM4810u2 = zzbvvVar.m4810u();
                zzben.m4817e(parcelM4810u2, objectWrapper2);
                zzbvvVar.m4811u0(9, parcelM4810u2);
                zzdcxVar.mo2730k();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
                    zzdleVar.mo5626C();
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: v */
    public final boolean mo5970v() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: z */
    public final void mo5865z() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzh() {
        return this.f12793y.f15901L;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: F */
    public final void mo5945F() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: e0 */
    public final void mo5953e0() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: d */
    public final void mo5951d(MotionEvent motionEvent, View view) {
    }
}
