package com.instagram.common.viewpoint.core;

import android.database.Cursor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4927o4 implements InterfaceC2595Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC2594Bn.A00(this);
    }

    public C4927o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C2591Bk A00() {
        return C24799w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2595Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2595Bo
    public final boolean moveToPosition(int i2) {
        return this.A00.moveToPosition(i2);
    }
}
