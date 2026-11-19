package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6477a;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6420a implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6420a f24557a = new C6420a();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24558b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("window"));

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24559c = AbstractC1456a.m2442i(2, FieldDescriptor.builder("logSourceMetrics"));

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f24560d = AbstractC1456a.m2442i(3, FieldDescriptor.builder("globalMetrics"));

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f24561e = AbstractC1456a.m2442i(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C6477a c6477a = (C6477a) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24558b, c6477a.f24661a);
        objectEncoderContext2.add(f24559c, c6477a.f24662b);
        objectEncoderContext2.add(f24560d, c6477a.f24663c);
        objectEncoderContext2.add(f24561e, c6477a.f24664d);
    }
}
