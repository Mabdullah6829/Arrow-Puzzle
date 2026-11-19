package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: s */
    public final List f24641s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        AbstractC6452k.m12181e(missingFields, "missingFields");
        this.f24641s = missingFields;
    }
}
