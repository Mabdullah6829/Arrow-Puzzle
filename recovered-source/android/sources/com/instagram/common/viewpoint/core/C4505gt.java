package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4505gt implements InterfaceC3617SR {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC4470gK A01;
    public Set<InterfaceC3620SU> A00 = new HashSet();
    public final List<InterfaceC3619ST> A02 = new ArrayList();

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, 24, 81, 75, 78, 24, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.AAe()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC3620SU> setA01 = A01(this.A01.A7i());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            Iterator<InterfaceC3619ST> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A4J();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC3620SU interfaceC3620SU : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC3620SU.A9O(), interfaceC3620SU.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C4505gt(InterfaceC2639CY interfaceC2639CY) {
        this.A01 = interfaceC2639CY.A5U(EnumC4471gL.A0B);
        this.A01.A41(new C4506gu(this));
        A03();
    }

    public static Set<InterfaceC3620SU> A01(JSONObject jSONObject) {
        C4504gs c4504gsA00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = jSONArrayOptJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i2 < i3) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject == null || (c4504gsA00 = C4504gs.A00(jSONObjectOptJSONObject)) == null) {
                    return null;
                }
                hashSet.add(c4504gsA00);
                i2++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3617SR
    public final void A40(InterfaceC3619ST interfaceC3619ST) {
        this.A02.add(interfaceC3619ST);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3617SR
    public final synchronized Set<InterfaceC3620SU> A6x() {
        return new HashSet(this.A00);
    }
}
