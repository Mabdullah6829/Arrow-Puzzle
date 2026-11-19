package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3h */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C21103h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C5027pg, C5025pe> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{63, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C21103h() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C21103h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C21103h(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C5023pc.A0e, C5023pc.A0U.A06);
        this.A05 = bundle.getInt(C5023pc.A0d, C5023pc.A0U.A05);
        this.A04 = bundle.getInt(C5023pc.A0c, C5023pc.A0U.A04);
        this.A03 = bundle.getInt(C5023pc.A0b, C5023pc.A0U.A03);
        this.A0A = bundle.getInt(C5023pc.A0i, C5023pc.A0U.A0A);
        this.A09 = bundle.getInt(C5023pc.A0h, C5023pc.A0U.A09);
        this.A08 = bundle.getInt(C5023pc.A0n(), C5023pc.A0U.A08);
        this.A07 = bundle.getInt(C5023pc.A0f, C5023pc.A0U.A07);
        this.A0F = bundle.getInt(C5023pc.A0v, C5023pc.A0U.A0F);
        this.A0E = bundle.getInt(C5023pc.A0t, C5023pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(C5023pc.A0u, C5023pc.A0U.A0Q);
        this.A0M = AbstractC2570BP.A07((String[]) AbstractC4727ka.A00(bundle.getStringArray(C5023pc.A0p), new String[0]));
        this.A0D = bundle.getInt(C5023pc.A0q, C5023pc.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC4727ka.A00(bundle.getStringArray(C5023pc.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages2 = new String[0];
        this.A0I = A0G((String[]) AbstractC4727ka.A00(bundle.getStringArray(C5023pc.A0j), preferredVideoLanguages2));
        this.A0B = bundle.getInt(C5023pc.A0l, C5023pc.A0U.A0B);
        this.A02 = bundle.getInt(C5023pc.A0a, C5023pc.A0U.A02);
        this.A01 = bundle.getInt(C5023pc.A0Z, C5023pc.A0U.A01);
        String[] preferredVideoLanguages3 = new String[0];
        this.A0J = AbstractC2570BP.A07((String[]) AbstractC4727ka.A00(bundle.getStringArray(C5023pc.A0k), preferredVideoLanguages3));
        String[] preferredVideoLanguages4 = new String[0];
        this.A0K = A0G((String[]) AbstractC4727ka.A00(bundle.getStringArray(C5023pc.A0m), preferredVideoLanguages4));
        this.A0C = bundle.getInt(C5023pc.A0n, C5023pc.A0U.A0C);
        this.A00 = bundle.getInt(C5023pc.A0e(), C5023pc.A0U.A00);
        this.A0P = bundle.getBoolean(C5023pc.A0s, C5023pc.A0U.A0P);
        this.A0O = bundle.getBoolean(C5023pc.A0X, C5023pc.A0U.A0O);
        this.A0N = bundle.getBoolean(C5023pc.A0W, C5023pc.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5023pc.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C213344.A01(C5025pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i2 = 0; i2 < listA01.size(); i2++) {
            C5025pe c5025pe = (C5025pe) listA01.get(i2);
            this.A0G.put(c5025pe.A00, c5025pe);
        }
        int[] iArr = (int[]) AbstractC4727ka.A00(bundle.getIntArray(C5023pc.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i3 : iArr) {
            this.A0H.add(Integer.valueOf(i3));
        }
    }

    public C21103h(C5023pc c5023pc) {
        A0R(c5023pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static AbstractC2570BP<String> A0G(String[] strArr) {
        C20302K c20302kA01 = AbstractC2570BP.A01();
        for (String str : (String[]) AbstractC21273y.A01(strArr)) {
            c20302kA01.A04(AbstractC22035C.A0k((String) AbstractC21273y.A01(str)));
        }
        return c20302kA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC22035C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = AbstractC2570BP.A04(AbstractC22035C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C5023pc c5023pc) {
        this.A06 = c5023pc.A06;
        this.A05 = c5023pc.A05;
        this.A04 = c5023pc.A04;
        this.A03 = c5023pc.A03;
        this.A0A = c5023pc.A0A;
        this.A09 = c5023pc.A09;
        this.A08 = c5023pc.A08;
        this.A07 = c5023pc.A07;
        this.A0F = c5023pc.A0F;
        this.A0E = c5023pc.A0E;
        this.A0Q = c5023pc.A0Q;
        this.A0M = c5023pc.A0M;
        this.A0D = c5023pc.A0D;
        this.A0L = c5023pc.A0L;
        this.A0I = c5023pc.A0I;
        this.A0B = c5023pc.A0B;
        this.A02 = c5023pc.A02;
        this.A01 = c5023pc.A01;
        this.A0J = c5023pc.A0J;
        this.A0K = c5023pc.A0K;
        this.A0C = c5023pc.A0C;
        this.A00 = c5023pc.A00;
        this.A0P = c5023pc.A0P;
        this.A0O = c5023pc.A0O;
        this.A0N = c5023pc.A0N;
        this.A0H = new HashSet<>(c5023pc.A0H);
        this.A0G = new HashMap<>(c5023pc.A0G);
    }

    public C21103h A0W(C5023pc c5023pc) {
        A0R(c5023pc);
        return this;
    }

    public C21103h A0m(int i2, int i3, boolean z) {
        this.A0F = i2;
        this.A0E = i3;
        this.A0Q = z;
        return this;
    }

    public C21103h A0n(Context context) {
        if (AbstractC22035C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C21103h A0o(Context context, boolean z) {
        Point viewportSize = AbstractC22035C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public C5023pc A0p() {
        return new C5023pc(this);
    }
}
