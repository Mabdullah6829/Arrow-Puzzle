package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4671jf implements InterfaceC4149b8 {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC4670je A01;
    public final /* synthetic */ C3732UK A02;

    public C4671jf(AbstractC4670je abstractC4670je, int i2, C3732UK c3732uk) {
        this.A01 = abstractC4670je;
        this.A00 = i2;
        this.A02 = c3732uk;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
    public final void AE7(C4148b7 c4148b7) {
        if (this.A00 == 0) {
            this.A02.A1k(this.A01.A04);
        }
        this.A02.A1o(c4148b7.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
