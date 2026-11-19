package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: renamed from: com.google.protobuf.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6270w0 implements InterfaceC6178I0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6262s0 f24292a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6199T0 f24293b;

    /* JADX INFO: renamed from: c */
    public final C6163B f24294c;

    public C6270w0(AbstractC6199T0 abstractC6199T0, C6163B c6163b, InterfaceC6262s0 interfaceC6262s0) {
        this.f24293b = abstractC6199T0;
        c6163b.getClass();
        this.f24294c = c6163b;
        this.f24292a = interfaceC6262s0;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: a */
    public final void mo11731a(Object obj, C6243k0 c6243k0) {
        this.f24294c.getClass();
        AbstractC1456a.m2454u(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: b */
    public final void mo11732b(Object obj, C6263t c6263t, C6161A c6161a) {
        this.f24293b.mo11821a(obj);
        this.f24294c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: c */
    public final void mo11733c(Object obj, byte[] bArr, int i2, int i3, C6230g c6230g) {
        AbstractC6185M abstractC6185M = (AbstractC6185M) obj;
        if (abstractC6185M.unknownFields == C6201U0.f24124f) {
            abstractC6185M.unknownFields = new C6201U0();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: d */
    public final int mo11734d(AbstractC6185M abstractC6185M) {
        ((C6203V0) this.f24293b).getClass();
        return abstractC6185M.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: e */
    public final int mo11735e(AbstractC6185M abstractC6185M) {
        ((C6203V0) this.f24293b).getClass();
        C6201U0 c6201u0 = abstractC6185M.unknownFields;
        int i2 = c6201u0.f24128d;
        if (i2 != -1) {
            return i2;
        }
        int iM12072z = 0;
        for (int i3 = 0; i3 < c6201u0.f24125a; i3++) {
            int i4 = c6201u0.f24126b[i3] >>> 3;
            iM12072z += AbstractC6269w.m12072z(3, (AbstractC6251n) c6201u0.f24127c[i3]) + AbstractC6269w.m12070E(i4) + AbstractC6269w.m12069D(2) + (AbstractC6269w.m12069D(1) * 2);
        }
        c6201u0.f24128d = iM12072z;
        return iM12072z;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: f */
    public final boolean mo11736f(AbstractC6185M abstractC6185M, AbstractC6185M abstractC6185M2) {
        C6203V0 c6203v0 = (C6203V0) this.f24293b;
        c6203v0.getClass();
        C6201U0 c6201u0 = abstractC6185M.unknownFields;
        c6203v0.getClass();
        return c6201u0.equals(abstractC6185M2.unknownFields);
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final boolean isInitialized(Object obj) {
        this.f24294c.getClass();
        AbstractC1456a.m2454u(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final void makeImmutable(Object obj) {
        ((C6203V0) this.f24293b).getClass();
        C6201U0 c6201u0 = ((AbstractC6185M) obj).unknownFields;
        if (c6201u0.f24129e) {
            c6201u0.f24129e = false;
        }
        this.f24294c.getClass();
        AbstractC1456a.m2454u(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final void mergeFrom(Object obj, Object obj2) {
        AbstractC6180J0.m11754j(this.f24293b, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final Object newInstance() {
        InterfaceC6262s0 interfaceC6262s0 = this.f24292a;
        return interfaceC6262s0 instanceof AbstractC6185M ? ((AbstractC6185M) interfaceC6262s0).newMutableInstance() : interfaceC6262s0.newBuilderForType().buildPartial();
    }
}
