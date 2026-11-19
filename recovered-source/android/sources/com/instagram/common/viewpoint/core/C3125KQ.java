package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3125KQ extends AbstractRunnableC3871Wc {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ C3113KE A00;
    public final /* synthetic */ boolean A01;

    public C3125KQ(C3113KE c3113ke, boolean z) {
        this.A00 = c3113ke;
        this.A01 = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        boolean z;
        AbstractC3992Yb abstractC3992YbA0B = this.A00.A0J.A0B();
        if (abstractC3992YbA0B != null) {
            if (this.A01) {
                z = false;
            } else {
                boolean zA0E = abstractC3992YbA0B.A0E();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (zA0E) {
                    z = false;
                } else {
                    z = true;
                }
            }
            abstractC3992YbA0B.setPageDetailsVisible(z);
            abstractC3992YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
