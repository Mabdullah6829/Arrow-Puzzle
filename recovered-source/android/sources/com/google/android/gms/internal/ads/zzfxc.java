package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxc implements zzfwd {

    /* JADX INFO: renamed from: g */
    public static final zzfxc f16735g = new zzfxc();

    /* JADX INFO: renamed from: h */
    public static final Handler f16736h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public static Handler f16737i = null;

    /* JADX INFO: renamed from: j */
    public static final Runnable f16738j = new zzfwy();

    /* JADX INFO: renamed from: k */
    public static final Runnable f16739k = new zzfwz();

    /* JADX INFO: renamed from: f */
    public long f16745f;

    /* JADX INFO: renamed from: a */
    public final ArrayList f16740a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f16741b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final zzfwv f16743d = new zzfwv();

    /* JADX INFO: renamed from: c */
    public final zzfwf f16742c = new zzfwf();

    /* JADX INFO: renamed from: e */
    public final zzfww f16744e = new zzfww(new zzfxf());

    /* JADX INFO: renamed from: b */
    public static void m6755b() {
        if (f16737i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16737i = handler;
            handler.post(f16738j);
            f16737i.postDelayed(f16739k, 200L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6756a(View view, zzfwh zzfwhVar, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        int i2;
        if (zzfwt.m6753a(view) == null) {
            zzfwv zzfwvVar = this.f16743d;
            char c = zzfwvVar.f16721d.contains(view) ? (char) 1 : zzfwvVar.f16727j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectM6740a = zzfwhVar.m6740a(view);
            zzfwo.m6749c(jSONObject, jSONObjectM6740a);
            HashMap map = zzfwvVar.f16718a;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectM6740a.put("adSessionId", obj);
                } catch (JSONException e) {
                    zzfwp.m6752a("Error with setting ad session id", e);
                }
                WeakHashMap weakHashMap = zzfwvVar.f16726i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectM6740a.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException e2) {
                    zzfwp.m6752a("Error with setting has window focus", e2);
                }
                boolean zContains = zzfwvVar.f16725h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectM6740a.put("isPipActive", objValueOf);
                    } catch (JSONException e3) {
                        zzfwp.m6752a("Error with setting is picture-in-picture active", e3);
                    }
                }
                zzfwvVar.f16727j = true;
                return;
            }
            HashMap map2 = zzfwvVar.f16719b;
            zzfwu zzfwuVar = (zzfwu) map2.get(view);
            if (zzfwuVar != null) {
                map2.remove(view);
            }
            if (zzfwuVar != null) {
                zzfvv zzfvvVar = zzfwuVar.f16716a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = zzfwuVar.f16717b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jSONArray.put((String) arrayList.get(i3));
                }
                try {
                    jSONObjectM6740a.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectM6740a.put("friendlyObstructionClass", zzfvvVar.f16678b);
                    jSONObjectM6740a.put("friendlyObstructionPurpose", zzfvvVar.f16679c);
                    jSONObjectM6740a.put("friendlyObstructionReason", zzfvvVar.f16680d);
                } catch (JSONException e4) {
                    zzfwp.m6752a("Error with setting friendly obstruction", e4);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z || z2;
            boolean z5 = c == 1;
            zzfwhVar.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z5) {
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        m6756a(viewGroup.getChildAt(i4), zzfwhVar, jSONObjectM6740a, z4);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i6));
                    int size3 = arrayList4.size();
                    int i7 = 0;
                    while (true) {
                        i2 = i6 + 1;
                        if (i7 < size3) {
                            m6756a((View) arrayList4.get(i7), zzfwhVar, jSONObjectM6740a, z4);
                            i7++;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }
}
