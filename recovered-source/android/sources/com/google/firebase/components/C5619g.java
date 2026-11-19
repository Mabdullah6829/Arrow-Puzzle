package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.firebase.components.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5619g implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23549a;

    public /* synthetic */ C5619g(int i2) {
        this.f23549a = i2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f23549a) {
            case 0:
                return OptionalProvider.lambda$static$1();
            default:
                return Collections.EMPTY_SET;
        }
    }
}
