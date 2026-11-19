package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6478b;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6421b implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6421b f24562a = new C6421b();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24563b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("storageMetrics"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f24563b, ((C6478b) obj).f24665a);
    }
}
