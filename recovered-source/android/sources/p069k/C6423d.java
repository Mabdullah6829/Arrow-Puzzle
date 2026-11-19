package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6481e;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6423d implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6423d f24567a = new C6423d();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24568b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("logSource"));

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24569c = AbstractC1456a.m2442i(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C6481e c6481e = (C6481e) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24568b, c6481e.f24678a);
        objectEncoderContext2.add(f24569c, c6481e.f24679b);
    }
}
