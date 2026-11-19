package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.protobuf.AbstractC6185M;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p011H.AbstractC0271e0;
import p022N.C0380T;
import p022N.C0384V;
import p022N.C0393Z0;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Stage<T extends Stage<T>> {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final InternalOptions options;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final C0384V toProtoStage$com_google_firebase_firebase_firestore(String name, InterfaceC6563f args, InternalOptions options, UserDataReader userDataReader) {
            AbstractC6452k.m12181e(name, "name");
            AbstractC6452k.m12181e(args, "args");
            AbstractC6452k.m12181e(options, "options");
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            C0380T c0380tM678i = C0384V.m678i();
            c0380tM678i.m669d(name);
            Iterator it = args.iterator();
            while (it.hasNext()) {
                c0380tM678i.m667b((C0393Z0) it.next());
            }
            options.forEach$com_google_firebase_firebase_firestore(new Stage$Companion$toProtoStage$2(c0380tM678i));
            AbstractC6185M abstractC6185MM12341build = c0380tM678i.m12341build();
            AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
            return (C0384V) abstractC6185MM12341build;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stage(String str, InternalOptions internalOptions, AbstractC6447f abstractC6447f) {
        this(str, internalOptions);
    }

    public abstract InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader);

    public abstract String canonicalId$com_google_firebase_firebase_firestore();

    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        throw new C0068x(AbstractC0271e0.m403k(new StringBuilder("Stage "), this.name, " does not support offline evaluation"));
    }

    public final String getName$com_google_firebase_firebase_firestore() {
        return this.name;
    }

    public final InternalOptions getOptions$com_google_firebase_firebase_firestore() {
        return this.options;
    }

    public abstract T self$com_google_firebase_firebase_firestore(InternalOptions internalOptions);

    public C0384V toProtoStage$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return Companion.toProtoStage$com_google_firebase_firebase_firestore(this.name, args$com_google_firebase_firebase_firestore(userDataReader), this.options, userDataReader);
    }

    public final T withOption(String key, C0393Z0 value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) self$com_google_firebase_firebase_firestore(this.options.with$com_google_firebase_firebase_firestore(key, value));
    }

    private Stage(String str, InternalOptions internalOptions) {
        this.name = str;
        this.options = internalOptions;
    }

    public final T withOption(String key, String value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) withOption(key, Values.encodeValue(value));
    }

    public final T withOption(String key, boolean z) {
        AbstractC6452k.m12181e(key, "key");
        return (T) withOption(key, Values.encodeValue(z));
    }

    public final T withOption(String key, long j2) {
        AbstractC6452k.m12181e(key, "key");
        return (T) withOption(key, Values.encodeValue(j2));
    }

    public final T withOption(String key, double d) {
        AbstractC6452k.m12181e(key, "key");
        return (T) withOption(key, Values.encodeValue(d));
    }

    public final T withOption(String key, Field value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return (T) withOption(key, value.toProto$com_google_firebase_firebase_firestore());
    }
}
