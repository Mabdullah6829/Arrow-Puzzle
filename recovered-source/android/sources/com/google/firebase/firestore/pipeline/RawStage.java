package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.C6303k;
import p058e0.C6313u;
import p089x0.AbstractC6566i;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class RawStage extends Stage<RawStage> {
    public static final Companion Companion = new Companion(null);
    private final List<GenericArg> arguments;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final RawStage ofName(String name) {
            AbstractC6452k.m12181e(name, "name");
            return new RawStage(name, C6313u.f24338s, InternalOptions.EMPTY, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RawStage(String str, List list, InternalOptions internalOptions, AbstractC6447f abstractC6447f) {
        this(str, list, internalOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0393Z0 args$lambda$0(UserDataReader userDataReader, GenericArg it) {
        AbstractC6452k.m12181e(it, "it");
        return it.toProto(userDataReader);
    }

    public static final RawStage ofName(String str) {
        return Companion.ofName(str);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        List<GenericArg> list = this.arguments;
        AbstractC6452k.m12181e(list, "<this>");
        return AbstractC6566i.m12219u(new C6303k(list, 1), new C5823b(userDataReader, 0));
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public final RawStage withArguments(Object... arguments) {
        AbstractC6452k.m12181e(arguments, "arguments");
        String name$com_google_firebase_firebase_firestore = getName$com_google_firebase_firebase_firestore();
        GenericArg.Companion companion = GenericArg.Companion;
        ArrayList arrayList = new ArrayList(arguments.length);
        for (Object obj : arguments) {
            arrayList.add(companion.from(obj));
        }
        return new RawStage(name$com_google_firebase_firebase_firestore, arrayList, getOptions$com_google_firebase_firebase_firestore());
    }

    public /* synthetic */ RawStage(String str, List list, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(str, list, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public RawStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new RawStage(getName$com_google_firebase_firebase_firestore(), this.arguments, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RawStage(String str, List<? extends GenericArg> list, InternalOptions internalOptions) {
        super(str, internalOptions, null);
        this.arguments = list;
    }
}
