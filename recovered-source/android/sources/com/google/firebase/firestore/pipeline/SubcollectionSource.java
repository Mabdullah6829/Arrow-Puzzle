package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcollectionSource extends Stage<SubcollectionSource> {
    public static final Companion Companion = new Companion(null);
    private final String path;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: of */
        public final SubcollectionSource m11460of(String path) {
            AbstractC6452k.m12181e(path, "path");
            return new SubcollectionSource(path, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubcollectionSource(String str, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(str, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    /* JADX INFO: renamed from: of */
    public static final SubcollectionSource m11459of(String str) {
        return Companion.m11460of(str);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue(this.path)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName$com_google_firebase_firebase_firestore());
        sb.append('(');
        return AbstractC0271e0.m401i(sb, this.path, ')');
    }

    public final String getPath$com_google_firebase_firebase_firestore() {
        return this.path;
    }

    private SubcollectionSource(String str, InternalOptions internalOptions) {
        super("subcollection", internalOptions, null);
        this.path = str;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public SubcollectionSource self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new SubcollectionSource(this.path, options);
    }
}
