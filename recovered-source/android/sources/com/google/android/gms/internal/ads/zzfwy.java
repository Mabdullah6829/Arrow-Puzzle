package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwy implements Runnable {
    /* JADX WARN: Code duplicated, block: B:171:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        KeyguardManager keyguardManager;
        WeakHashMap weakHashMap;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        ArrayList arrayList;
        int size;
        int i2;
        zzfvv zzfvvVar;
        View view;
        zzfwu zzfwuVar;
        zzfxc zzfxcVar = zzfxc.f16735g;
        zzfwv zzfwvVar = zzfxcVar.f16743d;
        zzfww zzfwwVar = zzfxcVar.f16744e;
        zzfxcVar.f16741b.clear();
        for (zzfuy zzfuyVar : Collections.unmodifiableCollection(zzfvs.f16671c.f16673b)) {
        }
        zzfxcVar.f16745f = System.nanoTime();
        HashMap map = zzfwvVar.f16724g;
        HashSet hashSet3 = zzfwvVar.f16722e;
        HashMap map2 = zzfwvVar.f16719b;
        HashMap map3 = zzfwvVar.f16718a;
        HashSet hashSet4 = zzfwvVar.f16721d;
        HashSet hashSet5 = zzfwvVar.f16725h;
        HashSet<String> hashSet6 = zzfwvVar.f16723f;
        HashMap map4 = zzfwvVar.f16720c;
        WeakHashMap weakHashMap2 = zzfwvVar.f16726i;
        zzfvs zzfvsVar = zzfvs.f16671c;
        if (zzfvsVar != null) {
            Iterator it2 = Collections.unmodifiableCollection(zzfvsVar.f16673b).iterator();
            while (it2.hasNext()) {
                zzfuy zzfuyVar2 = (zzfuy) it2.next();
                View view2 = (View) zzfuyVar2.f16615c.get();
                String str2 = zzfuyVar2.f16619g;
                zzfwwVar = zzfwwVar;
                if (!zzfuyVar2.f16617e || zzfuyVar2.f16618f) {
                    weakHashMap = weakHashMap2;
                    it = it2;
                    hashSet2 = hashSet5;
                    it2 = it;
                    weakHashMap2 = weakHashMap;
                    hashSet5 = hashSet2;
                } else if (view2 != null) {
                    Context context = view2.getContext();
                    it = it2;
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                    if (zIsInPictureInPictureMode) {
                        hashSet5.add(str2);
                    }
                    boolean z = zIsInPictureInPictureMode;
                    if (view2.isAttachedToWindow()) {
                        if (view2.hasWindowFocus()) {
                            weakHashMap2.remove(view2);
                            bool = Boolean.FALSE;
                        } else if (weakHashMap2.containsKey(view2)) {
                            bool = (Boolean) weakHashMap2.get(view2);
                        } else {
                            bool = Boolean.FALSE;
                            weakHashMap2.put(view2, bool);
                        }
                        if (!bool.booleanValue() || z) {
                            HashSet hashSet7 = new HashSet();
                            weakHashMap = weakHashMap2;
                            View view3 = view2;
                            while (true) {
                                if (view3 == null) {
                                    hashSet2 = hashSet5;
                                    hashSet4.addAll(hashSet7);
                                    str = null;
                                    break;
                                } else {
                                    String strM6753a = zzfwt.m6753a(view3);
                                    if (strM6753a != null) {
                                        str = strM6753a;
                                    } else {
                                        hashSet7.add(view3);
                                        Object parent = view3.getParent();
                                        hashSet5 = hashSet5;
                                        view3 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                            if (str == null) {
                                hashSet3.add(str2);
                                map3.put(view2, str2);
                                arrayList = zzfuyVar2.f16614b.f16682a;
                                size = arrayList.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    zzfvvVar = (zzfvv) obj;
                                    view = (View) zzfvvVar.f16677a.get();
                                    if (view == null) {
                                        zzfwuVar = (zzfwu) map2.get(view);
                                        if (zzfwuVar != null) {
                                            zzfwuVar.f16717b.add(str2);
                                        } else {
                                            map2.put(view, new zzfwu(zzfvvVar, str2));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                hashSet6.add(str2);
                                map4.put(str2, view2);
                                map.put(str2, str);
                            }
                            it2 = it;
                            weakHashMap2 = weakHashMap;
                            hashSet5 = hashSet2;
                        } else {
                            weakHashMap = weakHashMap2;
                            str = "noWindowFocus";
                        }
                    } else {
                        str = "notAttached";
                        weakHashMap = weakHashMap2;
                    }
                    hashSet2 = hashSet5;
                    if (str == null) {
                        hashSet3.add(str2);
                        map3.put(view2, str2);
                        arrayList = zzfuyVar2.f16614b.f16682a;
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            zzfvvVar = (zzfvv) obj2;
                            view = (View) zzfvvVar.f16677a.get();
                            if (view == null) {
                                zzfwuVar = (zzfwu) map2.get(view);
                                if (zzfwuVar != null) {
                                    zzfwuVar.f16717b.add(str2);
                                } else {
                                    map2.put(view, new zzfwu(zzfvvVar, str2));
                                }
                            }
                        }
                    } else if (str != "noWindowFocus") {
                        hashSet6.add(str2);
                        map4.put(str2, view2);
                        map.put(str2, str);
                    }
                    it2 = it;
                    weakHashMap2 = weakHashMap;
                    hashSet5 = hashSet2;
                } else {
                    hashSet6.add(str2);
                    map.put(str2, "noAdView");
                    weakHashMap2 = weakHashMap2;
                }
            }
        }
        zzfww zzfwwVar2 = zzfwwVar;
        HashSet hashSet8 = hashSet5;
        zzfwf zzfwfVar = zzfxcVar.f16742c;
        long jNanoTime = System.nanoTime();
        zzfwg zzfwgVar = zzfwfVar.f16699b;
        if (hashSet6.size() > 0) {
            for (String str3 : hashSet6) {
                long j2 = jNanoTime;
                JSONObject jSONObjectM6739a = zzfwgVar.m6739a(null);
                View view4 = (View) map4.get(str3);
                zzfwh zzfwhVar = zzfwfVar.f16698a;
                String str4 = (String) map.get(str3);
                if (str4 != null) {
                    JSONObject jSONObjectM6740a = zzfwhVar.m6740a(view4);
                    try {
                        jSONObjectM6740a.put("adSessionId", str3);
                    } catch (JSONException e) {
                        zzfwp.m6752a("Error with setting ad session id", e);
                    }
                    try {
                        jSONObjectM6740a.put("notVisibleReason", str4);
                    } catch (JSONException e2) {
                        zzfwp.m6752a("Error with setting not visible reason", e2);
                    }
                    zzfwo.m6749c(jSONObjectM6739a, jSONObjectM6740a);
                } else {
                    map4 = map4;
                }
                zzfwo.m6750d(jSONObjectM6739a);
                HashSet hashSet9 = new HashSet();
                hashSet9.add(str3);
                zzfwwVar2.getClass();
                zzfwg zzfwgVar2 = zzfwgVar;
                HashMap map5 = map;
                zzfww zzfwwVar3 = zzfwwVar2;
                jNanoTime = j2;
                zzfxh zzfxhVar = new zzfxh(zzfwwVar3, hashSet9, jSONObjectM6739a, jNanoTime);
                zzfxf zzfxfVar = zzfwwVar3.f16729b;
                zzfxhVar.f16749a = zzfxfVar;
                ArrayDeque arrayDeque = zzfxfVar.f16752b;
                arrayDeque.add(zzfxhVar);
                if (zzfxfVar.f16753c == null) {
                    zzfxe zzfxeVar = (zzfxe) arrayDeque.poll();
                    zzfxfVar.f16753c = zzfxeVar;
                    if (zzfxeVar != null) {
                        zzfxeVar.executeOnExecutor(zzfxfVar.f16751a, new Object[0]);
                    }
                }
                zzfwwVar2 = zzfwwVar3;
                map4 = map4;
                map = map5;
                zzfwgVar = zzfwgVar2;
            }
        }
        HashMap map6 = map4;
        zzfwg zzfwgVar3 = zzfwgVar;
        HashMap map7 = map;
        zzfww zzfwwVar4 = zzfwwVar2;
        if (hashSet3.size() > 0) {
            JSONObject jSONObjectM6739a2 = zzfwgVar3.m6739a(null);
            zzfwgVar3.getClass();
            ArrayList arrayList2 = new ArrayList();
            zzfvs zzfvsVar2 = zzfvs.f16671c;
            if (zzfvsVar2 != null) {
                Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(zzfvsVar2.f16673b);
                int size2 = collectionUnmodifiableCollection.size();
                IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                Iterator it3 = collectionUnmodifiableCollection.iterator();
                while (it3.hasNext()) {
                    View view5 = (View) ((zzfuy) it3.next()).f16615c.get();
                    if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                        View view6 = view5;
                        while (true) {
                            if (view6 == null) {
                                zzfww zzfwwVar5 = zzfwwVar4;
                                Iterator it4 = it3;
                                View rootView = view5.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float z2 = rootView.getZ();
                                    int size3 = arrayList2.size();
                                    while (size3 > 0) {
                                        float f2 = z2;
                                        int i3 = size3 - 1;
                                        if (((View) arrayList2.get(i3)).getZ() <= f2) {
                                            break;
                                        }
                                        size3 = i3;
                                        z2 = f2;
                                    }
                                    arrayList2.add(size3, rootView);
                                }
                                it3 = it4;
                                zzfwwVar4 = zzfwwVar5;
                                break;
                            }
                            if (view6.getAlpha() == 0.0f) {
                                break;
                            }
                            zzfww zzfwwVar6 = zzfwwVar4;
                            Object parent2 = view6.getParent();
                            it3 = it3;
                            view6 = parent2 instanceof View ? (View) parent2 : null;
                            zzfwwVar4 = zzfwwVar6;
                        }
                    }
                }
            }
            zzfww zzfwwVar7 = zzfwwVar4;
            int size4 = arrayList2.size();
            int i4 = 0;
            while (i4 < size4) {
                zzfxcVar.m6756a((View) arrayList2.get(i4), zzfwgVar3.f16700a, jSONObjectM6739a2, false);
                i4++;
                arrayList2 = arrayList2;
            }
            zzfwo.m6750d(jSONObjectM6739a2);
            zzfwwVar7.getClass();
            hashSet = hashSet3;
            zzfxi zzfxiVar = new zzfxi(zzfwwVar7, hashSet, jSONObjectM6739a2, jNanoTime);
            zzfxf zzfxfVar2 = zzfwwVar7.f16729b;
            zzfxiVar.f16749a = zzfxfVar2;
            ArrayDeque arrayDeque2 = zzfxfVar2.f16752b;
            arrayDeque2.add(zzfxiVar);
            if (zzfxfVar2.f16753c == null) {
                zzfxe zzfxeVar2 = (zzfxe) arrayDeque2.poll();
                zzfxfVar2.f16753c = zzfxeVar2;
                if (zzfxeVar2 != null) {
                    zzfxeVar2.executeOnExecutor(zzfxfVar2.f16751a, new Object[0]);
                }
            }
        } else {
            hashSet = hashSet3;
            zzfwwVar4.getClass();
            zzfxg zzfxgVar = new zzfxg(zzfwwVar4);
            zzfxf zzfxfVar3 = zzfwwVar4.f16729b;
            zzfxgVar.f16749a = zzfxfVar3;
            ArrayDeque arrayDeque3 = zzfxfVar3.f16752b;
            arrayDeque3.add(zzfxgVar);
            if (zzfxfVar3.f16753c == null) {
                zzfxe zzfxeVar3 = (zzfxe) arrayDeque3.poll();
                zzfxfVar3.f16753c = zzfxeVar3;
                if (zzfxeVar3 != null) {
                    zzfxeVar3.executeOnExecutor(zzfxfVar3.f16751a, new Object[0]);
                }
            }
        }
        map3.clear();
        map2.clear();
        map6.clear();
        hashSet4.clear();
        hashSet.clear();
        hashSet6.clear();
        map7.clear();
        zzfwvVar.f16727j = false;
        hashSet8.clear();
        long jNanoTime2 = System.nanoTime() - zzfxcVar.f16745f;
        ArrayList arrayList3 = zzfxcVar.f16740a;
        if (arrayList3.size() > 0) {
            int size5 = arrayList3.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                zzfxb zzfxbVar = (zzfxb) obj3;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfxbVar.zzb();
                if (zzfxbVar instanceof zzfxa) {
                    ((zzfxa) zzfxbVar).zza();
                }
            }
        }
        zzfwc zzfwcVar = zzfwc.f16694d;
        Context context2 = (Context) zzfwcVar.f16695a.get();
        if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzfwcVar.m6738a(zzfwcVar.f16696b, zIsDeviceLocked);
        zzfwcVar.f16697c = zIsDeviceLocked;
    }
}
