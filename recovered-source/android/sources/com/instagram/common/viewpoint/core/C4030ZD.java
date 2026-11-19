package com.instagram.common.viewpoint.core;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4030ZD implements InterfaceC3739UR {
    public static byte[] A03;
    public static String[] A04 = {"Mm6eOmxrkeU2", "MUq44yb", "oKRPVLX0GnKoqIxxSACkHhthyeGglJDi", "kpHGdbOqKKCIQYGNabgqln8bHLF6fw56", "0pAnM9hA2pxuChyanVmC1wYC", "qxO1zNdoKC3MMUxTs0mhMJ4wGZPx", "", "oKuuJ477mGyxhVSdv1rWN1Mids3hq7ZK"};
    public static final String A05;
    public final C4490ge A00;
    public final InterfaceC3750Uc<C3781V7> A01;
    public final InterfaceC3750Uc<C3781V7> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] - i4;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[4] = "X42DzCMkQ4HFIzVdD0OsfCNEPJzG";
            bArrCopyOfRange[i5] = (byte) (i6 - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A04[4].length() == 9) {
            throw new RuntimeException();
        }
        A04[4] = "UWvzDGqGj7QUhJ5x6ip4Rlib";
        A03 = new byte[]{101, 99, -78, -87, 99, -73, -68, -77, -88, 125, 99, 115, -106, 119, -88, -105, -96, -90, -123, -90, -95, -92, -109, -103, -105, -124, -105, -107, -95, -92, -106, 118, -109, -90, -109, -108, -109, -91, -105, -110, -77, -70, -77, -62, -77, -78, 110, -77, -60, -77, -68, -62, -120, 110, 112, -90, -63, -55, -52, -59, -60, -128, -44, -49, -128, -61, -52, -59, -63, -46, -128, -59, -42, -59, -50, -44, -45, -128, -45, -44, -49, -46, -63, -57, -59, 107, -122, -114, -111, -118, -119, 69, -103, -108, 69, -119, -118, -104, -118, -105, -114, -122, -111, -114, -97, -118, 69, -122, -109, 69, -118, -101, -118, -109, -103, 69, -117, -105, -108, -110, 69, -119, -122, -103, -122, -121, -122, -104, -118, 69, -74, -47, -39, -36, -43, -44, -112, -28, -33, -112, -35, -33, -26, -43, -112, -43, -26, -43, -34, -28, -29, -112, -42, -30, -33, -35, -112, -39, -34, -99, -42, -36, -39, -41, -40, -28, -112, -29, -28, -33, -30, -47, -41, -43, -112, -46, -47, -45, -37, -112, -28, -33, -112, -43, -26, -43, -34, -28, -29, -112, -44, -47, -28, -47, -46, -47, -29, -43, -40, -13, -5, -2, -9, -10, -78, 6, 1, -78, 2, -13, 4, 5, -9, -78, -13, 0, -78, -9, 8, -9, 0, 6, -78, -8, 4, 1, -1, -78, -5, 0, -65, -8, -2, -5, -7, -6, 6, -78, 5, 6, 1, 4, -13, -7, -9, 112, -117, -109, -106, -113, -114, 74, -98, -103, 74, -100, -113, -117, -114, 74, -98, -110, -113, 74, -104, -97, -105, -116, -113, -100, 74, -103, -112, 74, -113, -96, -113, -104, -98, -99, 74, -112, -100, -103, -105, 74, -114, -117, -98, -117, -116, -117, -99, -113, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -76, -90, -77, -86, -94, -83, -86, -69, -90, 97, -94, -91, 97, -90, -73, -90, -81, -75, -64, -27, -35, -29, -32, -34, -33, -21, -92, -72, -37, -68, -19, -36, -27, -21, -54, -21, -26, -23, -40, -34, -36, -55, -36, -38, -26, -23, -37, -69, -40, -21, -40, -39, -40, -22, -36, -37, -18, -20, -8, -5, -19, -87, -19, -22, -3, -22, -21, -22, -4, -18, -87, -17, -22, -14, -11, -2, -5, -18, -87, -8, -20, -20, -2, -5, -5, -18, -19, -87, 0, -15, -18, -9, -87, -5, -18, -22, -19, -14, -9, -16, -87, -18, -1, -18, -9, -3, -4, -73, -16, 3, 3, -12, -4, -1, 3, -78, -81, -62, -81, -14, -19, -116, 127, 125, -119, -116, 126, 121, 126, 123, -114, 123, 124, 123, -115, 127, -98, -112, -98, -98, -108, -102, -103, -118, -108, -113, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, -68, -79, -75, -83, -22, -27, -31, -37, -28, -93, -88, -97, -108, -3, -10, -13, -10, -9, -1, -10};
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f2 A[Catch: Ul -> 0x0138, TryCatch #1 {Ul -> 0x0138, blocks: (B:33:0x00e6, B:35:0x00f2, B:36:0x0101, B:22:0x0089, B:24:0x008f, B:26:0x009b, B:27:0x00dc, B:39:0x010a, B:40:0x010e, B:42:0x0114, B:43:0x0124, B:44:0x0128, B:46:0x012e), top: B:59:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final int A0B(int i2, Set<String> set, Set<String> set2) {
        String strA00 = A00(412, 7, C1137R.styleable.ConstraintSet_stateLabels);
        int i3 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A6W(bArr, iArr));
            List<JSONObject> listA01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC3749Ub) linkedList.getLast()).ACO()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A6W(bArr, iArr));
                listA01 = A01(listA01, bArr, iArr);
            }
            Iterator<JSONObject> it = listA01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 114));
                    try {
                        if (set.contains(string)) {
                            int i4 = next.getInt(strA00) + 1;
                            if (i4 < i2) {
                                try {
                                    next.put(strA00, i4);
                                    this.A01.AKH(A09(next));
                                } catch (C3759Ul e) {
                                    e = e;
                                    if (this.A00.A05().AAO()) {
                                        Log.e(A05, A00(130, 68, 89), e);
                                    }
                                    A05(AbstractC3690Td.A2L, e);
                                    return i3;
                                } catch (JSONException e2) {
                                    e = e2;
                                    try {
                                        if (this.A00.A05().AAO()) {
                                            Log.e(A05, A00(198, 47, 123), e);
                                        }
                                        A05(AbstractC3690Td.A2P, e);
                                    } catch (C3759Ul e3) {
                                        e = e3;
                                        if (this.A00.A05().AAO()) {
                                            Log.e(A05, A00(130, 68, 89), e);
                                        }
                                        A05(AbstractC3690Td.A2L, e);
                                        return i3;
                                    }
                                }
                            } else {
                                i3++;
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A05().AAO()) {
                                        String str = A00(39, 16, 55) + string + A00(0, 11, 44) + next.optString(A00(471, 4, 24), A00(475, 7, 113));
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (this.A00.A05().AAO()) {
                                    Log.e(A05, A00(198, 47, 123), e);
                                }
                                A05(AbstractC3690Td.A2P, e);
                            }
                        }
                    } catch (C3759Ul e5) {
                        e = e5;
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            }
            Iterator<JSONObject> it2 = listA01.iterator();
            while (it2.hasNext()) {
                this.A02.AKH(A09(it2.next()));
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC3749Ub) it3.next()).A5p();
            }
        } catch (C3759Ul e8) {
            e = e8;
        }
        return i3;
    }

    static {
        A03();
        A05 = C4030ZD.class.getSimpleName();
    }

    public C4030ZD(C4490ge c4490ge) throws IOException {
        this.A00 = c4490ge;
        this.A01 = new C3958Y3(C3747UZ.A00(A00(11, 28, 27), c4490ge), new C4032ZF(this));
        this.A02 = new C3958Y3(C3747UZ.A00(A00(322, 37, 96), c4490ge), new C4031ZE(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i2, i3));
            } catch (JSONException jsone) {
                if (this.A00.A05().AAO()) {
                    Log.e(A05, A00(85, 45, 14), jsone);
                }
                int start = AbstractC3690Td.A2P;
                A05(start, jsone);
            }
            i2 += i3;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i2, int i3) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i2, i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i2, String str) {
        C3691Te c3691Te = new C3691Te(str);
        c3691Te.A05(1);
        this.A00.A08().ABD(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 3), i2, c3691Te);
    }

    private void A05(int i2, Throwable th) {
        this.A00.A08().ABC(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 3), i2, new C3691Te(th));
    }

    public static byte[] A07(C3659T8 c3659t8, String str, C3781V7 c3781v7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 114), str);
            jSONObject.put(A00(466, 5, 95), c3781v7.A08());
            jSONObject.put(A00(471, 4, 24), c3781v7.A06().toString());
            jSONObject.put(A00(462, 4, 49), C3956Y1.A03(c3781v7.A04()));
            jSONObject.put(A00(450, 12, 125), C3956Y1.A03(c3781v7.A03()));
            jSONObject.put(A00(440, 10, 20), c3781v7.A07());
            jSONObject.put(A00(419, 4, 55), new JSONObject(c3781v7.A09()));
            jSONObject.put(A00(412, 7, C1137R.styleable.ConstraintSet_stateLabels), 0);
        } catch (JSONException e) {
            if (c3659t8.A05().AAO()) {
                Log.e(A05, A00(294, 28, 42), e);
            }
        }
        String string = jSONObject.toString();
        if (A04[3].charAt(18) == '3') {
            throw new RuntimeException();
        }
        A04[3] = "qXIRiOsc7TnqBEY389oLdIOolYF6NOqr";
        return string.getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A8s();
        } catch (C3759Ul e) {
            if (this.A00.A05().AAO()) {
                Log.e(A05, A00(245, 49, 19), e);
                return 0;
            }
            return 0;
        }
    }

    public final List<JSONObject> A0C(int i2) {
        int totalFetched = 0;
        if (i2 == -1) {
            totalFetched = 1;
            i2 = 30;
        }
        int[] eventSizes = new int[i2];
        byte[] bArr = new byte[i2 * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC3749Ub interfaceC3749UbA6W = this.A01.A6W(bArr, eventSizes);
            linkedList2.add(interfaceC3749UbA6W);
            int iA6X = interfaceC3749UbA6W.A6X();
            linkedList = A01(linkedList, bArr, eventSizes);
            while (noLimit && (iA6X < i2 || totalFetched != 0)) {
                if (totalFetched != 0) {
                    Arrays.fill(eventSizes, 0);
                } else {
                    eventSizes = new int[i2 - iA6X];
                }
                interfaceC3749UbA6W = this.A01.A6W(bArr, eventSizes);
                linkedList2.add(interfaceC3749UbA6W);
                linkedList = A01(linkedList, bArr, eventSizes);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (noLimit) {
                this.A02.AKH(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (noLimit) {
                ((InterfaceC3749Ub) it2.next()).A5p();
            }
        } catch (C3759Ul e) {
            boolean noLimit = this.A00.A05().AAO();
            if (noLimit) {
                Log.e(A05, A00(359, 53, 114), e);
            }
            A05(AbstractC3690Td.A2M, e);
        }
        return linkedList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3739UR
    public final void A51() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C3759Ul e) {
            if (this.A00.A05().AAO()) {
                Log.e(A05, A00(55, 30, 73), e);
            }
            A05(AbstractC3690Td.A2J, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3739UR
    public final void AL6(C3781V7 c3781v7, AbstractC3736UO<String> abstractC3736UO) {
        AbstractC3968YD.A00(ExecutorC3971YG.A07, new AsyncTaskC3740US(c3781v7, abstractC3736UO, this.A01, this.A00), new Void[0]);
    }
}
