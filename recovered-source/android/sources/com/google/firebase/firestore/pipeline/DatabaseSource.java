package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p089x0.C6559b;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class DatabaseSource extends Stage<DatabaseSource> {
    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return C6559b.f24777a;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DatabaseSource) {
            return AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), ((DatabaseSource) obj).getOptions$com_google_firebase_firebase_firestore());
        }
        return false;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode();
    }

    public /* synthetic */ DatabaseSource(InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this((i2 & 1) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public DatabaseSource self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new DatabaseSource(options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseSource(InternalOptions options) {
        super("database", options, null);
        AbstractC6452k.m12181e(options, "options");
    }
}
