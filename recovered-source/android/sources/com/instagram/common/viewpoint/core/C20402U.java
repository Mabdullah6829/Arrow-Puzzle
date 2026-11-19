package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2U */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C20402U implements InterfaceC2639CY, InterfaceC4475gP {
    public static byte[] A0A;
    public static String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final C3659T8 A00;
    public final InterfaceC3676TP A01;
    public final InterfaceC4445fv A02;
    public final InterfaceC4476gQ A03;
    public final C4484gY A04;
    public final InterfaceC4485gZ A05;
    public final String A06;
    public final Map<EnumC4471gL, C2642Cb> A09 = new HashMap();
    public final Map<EnumC4471gL, AbstractC20492d> A08 = new HashMap();
    public final List<InterfaceC4489gd> A07 = new ArrayList();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A04() throws Throwable {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        synchronized (this) {
            for (C2642Cb c2642Cb : this.A09.values()) {
                if (c2642Cb.AAe()) {
                    map.put(c2642Cb, EnumC4492gg.A05);
                } else {
                    map.put(c2642Cb, EnumC4492gg.A04);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AbstractC20492d> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC4470gK interfaceC4470gK = null;
                if (interfaceC4470gK.AAe()) {
                    throw new NullPointerException(A01(349, 20, 51));
                }
            }
            Iterator<InterfaceC4489gd> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(TypedValues.CycleType.TYPE_WAVE_OFFSET, 22, C1137R.styleable.ConstraintSet_stateLabels));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject jSONObjectA03 = A03(map, map2, map3, map4);
        String.format(Locale.US, A01(188, 33, 57), this.A06, jSONObjectA03.toString(2));
        this.A02.AGy(this.A06, (A01(327, 8, C1137R.styleable.ConstraintSet_transitionEasing) + URLEncoder.encode(jSONObjectA03.toString())).getBytes(), new C2629CN(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<InterfaceC4488gc> setA02 = A02((JSONObject) atomicReference.get());
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            Iterator<InterfaceC4488gc> it3 = setA02.iterator();
            while (it3.hasNext()) {
                it3.next().A4D(map5, map6);
            }
            this.A03.A6b(A00((JSONObject) atomicReference.get()));
            Iterator<InterfaceC4489gd> it4 = this.A07.iterator();
            if (it4.hasNext()) {
                it4.next();
                throw new NullPointerException(A01(TypedValues.CycleType.TYPE_CURVE_FIT, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, -62, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, -61, -66, 123, -104, -85, -104, 87, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, 87, -90, -89, -85, -96, -90, -91, 87, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, -54, -80, -75, 3, -95, -57, -68, -79, -74, -64, -67, -68, -73, -56, -81, -62, -73, -67, -68, 110, -64, -77, -65, -61, -77, -63, -62, 110, -62, -67, 110, 115, -63, -120, 88, 115, -63, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, -59, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, -61, -49, -50, -44, -59, -40, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, -53, -116, 127, -128, -116, 127, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, -63, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, -49, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th) {
        Iterator<InterfaceC4489gd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(TypedValues.CycleType.TYPE_CURVE_FIT, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2639CY
    public final synchronized InterfaceC4470gK A5U(EnumC4471gL enumC4471gL) {
        if (enumC4471gL.A03() != EnumC4473gN.A04) {
            throw new IllegalArgumentException(A01(47, 59, 101));
        }
        if (this.A09.containsKey(enumC4471gL)) {
            return this.A09.get(enumC4471gL);
        }
        C2642Cb c2642Cb = new C2642Cb(enumC4471gL);
        this.A09.put(enumC4471gL, c2642Cb);
        Iterator<InterfaceC4489gd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(377, 24, C1137R.styleable.ConstraintSet_stateLabels));
        }
        String.format(Locale.US, A01(153, 35, 123), enumC4471gL);
        return c2642Cb;
    }

    static {
        A05();
    }

    public C20402U(C3659T8 c3659t8, InterfaceC3676TP interfaceC3676TP, InterfaceC4445fv interfaceC4445fv, String str, InterfaceC4485gZ interfaceC4485gZ, C4484gY c4484gY, InterfaceC4474gO interfaceC4474gO) {
        this.A00 = c3659t8;
        this.A01 = interfaceC3676TP;
        this.A02 = interfaceC4445fv;
        this.A06 = str;
        this.A05 = interfaceC4485gZ;
        this.A04 = c4484gY;
        this.A03 = interfaceC4474gO.A5E(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 44), Integer.valueOf(time)));
    }

    private Set<InterfaceC4488gc> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        Iterator<C2642Cb> it = this.A09.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[1] = "GiFNWD8Qhge";
            strArr2[3] = "8JT";
            if (zHasNext) {
                final C2642Cb next = it.next();
                switch (C4487gb.A01[EnumC4493gh.A00(jSONObject2.getString(next.A8F().A04())).ordinal()]) {
                    case 1:
                        final JSONObject fingerprint = data.getJSONObject(next.A8F().A04()).getJSONObject(A01(312, 4, 3));
                        final JSONObject responseObject = data.getJSONObject(next.A8F().A04()).optJSONObject(A01(TypedValues.AttributesType.TYPE_PATH_ROTATE, 11, 43));
                        hashSet.add(new AbstractC2627CL(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.2X
                            public final JSONObject A00;
                            public final JSONObject A01;

                            {
                                EnumC4493gh enumC4493gh = EnumC4493gh.A03;
                                this.A00 = fingerprint;
                                this.A01 = responseObject;
                            }

                            @Override // com.instagram.common.viewpoint.core.AbstractC2627CL, com.instagram.common.viewpoint.core.InterfaceC4488gc
                            public final void A4D(Map<InterfaceC4470gK, EnumC4493gh> map, Map<SyncModifiableBundle, EnumC4480gU> map2) {
                                super.A00.A03(this.A00, this.A01);
                                super.A4D(map, map2);
                            }
                        });
                        break;
                    case 2:
                        hashSet.add(new AbstractC2627CL(next) { // from class: com.facebook.ads.redexgen.X.2W
                            {
                                EnumC4493gh enumC4493gh = EnumC4493gh.A04;
                            }
                        });
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                Iterator<AbstractC20492d> it2 = this.A08.values().iterator();
                while (it2.hasNext()) {
                    it2.next();
                    final AbstractC20492d abstractC20492d = null;
                    switch (C4487gb.A00[EnumC4480gU.A00(jSONObject2.getString(abstractC20492d.A8F().A04())).ordinal()]) {
                        case 1:
                            hashSet.add(new AbstractC2628CM(abstractC20492d) { // from class: com.facebook.ads.redexgen.X.2b
                                {
                                    EnumC4480gU enumC4480gU = EnumC4480gU.A03;
                                }
                            });
                            break;
                        case 2:
                            hashSet.add(new AbstractC2628CM(abstractC20492d) { // from class: com.facebook.ads.redexgen.X.2V
                                public static byte[] A00;

                                static {
                                    A01();
                                }

                                public static String A00(int i2, int i3, int i4) {
                                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
                                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 102);
                                    }
                                    return new String(bArrCopyOfRange);
                                }

                                public static void A01() {
                                    A00 = new byte[]{48, 34, 49, 15, 34, 46, 50, 38, 47, 34, 48, 16, 54, 43, 32};
                                }

                                {
                                    EnumC4480gU enumC4480gU = EnumC4480gU.A04;
                                }

                                @Override // com.instagram.common.viewpoint.core.AbstractC2628CM, com.instagram.common.viewpoint.core.InterfaceC4488gc
                                public final void A4D(Map<InterfaceC4470gK, EnumC4493gh> map, Map<SyncModifiableBundle, EnumC4480gU> map2) {
                                    throw new NullPointerException(A00(0, 15, 87));
                                }
                            });
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                return hashSet;
            }
        }
    }

    private JSONObject A03(Map<InterfaceC4470gK, EnumC4492gg> map, Map<SyncModifiableBundle, EnumC4479gT> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String strA01;
        JSONObject syncRequest = new JSONObject();
        for (Map.Entry<InterfaceC4470gK, EnumC4492gg> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A8F().A04(), entry.getValue().A03());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC4479gT> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC4470gK interfaceC4470gK = null;
            String strA04 = interfaceC4470gK.A8F().A04();
            String strA03 = entry2.getValue().A03();
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(strA04, strA03);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<InterfaceC4470gK, EnumC4492gg>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strA01 = A01(TypedValues.AttributesType.TYPE_PATH_ROTATE, 11, 43);
            if (!zHasNext) {
                break;
            }
            Map.Entry<InterfaceC4470gK, EnumC4492gg> next = it.next();
            if (next.getValue() == EnumC4492gg.A05) {
                JSONObject updateData = new JSONObject();
                InterfaceC4470gK key = next.getKey();
                jSONObject.put(key.A8F().A04(), updateData);
                if (next.getKey().A8F().A05()) {
                    JSONObject request = key.A88();
                    updateData.put(strA01, request);
                } else {
                    updateData.put(strA01, JSONObject.NULL);
                }
                EnumC4471gL enumC4471gLA8F = key.A8F();
                String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(enumC4471gLA8F.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(enumC4471gLA8F.A04(), updateData);
                }
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC4479gT> entry3 : map2.entrySet()) {
            JSONObject updateData2 = new JSONObject();
            InterfaceC4470gK key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(strA01, request2);
            if (entry3.getValue() == EnumC4479gT.A05) {
                String strA02 = A01(312, 4, 3);
                JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(strA02, request3);
                jSONObject.put(key2.A8F().A04(), updateData2);
            } else {
                jSONObject.put(key2.A8F().A04(), updateData2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A7z().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(342, 7, 111), syncRequest);
        jSONObject3.put(A01(298, 7, 109), jSONObject);
        jSONObject3.put(A01(305, 7, 75), jSONObject2);
        return jSONObject3;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, C1137R.styleable.ConstraintSet_polarRelativeTo), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e) {
            atomicReference2.set(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2639CY, com.instagram.common.viewpoint.core.InterfaceC3665TE
    public final void A6d() {
        this.A03.A6c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4475gP
    public final void AIo() {
        if (this.A01.AAh()) {
            String str = A01(106, 23, 34) + this.A01.A7k().A07() + A01(0, 29, 49);
            A08(new C4491gf());
            return;
        }
        try {
            if (!C3763Up.A27(this.A00) || this.A00.A04().AAU()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 127));
        } catch (Throwable th) {
            String.format(Locale.US, A01(249, 49, 109), Integer.valueOf(this.A04.A01()));
            A08(th);
            this.A03.A6b(this.A04.A01());
        }
    }
}
