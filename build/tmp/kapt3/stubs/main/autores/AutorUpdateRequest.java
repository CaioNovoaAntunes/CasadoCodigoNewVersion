package autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lautores/AutorUpdateRequest;", "", "nome", "", "email", "descricao", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescricao", "()Ljava/lang/String;", "getEmail", "getNome", "casadocodigo5"})
@io.micronaut.core.annotation.Introspected()
public final class AutorUpdateRequest {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Email()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 400)
    private final java.lang.String descricao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescricao() {
        return null;
    }
    
    public AutorUpdateRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String nome, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String descricao) {
        super();
    }
}