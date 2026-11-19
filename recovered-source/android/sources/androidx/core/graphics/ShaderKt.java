package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, InterfaceC6498l interfaceC6498l) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC6498l.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
