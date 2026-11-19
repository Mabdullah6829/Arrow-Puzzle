package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaz extends zzabf implements zznd {

    /* JADX INFO: renamed from: k */
    public static final zzgyn f4826k = new zzgwc(new Comparator() { // from class: com.google.android.gms.internal.ads.zzaai
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj2;
            Integer num2 = (Integer) obj;
            zzgyn zzgynVar = zzaaz.f4826k;
            if (num2.intValue() == -1) {
                return num.intValue() == -1 ? 0 : -1;
            }
            if (num.intValue() == -1) {
                return 1;
            }
            return num2.intValue() - num.intValue();
        }
    });

    /* JADX INFO: renamed from: c */
    public final Object f4827c;

    /* JADX INFO: renamed from: d */
    public final Context f4828d;

    /* JADX INFO: renamed from: e */
    public zzaan f4829e;

    /* JADX INFO: renamed from: f */
    public Thread f4830f;

    /* JADX INFO: renamed from: g */
    public zzaco f4831g;

    /* JADX INFO: renamed from: h */
    public zzd f4832h;

    /* JADX INFO: renamed from: i */
    public Boolean f4833i;

    /* JADX INFO: renamed from: j */
    public final zzzu f4834j;

    public zzaaz(Context context) {
        zzzu zzzuVar = new zzzu();
        zzaan zzaanVar = zzaan.f4778F;
        this.f4827c = new Object();
        this.f4828d = context != null ? context.getApplicationContext() : null;
        this.f4834j = zzzuVar;
        if (zzaanVar != null) {
            this.f4829e = zzaanVar;
        } else {
            zzaam zzaamVar = new zzaam(zzaanVar);
            zzaamVar.m5048a(zzaanVar);
            this.f4829e = new zzaan(zzaamVar);
        }
        this.f4832h = zzd.f11854b;
        if (this.f4829e.f4779A && context == null) {
            zzeh.m6211c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: h */
    public static Pair m3903h(zzaba[] zzabaVarArr, int i2) {
        for (int i3 = 0; i3 < 2; i3++) {
            zzaba zzabaVar = zzabaVarArr[i3];
            if (zzabaVar != null && zzabaVar.f4835a.f7809c == i2) {
                return Pair.create(zzabaVar, Integer.valueOf(i3));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.zzgwt] */
    /* JADX INFO: renamed from: i */
    public static final Pair m3904i(int i2, zzabe zzabeVar, int[][][] iArr, zzaaq zzaaqVar, Comparator comparator) {
        int i3;
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (i4 < 2) {
            if (i2 == zzabeVar.f4838a[i4]) {
                zzzo zzzoVar = zzabeVar.f4839b[i4];
                for (int i5 = 0; i5 < zzzoVar.f21491a; i5++) {
                    zzbg zzbgVarM9066a = zzzoVar.m9066a(i5);
                    List listMo3896a = zzaaqVar.mo3896a(i4, zzbgVarM9066a, iArr[i4][i5]);
                    int i6 = zzbgVarM9066a.f7807a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        int i8 = i7 + 1;
                        zzgyo zzgyoVar = (zzgyo) listMo3896a;
                        zzaar zzaarVar = (zzaar) zzgyoVar.get(i7);
                        int iMo3898b = zzaarVar.mo3898b();
                        if (zArr[i7] || iMo3898b == 0) {
                            i3 = i4;
                        } else {
                            if (iMo3898b == 1) {
                                arrayList = zzgwt.m7216n(zzaarVar);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(zzaarVar);
                                int i9 = i8;
                                while (i9 < i6) {
                                    zzaar zzaarVar2 = (zzaar) zzgyoVar.get(i9);
                                    int i10 = i4;
                                    if (zzaarVar2.mo3898b() == 2 && zzaarVar.mo3899c(zzaarVar2)) {
                                        arrayList.add(zzaarVar2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                            }
                            i3 = i4;
                            arrayList2.add(arrayList);
                        }
                        i7 = i8;
                        i4 = i3;
                    }
                }
            }
            i4++;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((zzaar) list.get(i11)).f4800u;
        }
        zzaar zzaarVar3 = (zzaar) list.get(0);
        return Pair.create(new zzaba(zzaarVar3.f4799t, iArr2), Integer.valueOf(zzaarVar3.f4798s));
    }

    /* JADX INFO: renamed from: j */
    public static String m3905j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static int m3906k(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.f21050d)) {
            return 4;
        }
        String strM3905j = m3905j(str);
        String strM3905j2 = m3905j(zzvVar.f21050d);
        if (strM3905j2 == null || strM3905j == null) {
            return (z && strM3905j2 == null) ? 1 : 0;
        }
        if (strM3905j2.startsWith(strM3905j) || strM3905j.startsWith(strM3905j2)) {
            return 3;
        }
        String str2 = zzfm.f16091a;
        return strM3905j2.split("-", 2)[0].equals(strM3905j.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3907l(zzv zzvVar, zzgwt zzgwtVar) {
        for (int i2 = 0; i2 < zzgwtVar.size(); i2++) {
            int i3 = 0;
            while (true) {
                zzgwt zzgwtVar2 = zzvVar.f21049c;
                if (i3 < zzgwtVar2.size()) {
                    if (((zzx) zzgwtVar2.get(i3)).f21248b.equals(zzgwtVar.get(i2))) {
                        return i2;
                    }
                    i3++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public static final zzaba m3908m(zzzo zzzoVar, int[][] iArr, zzaan zzaanVar) {
        zzaanVar.f9095q.getClass();
        int i2 = 0;
        zzbg zzbgVar = null;
        zzaal zzaalVar = null;
        for (int i3 = 0; i3 < zzzoVar.f21491a; i3++) {
            zzbg zzbgVarM9066a = zzzoVar.m9066a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < zzbgVarM9066a.f7807a; i4++) {
                if (zzne.m8768m(iArr2[i4], zzaanVar.f4780B)) {
                    zzaal zzaalVar2 = new zzaal(zzbgVarM9066a.f7810d[i4], iArr2[i4]);
                    if (zzaalVar == null || zzgwg.f18291a.mo7197d(zzaalVar2.f4768t, zzaalVar.f4768t).mo7197d(zzaalVar2.f4767s, zzaalVar.f4767s).mo7198e() > 0) {
                        zzbgVar = zzbgVarM9066a;
                        i2 = i4;
                        zzaalVar = zzaalVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaba(zzbgVar, new int[]{i2});
    }

    /* JADX INFO: renamed from: o */
    public static void m3909o(zzabe zzabeVar, zzbl zzblVar) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < 2; i2++) {
            zzzo zzzoVar = zzabeVar.f4839b[i2];
            for (int i3 = 0; i3 < zzzoVar.f21491a; i3++) {
                if (((zzbh) zzblVar.f9099u.get(zzzoVar.m9066a(i3))) != null) {
                    throw null;
                }
            }
        }
        zzzo zzzoVar2 = zzabeVar.f4841d;
        for (int i4 = 0; i4 < zzzoVar2.f21491a; i4++) {
            if (((zzbh) zzblVar.f9099u.get(zzzoVar2.m9066a(i4))) != null) {
                throw null;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            if (((zzbh) map.get(Integer.valueOf(zzabeVar.f4838a[i5]))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3910p(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzzo zzzoVar = zzabeVar.f4839b[i2];
            Map map = (Map) zzaanVar.f4782D.get(i2);
            if (map != null && map.containsKey(zzzoVar)) {
                Map map2 = (Map) zzaanVar.f4782D.get(i2);
                if ((map2 != null ? (zzaao) map2.get(zzzoVar) : null) != null) {
                    throw null;
                }
                zzabaVarArr[i2] = null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3911q(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = zzabeVar.f4838a[i2];
            if (zzaanVar.f4783E.get(i2) || zzaanVar.f9100v.contains(Integer.valueOf(i3))) {
                zzabaVarArr[i2] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: a */
    public final void mo3912a() {
        zzaco zzacoVar;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        synchronized (this.f4827c) {
            try {
                Thread thread = this.f4830f;
                if (thread != null) {
                    zzgtr.m7134g("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.f4831g) != null) {
            Spatializer spatializer = zzacoVar.f4917a;
            if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = zzacoVar.f4920d) != null && (handler = zzacoVar.f4919c) != null) {
                spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                handler.removeCallbacksAndMessages(null);
            }
            this.f4831g = null;
        }
        super.mo3912a();
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: c */
    public final void mo3914c(zzd zzdVar) {
        if (this.f4832h.equals(zzdVar)) {
            return;
        }
        this.f4832h = zzdVar;
        m3917n();
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: d */
    public final zznd mo3915d() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzabf
    /* JADX INFO: renamed from: g */
    public final Pair mo3916g(zzabe zzabeVar, int[][][] iArr, final int[] iArr2) {
        final zzaan zzaanVar;
        final String str;
        int i2;
        long j2;
        int[] iArr3;
        int length;
        zzabb zzabcVar;
        long j3;
        zzzu zzzuVar;
        int i3;
        int i4;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        final Point point;
        Context context2;
        Point point2;
        final boolean z;
        Context context3;
        synchronized (this.f4827c) {
            this.f4830f = Thread.currentThread();
            zzaanVar = this.f4829e;
        }
        if (this.f4833i == null && (context3 = this.f4828d) != null) {
            this.f4833i = Boolean.valueOf(zzfm.m6508j(context3));
        }
        if (zzaanVar.f4779A && Build.VERSION.SDK_INT >= 32 && this.f4831g == null) {
            this.f4831g = new zzaco(this.f4828d, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f4764s.m3917n();
                }
            }, this.f4833i);
        }
        zzaba[] zzabaVarArr = new zzaba[2];
        m3909o(zzabeVar, zzaanVar);
        m3910p(zzabeVar, zzaanVar, zzabaVarArr);
        m3911q(zzabeVar, zzaanVar, zzabaVarArr);
        Pair pairM3903h = m3903h(zzabaVarArr, 1);
        if (pairM3903h == null) {
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    z = false;
                    break;
                }
                if (zzabeVar.f4838a[i5] == 2 && zzabeVar.f4839b[i5].f21491a > 0) {
                    z = true;
                    break;
                }
                i5++;
            }
            pairM3903h = m3904i(1, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaae
                @Override // com.google.android.gms.internal.ads.zzaaq
                /* JADX INFO: renamed from: a */
                public final List mo3896a(int i6, zzbg zzbgVar, int[] iArr4) {
                    zzaaz zzaazVar = this.f4753a;
                    zzaan zzaanVar2 = zzaanVar;
                    zzaah zzaahVar = new zzaah(zzaazVar, zzaanVar2);
                    int i7 = iArr2[i6];
                    zzgzi zzgziVar = zzgwt.f18303t;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i8 = 0; i8 < zzbgVar.f7807a; i8++) {
                        zzgwqVar.m7203c(new zzzy(i6, zzbgVar, i8, zzaanVar2, iArr4[i8], z, zzaahVar));
                    }
                    return zzgwqVar.m7214f();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzz
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((zzzy) Collections.max((List) obj)).m9068e((zzzy) Collections.max((List) obj2));
                }
            });
            if (pairM3903h != null) {
                zzabaVarArr[((Integer) pairM3903h.second).intValue()] = (zzaba) pairM3903h.first;
            }
        }
        if (pairM3903h == null) {
            str = null;
        } else {
            zzaba zzabaVar = (zzaba) pairM3903h.first;
            str = zzabaVar.f4835a.f7810d[zzabaVar.f4836b[0]].f21050d;
        }
        Pair pairM3903h2 = m3903h(zzabaVarArr, 2);
        Pair pairM3903h3 = m3903h(zzabaVarArr, 4);
        if (pairM3903h2 == null && pairM3903h3 == null) {
            zzaanVar.f9095q.getClass();
            if (!zzaanVar.f9085g || (context2 = this.f4828d) == null) {
                i2 = 0;
                point = null;
            } else {
                String str2 = zzfm.f16091a;
                DisplayManager displayManager = (DisplayManager) context2.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && zzfm.m6508j(context2)) {
                    i2 = 0;
                    String strM6512n = Build.VERSION.SDK_INT < 28 ? zzfm.m6512n("sys.display-size") : zzfm.m6512n("vendor.display-size");
                    if (!TextUtils.isEmpty(strM6512n)) {
                        try {
                            String[] strArrSplit = strM6512n.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i6 = Integer.parseInt(strArrSplit[0]);
                                int i7 = Integer.parseInt(strArrSplit[1]);
                                if (i6 > 0 && i7 > 0) {
                                    point = new Point(i6, i7);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        zzeh.m6213e("Util", "Invalid display size: ".concat(String.valueOf(strM6512n)));
                    }
                    if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point2 = new Point(3840, 2160);
                    }
                    point = point2;
                } else {
                    i2 = 0;
                }
                point2 = new Point();
                Display.Mode mode = display.getMode();
                point2.x = mode.getPhysicalWidth();
                point2.y = mode.getPhysicalHeight();
                point = point2;
            }
            Pair pairM3904i = m3904i(2, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaad
                /* JADX WARN: Code duplicated, block: B:29:0x004c  */
                @Override // com.google.android.gms.internal.ads.zzaaq
                /* JADX INFO: renamed from: a */
                public final List mo3896a(int i8, zzbg zzbgVar, int[] iArr4) {
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    Point point3;
                    zzbg zzbgVar2 = zzbgVar;
                    zzgyn zzgynVar = zzaaz.f4826k;
                    int i14 = iArr2[i8];
                    Point point4 = point;
                    zzaan zzaanVar2 = zzaanVar;
                    int i15 = point4 != null ? point4.x : zzaanVar2.f9083e;
                    int i16 = point4 != null ? point4.y : zzaanVar2.f9084f;
                    boolean z2 = zzaanVar2.f9086h;
                    if (i15 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        int i17 = Integer.MAX_VALUE;
                        for (int i18 = 0; i18 < zzbgVar2.f7807a; i18++) {
                            zzv zzvVar = zzbgVar2.f7810d[i18];
                            int i19 = zzvVar.f21068v;
                            if (i19 > 0 && (i11 = zzvVar.f21069w) > 0) {
                                if (!z2) {
                                    i12 = i16;
                                    i13 = i15;
                                } else if ((i19 > i11) != (i15 > i16)) {
                                    i13 = i16;
                                    i12 = i15;
                                } else {
                                    i12 = i16;
                                    i13 = i15;
                                }
                                int i20 = i19 * i12;
                                int i21 = i11 * i13;
                                if (i20 >= i21) {
                                    String str3 = zzfm.f16091a;
                                    point3 = new Point(i13, ((i21 + i19) - 1) / i19);
                                } else {
                                    String str4 = zzfm.f16091a;
                                    point3 = new Point(((i20 + i11) - 1) / i11, i12);
                                }
                                int i22 = i19 * i11;
                                if (i19 >= ((int) (point3.x * 0.98f)) && i11 >= ((int) (point3.y * 0.98f)) && i22 < i17) {
                                    i17 = i22;
                                }
                            }
                        }
                        i9 = i17;
                    }
                    zzgzi zzgziVar = zzgwt.f18303t;
                    zzgwq zzgwqVar = new zzgwq();
                    int i23 = 0;
                    while (i23 < zzbgVar2.f7807a) {
                        zzv zzvVar2 = zzbgVar2.f7810d[i23];
                        int i24 = zzvVar2.f21068v;
                        int i25 = (i24 == -1 || (i10 = zzvVar2.f21069w) == -1) ? -1 : i24 * i10;
                        zzgwqVar.m7203c(new zzaay(i8, zzbgVar2, i23, zzaanVar2, iArr4[i23], str, i9 == Integer.MAX_VALUE || (i25 != -1 && i25 <= i9)));
                        i23++;
                        zzbgVar2 = zzbgVar;
                    }
                    return zzgwqVar.m7214f();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaac
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    List list = (List) obj2;
                    List list2 = (List) obj;
                    return zzgwg.f18291a.mo7194a((zzaay) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaax
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3901e((zzaay) obj3, (zzaay) obj4);
                        }
                    }), (zzaay) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaas
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3901e((zzaay) obj3, (zzaay) obj4);
                        }
                    }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzaat
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3901e((zzaay) obj3, (zzaay) obj4);
                        }
                    }).mo7195b(list2.size(), list.size()).mo7194a((zzaay) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaau
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3902f((zzaay) obj3, (zzaay) obj4);
                        }
                    }), (zzaay) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaav
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3902f((zzaay) obj3, (zzaay) obj4);
                        }
                    }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzaaw
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj3, Object obj4) {
                            return zzaay.m3902f((zzaay) obj3, (zzaay) obj4);
                        }
                    }).mo7198e();
                }
            });
            Pair pairM3904i2 = pairM3904i == null ? m3904i(4, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaag
                @Override // com.google.android.gms.internal.ads.zzaaq
                /* JADX INFO: renamed from: a */
                public final List mo3896a(int i8, zzbg zzbgVar, int[] iArr4) {
                    zzgyn zzgynVar = zzaaz.f4826k;
                    zzgzi zzgziVar = zzgwt.f18303t;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i9 = 0; i9 < zzbgVar.f7807a; i9++) {
                        zzgwqVar.m7203c(new zzaak(i8, zzbgVar, i9, zzaanVar, iArr4[i9]));
                    }
                    return zzgwqVar.m7214f();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((zzaak) ((List) obj).get(0)).f4766x, ((zzaak) ((List) obj2).get(0)).f4766x);
                }
            }) : null;
            if (pairM3904i2 != null) {
                zzabaVarArr[((Integer) pairM3904i2.second).intValue()] = (zzaba) pairM3904i2.first;
            } else if (pairM3904i != null) {
                zzabaVarArr[((Integer) pairM3904i.second).intValue()] = (zzaba) pairM3904i.first;
            }
        } else {
            i2 = 0;
        }
        if (m3903h(zzabaVarArr, 3) == null) {
            zzaanVar.f9095q.getClass();
            if (!zzaanVar.f9098t || (context = this.f4828d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str3 = zzfm.f16091a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairM3904i3 = m3904i(3, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaaf
                @Override // com.google.android.gms.internal.ads.zzaaq
                /* JADX INFO: renamed from: a */
                public final List mo3896a(int i8, zzbg zzbgVar, int[] iArr4) {
                    zzgyn zzgynVar = zzaaz.f4826k;
                    zzgzi zzgziVar = zzgwt.f18303t;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i9 = 0; i9 < zzbgVar.f7807a; i9++) {
                        zzgwqVar.m7203c(new zzaap(i8, zzbgVar, i9, zzaanVar, iArr4[i9], str, languageTag));
                    }
                    return zzgwqVar.m7214f();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaab
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((zzaap) ((List) obj).get(0)).m3900e((zzaap) ((List) obj2).get(0));
                }
            });
            if (pairM3904i3 != null) {
                zzabaVarArr[((Integer) pairM3904i3.second).intValue()] = (zzaba) pairM3904i3.first;
            }
        }
        zzaanVar.f9095q.getClass();
        zzgxc zzgxcVar = new zzgxc();
        for (int i8 = i2; i8 < 2; i8++) {
            zzaba zzabaVar2 = zzabaVarArr[i8];
            if (zzabaVar2 != null && !zzaanVar.f4783E.get(i8)) {
                zzgxd zzgxdVar = zzaanVar.f9100v;
                zzbg zzbgVar = zzabaVar2.f4835a;
                if (!zzgxdVar.contains(Integer.valueOf(zzbgVar.f7809c))) {
                    zzgxcVar.m7235f(zzbgVar.f7808b);
                    int i9 = i2;
                    while (true) {
                        int[] iArr4 = zzabaVar2.f4836b;
                        if (i9 < iArr4.length) {
                            String str4 = zzbgVar.f7810d[iArr4[i9]].f21059m;
                            if (str4 != null) {
                                zzgxcVar.m7235f(str4);
                            }
                            i9++;
                        }
                    }
                }
            }
        }
        zzgxd zzgxdVarM7237h = zzgxcVar.m7237h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = i2; i10 < 2; i10++) {
            if (zzabeVar.f4838a[i10] == 5) {
                zzzo zzzoVar = zzabeVar.f4839b[i10];
                for (int i11 = i2; i11 < zzzoVar.f21491a; i11++) {
                    zzbg zzbgVarM9066a = zzzoVar.m9066a(i11);
                    arrayList.add(zzbgVarM9066a);
                    int[] iArr5 = (int[]) iArr[i10][i11].clone();
                    for (int i12 = i2; i12 < iArr5.length; i12++) {
                        String str5 = zzbgVarM9066a.f7810d[i12].f21059m;
                        if (str5 != null && !zzgxdVarM7237h.contains(str5)) {
                            iArr5[i12] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i13 = 128;
        int size = arrayList.size();
        zzbg[] zzbgVarArr = new zzbg[size];
        String str6 = zzfm.f16091a;
        zzgtr.m7133f(arrayList.size() == size ? 1 : i2);
        arrayList.toArray(zzbgVarArr);
        zzzo zzzoVar2 = new zzzo(zzbgVarArr);
        int size2 = arrayList2.size();
        int[][] iArr6 = new int[size2][];
        zzgtr.m7133f(arrayList2.size() == size2 ? 1 : i2);
        arrayList2.toArray(iArr6);
        int i14 = i2;
        while (i14 < 2) {
            if (zzabeVar.f4838a[i14] == 5) {
                zzaba zzabaVarM3908m = m3908m(zzzoVar2, iArr6, zzaanVar);
                zzabaVarArr[i14] = zzabaVarM3908m;
                if (zzabaVarM3908m == null) {
                    break;
                }
                int iIndexOf = zzzoVar2.f21492b.indexOf(zzabaVarM3908m.f4835a);
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                i4 = i13;
                Arrays.fill(iArr6[iIndexOf], i4);
            } else {
                i4 = i13;
            }
            i14++;
            i13 = i4;
        }
        for (int i15 = i2; i15 < 2; i15++) {
            int i16 = zzabeVar.f4838a[i15];
            if (i16 != 2 && i16 != 1) {
                if (i16 != 3 && i16 != 4 && i16 != 5 && zzabaVarArr[i15] == null) {
                    zzabaVarArr[i15] = m3908m(zzabeVar.f4839b[i15], iArr[i15], zzaanVar);
                }
            }
        }
        m3909o(zzabeVar, zzaanVar);
        m3910p(zzabeVar, zzaanVar, zzabaVarArr);
        m3911q(zzabeVar, zzaanVar, zzabaVarArr);
        zzzu zzzuVar2 = this.f4834j;
        this.f4843b.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (int i17 = i2; i17 < 2; i17++) {
            zzaba zzabaVar3 = zzabaVarArr[i17];
            if (zzabaVar3 == null || zzabaVar3.f4836b.length <= 1) {
                arrayList3.add(null);
            } else {
                zzgzi zzgziVar = zzgwt.f18303t;
                zzgwq zzgwqVar = new zzgwq();
                zzgwqVar.m7203c(new zzzt(0L, 0L));
                arrayList3.add(zzgwqVar);
            }
        }
        long[][] jArr = new long[2][];
        int i18 = i2;
        while (true) {
            j2 = -1;
            if (i18 >= 2) {
                break;
            }
            zzaba zzabaVar4 = zzabaVarArr[i18];
            if (zzabaVar4 == null) {
                jArr[i18] = new long[i2];
                i3 = i18;
            } else {
                int[] iArr7 = zzabaVar4.f4836b;
                jArr[i18] = new long[iArr7.length];
                int i19 = 0;
                while (i19 < iArr7.length) {
                    int i20 = i18;
                    long j4 = zzabaVar4.f4835a.f7810d[iArr7[i19]].f21056j;
                    long[] jArr2 = jArr[i20];
                    if (j4 == -1) {
                        j4 = 0;
                    }
                    jArr2[i19] = j4;
                    i19++;
                    i18 = i20;
                }
                i3 = i18;
                Arrays.sort(jArr[i3]);
            }
            i18 = i3 + 1;
            i2 = 0;
        }
        int[] iArr8 = new int[2];
        long[] jArr3 = new long[2];
        for (int i21 = 0; i21 < 2; i21++) {
            long[] jArr4 = jArr[i21];
            jArr3[i21] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzzv.m9067c(arrayList3, jArr3);
        zzgyd zzgydVar = new zzgyd(zzgyl.f18354s);
        new zzgyg(zzgydVar);
        zzgyj zzgyjVar = new zzgyj(zzgydVar.mo7262a(), new zzgye());
        int i22 = 0;
        for (int i23 = 2; i22 < i23; i23 = 2) {
            int length2 = jArr[i22].length;
            if (length2 <= 1) {
                zzzuVar = zzzuVar2;
                j3 = j2;
            } else {
                double[] dArr = new double[length2];
                j3 = j2;
                int i24 = 0;
                while (true) {
                    long[] jArr5 = jArr[i22];
                    double dLog = 0.0d;
                    if (i24 >= jArr5.length) {
                        break;
                    }
                    zzzu zzzuVar3 = zzzuVar2;
                    long j5 = jArr5[i24];
                    if (j5 != j3) {
                        dLog = Math.log(j5);
                    }
                    dArr[i24] = dLog;
                    i24++;
                    zzzuVar2 = zzzuVar3;
                }
                zzzu zzzuVar4 = zzzuVar2;
                int i25 = length2 - 1;
                double d = dArr[i25] - dArr[0];
                int i26 = 0;
                while (i26 < i25) {
                    double d2 = dArr[i26];
                    i26++;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i26]) * 0.5d) - dArr[0]) / d);
                    double d3 = d;
                    Integer numValueOf = Integer.valueOf(i22);
                    Map map = zzgyjVar.f18256v;
                    zzzu zzzuVar5 = zzzuVar4;
                    Collection collection = (Collection) map.get(dValueOf);
                    if (collection == null) {
                        Collection collectionMo7156e = zzgyjVar.mo7156e();
                        if (!collectionMo7156e.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        zzgyjVar.f18257w++;
                        map.put(dValueOf, collectionMo7156e);
                    } else if (collection.add(numValueOf)) {
                        zzgyjVar.f18257w++;
                    }
                    d = d3;
                    zzzuVar4 = zzzuVar5;
                }
                zzzuVar = zzzuVar4;
            }
            i22++;
            j2 = j3;
            zzzuVar2 = zzzuVar;
        }
        zzzu zzzuVar6 = zzzuVar2;
        Collection zzgvlVar = zzgyjVar.f18260t;
        if (zzgvlVar == null) {
            zzgvlVar = new zzgvl(zzgyjVar);
            zzgyjVar.f18260t = zzgvlVar;
        }
        zzgwt zzgwtVarM7220t = zzgwt.m7220t(zzgvlVar);
        for (int i27 = 0; i27 < zzgwtVarM7220t.size(); i27++) {
            int iIntValue = ((Integer) zzgwtVarM7220t.get(i27)).intValue();
            int i28 = iArr8[iIntValue] + 1;
            iArr8[iIntValue] = i28;
            jArr3[iIntValue] = jArr[iIntValue][i28];
            zzzv.m9067c(arrayList3, jArr3);
        }
        for (int i29 = 0; i29 < 2; i29++) {
            if (arrayList3.get(i29) != null) {
                long j6 = jArr3[i29];
                jArr3[i29] = j6 + j6;
            }
        }
        zzzv.m9067c(arrayList3, jArr3);
        zzgwq zzgwqVar2 = new zzgwq();
        for (int i30 = 0; i30 < arrayList3.size(); i30++) {
            zzgwq zzgwqVar3 = (zzgwq) arrayList3.get(i30);
            zzgwqVar2.m7203c(zzgwqVar3 == null ? zzgyo.f18355w : zzgwqVar3.m7214f());
        }
        zzgwt zzgwtVarM7214f = zzgwqVar2.m7214f();
        int i31 = 2;
        zzabb[] zzabbVarArr = new zzabb[2];
        int i32 = 0;
        while (i32 < i31) {
            zzaba zzabaVar5 = zzabaVarArr[i32];
            if (zzabaVar5 != null && (length = (iArr3 = zzabaVar5.f4836b).length) != 0) {
                if (length == 1) {
                    zzabcVar = new zzabc(zzabaVar5.f4835a, new int[]{iArr3[0]});
                } else {
                    zzbg zzbgVar2 = zzabaVar5.f4835a;
                    zzgwt zzgwtVar = (zzgwt) ((zzgyo) zzgwtVarM7214f).get(i32);
                    zzzuVar6.getClass();
                    zzzv zzzvVar = new zzzv(zzbgVar2, iArr3);
                    zzgwt.m7220t(zzgwtVar);
                    zzabcVar = zzzvVar;
                }
                zzabbVarArr[i32] = zzabcVar;
            }
            i32++;
            i31 = 2;
        }
        zznf[] zznfVarArr = new zznf[i31];
        for (int i33 = 0; i33 < i31; i33++) {
            zznfVarArr[i33] = (zzaanVar.f4783E.get(i33) || zzaanVar.f9100v.contains(Integer.valueOf(zzabeVar.f4838a[i33])) || (zzabeVar.f4838a[i33] != -2 && zzabbVarArr[i33] == null)) ? null : zznf.f20494a;
        }
        return Pair.create(zznfVarArr, zzabbVarArr);
    }

    /* JADX INFO: renamed from: n */
    public final void m3917n() {
        boolean z;
        zzabh zzabhVar;
        zzaco zzacoVar;
        synchronized (this.f4827c) {
            try {
                z = false;
                if (this.f4829e.f4779A && Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.f4831g) != null && zzacoVar.f4918b) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (zzabhVar = this.f4842a) == null) {
            return;
        }
        ((zzlw) zzabhVar).f20348y.mo6125l(10);
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zza() {
        synchronized (this.f4827c) {
            this.f4829e.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: b */
    public final void mo3913b() {
    }
}
