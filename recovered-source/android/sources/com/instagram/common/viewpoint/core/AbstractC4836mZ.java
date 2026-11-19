package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4836mZ implements InterfaceC2972Hw {
    public static String[] A00 = {"S2ZlE7yw63A48uwr9dQcAEYhUnBJ4Yn0", "jzjCSZ", "gN1GhDNq1ONaTY", "QUbV6eP7CXYOE5n4wRXfJJIvrecH4qk8", "luywBeNRakBazgpsmb", "EdZTTUAmlRsHtXkkAmykmZcXBm9Gnzxa", "aBS20hcvH8Cg0VDZoQaxMtYiCLoGsxgc", "2I8VYTEH9eD6qwDjwvQqiLyn0yln2Tpt"};

    public abstract Metadata A0R(C24629e c24629e, ByteBuffer byteBuffer);

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2972Hw
    public final Metadata A5o(C24629e c24629e) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC21273y.A01(c24629e.A02);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            String[] strArr = A00;
            if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A00[1] = "EqsX6PhC";
            if (iArrayOffset == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC21273y.A07(z);
        if (c24629e.A04()) {
            return null;
        }
        return A0R(c24629e, byteBuffer);
    }
}
