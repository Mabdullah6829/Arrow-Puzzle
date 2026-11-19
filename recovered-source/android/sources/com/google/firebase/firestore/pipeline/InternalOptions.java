package com.google.firebase.firestore.pipeline;

import com.google.protobuf.AbstractC6185M;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p003C.AbstractC0109D;
import p003C.AbstractC0119j;
import p003C.C0118i;
import p003C.C0134y;
import p011H.AbstractC0243G;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalOptions {
    public static final Companion Companion = new Companion(null);
    public static final InternalOptions EMPTY = new InternalOptions(C0134y.f204y);
    private final AbstractC0119j options;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final InternalOptions of$com_google_firebase_firebase_firestore(String key, C0393Z0 value) {
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(value, "value");
            return new InternalOptions(C0134y.m211b(1, new Object[]{key, value}, null));
        }

        private Companion() {
        }
    }

    public InternalOptions(AbstractC0119j options) {
        AbstractC6452k.m12181e(options, "options");
        this.options = options;
    }

    private final C0393Z0 toValue() {
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m633c(this.options);
        C0375Q c0375q = (C0375Q) c0371oM646k.m12341build();
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m697p(c0375q);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public final InternalOptions adding$com_google_firebase_firebase_firestore(InternalOptions newOptions) {
        AbstractC6452k.m12181e(newOptions, "newOptions");
        int i2 = ((C0134y) this.options).f207x + ((C0134y) newOptions.options).f207x;
        AbstractC0243G.m371i(i2, "expectedSize");
        C0118i c0118i = new C0118i(i2);
        c0118i.m201e(this.options.entrySet());
        c0118i.m201e(newOptions.options.entrySet());
        return new InternalOptions(c0118i.m198a(true));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InternalOptions) {
            return AbstractC6452k.m12177a(this.options, ((InternalOptions) obj).options);
        }
        return false;
    }

    public final void forEach$com_google_firebase_firebase_firestore(InterfaceC6502p f2) {
        AbstractC6452k.m12181e(f2, "f");
        AbstractC0109D it = this.options.entrySet().iterator();
        AbstractC6452k.m12180d(it, "iterator(...)");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC6452k.m12180d(key, "<get-key>(...)");
            Object value = entry.getValue();
            AbstractC6452k.m12180d(value, "<get-value>(...)");
            f2.invoke(key, value);
        }
    }

    public int hashCode() {
        return this.options.hashCode();
    }

    public final InternalOptions with$com_google_firebase_firebase_firestore(String key, C0393Z0 value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        int i2 = ((C0134y) this.options).f207x + 1;
        AbstractC0243G.m371i(i2, "expectedSize");
        C0118i c0118i = new C0118i(i2);
        c0118i.m201e(this.options.entrySet());
        c0118i.m200d(key, value);
        return new InternalOptions(c0118i.m198a(false));
    }

    public final InternalOptions with$com_google_firebase_firebase_firestore(String key, Iterable<C0393Z0> values) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(values, "values");
        C0403d c0403dM798k = C0406e.m798k();
        c0403dM798k.m787b(values);
        C0406e c0406e = (C0406e) c0403dM798k.m12341build();
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m688d(c0406e);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return with$com_google_firebase_firebase_firestore(key, (C0393Z0) abstractC6185MM12341build);
    }

    public final InternalOptions with$com_google_firebase_firebase_firestore(String key, InternalOptions value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return with$com_google_firebase_firebase_firestore(key, value.toValue());
    }

    public final InternalOptions with$com_google_firebase_firebase_firestore(String key, AbstractOptions<?> value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return with$com_google_firebase_firebase_firestore(key, value.getOptions$com_google_firebase_firebase_firestore());
    }
}
