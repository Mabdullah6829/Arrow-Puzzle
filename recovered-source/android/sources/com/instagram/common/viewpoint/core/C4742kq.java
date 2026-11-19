package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4742kq implements InterfaceC3208Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C4742kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3208Ll
    public final void AGj(int i2) throws C4739kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3208Ll
    public final void close() throws C4739kn {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3208Ll
    public final int length() throws C4739kn {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3208Ll
    public final int read(byte[] bArr) throws C4739kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
