package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5070qQ implements InterfaceC201424 {
    public C20091z A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public static String[] A06 = {"SFReXFLlI4UOpNrTR2oqZFPGLDG", "ddXxuwKTXrUgQKU5ch6dGlXzKHCNOB4g", "Ka5UQw68nW6F3F15EfeRiHjBxEcftjYi", "TyFhGc", "kpbiwOTtMuCD4LdTginQH36Spnec", "0F8UT5ylucYBCPc3EM7PRaW9", "xfENz4MNKGXPVezlH9FH4FhAxccJ4akv", "0RZwBffOFnQLfCTDTyZnu0"};
    public static final C5070qQ A07 = new C201020().A05();
    public static final String A0A = AbstractC22035C.A0h(0);
    public static final String A0B = AbstractC22035C.A0h(1);
    public static final String A0D = AbstractC22035C.A0h(2);
    public static final String A09 = AbstractC22035C.A0h(3);
    public static final String A0C = AbstractC22035C.A0h(4);
    public static final InterfaceC201323<C5070qQ> A08 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qR
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5070qQ.A00(bundle);
        }
    };

    public C5070qQ(int i2, int i3, int i4, int i5, int i6) {
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = i4;
        this.A01 = i5;
        this.A04 = i6;
    }

    public static /* synthetic */ C5070qQ A00(Bundle bundle) {
        C201020 c201020 = new C201020();
        if (bundle.containsKey(A0A)) {
            c201020.A01(bundle.getInt(A0A));
        }
        if (bundle.containsKey(A0B)) {
            c201020.A02(bundle.getInt(A0B));
        }
        String str = A0D;
        if (A06[0].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[5] = "GWwDRzmwjjhTaGez4rqlH73J";
        strArr[4] = "f0ceflDKapN9i1ydncZgjkps1oFM";
        if (bundle.containsKey(str)) {
            c201020.A04(bundle.getInt(A0D));
        }
        if (bundle.containsKey(A09)) {
            c201020.A00(bundle.getInt(A09));
        }
        if (bundle.containsKey(A0C)) {
            c201020.A03(bundle.getInt(A0C));
        }
        return c201020.A05();
    }

    public final C20091z A01() {
        if (this.A00 == null) {
            this.A00 = new C20091z(this);
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5070qQ c5070qQ = (C5070qQ) obj;
        return this.A02 == c5070qQ.A02 && this.A03 == c5070qQ.A03 && this.A05 == c5070qQ.A05 && this.A01 == c5070qQ.A01 && this.A04 == c5070qQ.A04;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A03) * 31;
        int result3 = this.A05;
        int result4 = (((result2 + result3) * 31) + this.A01) * 31;
        int result5 = this.A04;
        return result4 + result5;
    }
}
