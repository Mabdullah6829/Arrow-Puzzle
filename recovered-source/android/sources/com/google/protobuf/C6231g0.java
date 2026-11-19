package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6231g0 extends AbstractC6234h0 {
    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: a */
    public final void mo11879a(Object obj, long j2) {
        AbstractC6221d abstractC6221d = (AbstractC6221d) ((InterfaceC6210Z) AbstractC6223d1.f24164c.m11854k(obj, j2));
        if (abstractC6221d.f24160s) {
            abstractC6221d.f24160s = false;
        }
    }

    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: b */
    public final void mo11880b(Object obj, Object obj2, long j2) {
        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
        InterfaceC6210Z interfaceC6210ZMutableCopyWithCapacity = (InterfaceC6210Z) abstractC6220c1.m11854k(obj, j2);
        InterfaceC6210Z interfaceC6210Z = (InterfaceC6210Z) abstractC6220c1.m11854k(obj2, j2);
        int size = interfaceC6210ZMutableCopyWithCapacity.size();
        int size2 = interfaceC6210Z.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC6221d) interfaceC6210ZMutableCopyWithCapacity).f24160s) {
                interfaceC6210ZMutableCopyWithCapacity = interfaceC6210ZMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            interfaceC6210ZMutableCopyWithCapacity.addAll(interfaceC6210Z);
        }
        if (size > 0) {
            interfaceC6210Z = interfaceC6210ZMutableCopyWithCapacity;
        }
        AbstractC6223d1.m11875p(obj, j2, interfaceC6210Z);
    }

    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: c */
    public final List mo11881c(Object obj, long j2) {
        InterfaceC6210Z interfaceC6210Z = (InterfaceC6210Z) AbstractC6223d1.f24164c.m11854k(obj, j2);
        if (((AbstractC6221d) interfaceC6210Z).f24160s) {
            return interfaceC6210Z;
        }
        int size = interfaceC6210Z.size();
        InterfaceC6210Z interfaceC6210ZMutableCopyWithCapacity = interfaceC6210Z.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        AbstractC6223d1.m11875p(obj, j2, interfaceC6210ZMutableCopyWithCapacity);
        return interfaceC6210ZMutableCopyWithCapacity;
    }
}
