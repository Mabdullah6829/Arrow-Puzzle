package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6203V0 extends AbstractC6199T0 {
    @Override // com.google.protobuf.AbstractC6199T0
    /* JADX INFO: renamed from: a */
    public final C6201U0 mo11821a(Object obj) {
        AbstractC6185M abstractC6185M = (AbstractC6185M) obj;
        C6201U0 c6201u0 = abstractC6185M.unknownFields;
        if (c6201u0 != C6201U0.f24124f) {
            return c6201u0;
        }
        C6201U0 c6201u1 = new C6201U0();
        abstractC6185M.unknownFields = c6201u1;
        return c6201u1;
    }
}
