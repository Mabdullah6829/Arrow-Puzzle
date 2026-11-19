package com.google.firebase.firestore.pipeline;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetStage extends Stage<OffsetStage> {
    private final int offset;

    public /* synthetic */ OffsetStage(int i2, InternalOptions internalOptions, int i3, AbstractC6447f abstractC6447f) {
        this(i2, (i3 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue(this.offset)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetStage)) {
            return false;
        }
        OffsetStage offsetStage = (OffsetStage) obj;
        return this.offset == offsetStage.offset && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), offsetStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.offset * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetStage(int i2, InternalOptions options) {
        super(TypedValues.CycleType.S_WAVE_OFFSET, options, null);
        AbstractC6452k.m12181e(options, "options");
        this.offset = i2;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public OffsetStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new OffsetStage(this.offset, options);
    }
}
