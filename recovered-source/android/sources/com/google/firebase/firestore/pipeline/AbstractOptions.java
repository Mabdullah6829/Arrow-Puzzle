package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.AbstractOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractOptions<T extends AbstractOptions<T>> {
    private final InternalOptions options;

    public AbstractOptions(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        this.options = options;
    }

    public final T adding(AbstractOptions<?> newOptions) {
        AbstractC6452k.m12181e(newOptions, "newOptions");
        return (T) self$com_google_firebase_firebase_firestore(this.options.adding$com_google_firebase_firebase_firestore(newOptions.options));
    }

    public final InternalOptions getOptions$com_google_firebase_firebase_firestore() {
        return this.options;
    }

    public abstract T self$com_google_firebase_firebase_firestore(InternalOptions internalOptions);

    public final T with(String key, C0393Z0 value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) self$com_google_firebase_firebase_firestore(this.options.with$com_google_firebase_firebase_firestore(key, value));
    }

    public final T with$com_google_firebase_firebase_firestore(String key, InternalOptions value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) self$com_google_firebase_firebase_firestore(this.options.with$com_google_firebase_firebase_firestore(key, value));
    }

    public final T with(String key, String... values) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(values, "values");
        InternalOptions internalOptions = this.options;
        List listM12120r = AbstractC6306n.m12120r(Arrays.copyOf(values, values.length));
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(listM12120r, 10));
        Iterator it = listM12120r.iterator();
        while (it.hasNext()) {
            arrayList.add(Values.encodeValue((String) it.next()));
        }
        return (T) self$com_google_firebase_firebase_firestore(internalOptions.with$com_google_firebase_firebase_firestore(key, arrayList));
    }

    public final T with(String key, AbstractOptions<?> subSection) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(subSection, "subSection");
        return (T) self$com_google_firebase_firebase_firestore(this.options.with$com_google_firebase_firebase_firestore(key, subSection.options));
    }

    public final T with(String key, String value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) with(key, Values.encodeValue(value));
    }

    public final T with(String key, boolean z) {
        AbstractC6452k.m12181e(key, "key");
        return (T) with(key, Values.encodeValue(z));
    }

    public final T with(String key, long j2) {
        AbstractC6452k.m12181e(key, "key");
        return (T) with(key, Values.encodeValue(j2));
    }

    public final T with(String key, double d) {
        AbstractC6452k.m12181e(key, "key");
        return (T) with(key, Values.encodeValue(d));
    }

    public final T with(String key, Field value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) with(key, value.toProto$com_google_firebase_firebase_firestore());
    }

    public final T with(String key, RawOptions value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) with$com_google_firebase_firebase_firestore(key, value.getOptions$com_google_firebase_firebase_firestore());
    }
}
