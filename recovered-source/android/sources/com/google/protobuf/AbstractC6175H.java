package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6175H extends AbstractC6215b {
    private final AbstractC6185M defaultInstance;
    protected AbstractC6185M instance;

    public AbstractC6175H(AbstractC6185M abstractC6185M) {
        this.defaultInstance = abstractC6185M;
        if (abstractC6185M.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = abstractC6185M.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        AbstractC6185M abstractC6185MNewMutableInstance = this.defaultInstance.newMutableInstance();
        C6166C0.f24055c.m11706b(abstractC6185MNewMutableInstance).mergeFrom(abstractC6185MNewMutableInstance, this.instance);
        this.instance = abstractC6185MNewMutableInstance;
    }

    @Override // com.google.protobuf.InterfaceC6264t0
    public final boolean isInitialized() {
        return AbstractC6185M.isInitialized(this.instance, false);
    }

    /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
    public final AbstractC6185M m12341build() {
        AbstractC6185M abstractC6185MBuildPartial = buildPartial();
        if (abstractC6185MBuildPartial.isInitialized()) {
            return abstractC6185MBuildPartial;
        }
        throw AbstractC6215b.newUninitializedMessageException(abstractC6185MBuildPartial);
    }

    @Override // com.google.protobuf.InterfaceC6260r0
    public AbstractC6185M buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final AbstractC6175H m12342clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC6264t0
    public AbstractC6185M getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.AbstractC6215b
    public AbstractC6175H internalMergeFrom(AbstractC6185M abstractC6185M) {
        return mergeFrom(abstractC6185M);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC6175H m12345clone() {
        AbstractC6175H abstractC6175HNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        abstractC6175HNewBuilderForType.instance = buildPartial();
        return abstractC6175HNewBuilderForType;
    }

    public AbstractC6175H mergeFrom(AbstractC6185M abstractC6185M) {
        if (getDefaultInstanceForType().equals(abstractC6185M)) {
            return this;
        }
        copyOnWrite();
        AbstractC6185M abstractC6185M2 = this.instance;
        C6166C0.f24055c.m11706b(abstractC6185M2).mergeFrom(abstractC6185M2, abstractC6185M);
        return this;
    }

    @Override // com.google.protobuf.AbstractC6215b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6175H m12348mergeFrom(byte[] bArr, int i2, int i3, C6161A c6161a) throws InvalidProtocolBufferException {
        copyOnWrite();
        try {
            C6166C0.f24055c.m11706b(this.instance).mo11733c(this.instance, bArr, i2, i2 + i3, new C6230g(c6161a));
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m11744h();
        }
    }

    @Override // com.google.protobuf.AbstractC6215b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6175H m12347mergeFrom(byte[] bArr, int i2, int i3) {
        return m12348mergeFrom(bArr, i2, i3, C6161A.m11704a());
    }

    @Override // com.google.protobuf.AbstractC6215b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6175H m12346mergeFrom(AbstractC6261s abstractC6261s, C6161A c6161a) throws IOException {
        copyOnWrite();
        try {
            InterfaceC6178I0 interfaceC6178I0M11706b = C6166C0.f24055c.m11706b(this.instance);
            AbstractC6185M abstractC6185M = this.instance;
            C6263t c6263t = abstractC6261s.f24261c;
            if (c6263t == null) {
                c6263t = new C6263t(abstractC6261s);
            }
            interfaceC6178I0M11706b.mo11732b(abstractC6185M, c6263t, c6161a);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
