package br.com.zup.autor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lbr/com/zup/autor/AutorRequest;", "", "nome", "", "descricao", "email", "cep", "numero", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCep", "()Ljava/lang/String;", "getDescricao", "getEmail", "getNome", "getNumero", "toAutor", "Lbr/com/zup/autor/Autor;", "casadocodigo5"})
@io.micronaut.core.annotation.Introspected()
public final class AutorRequest {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String descricao = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Email()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String cep = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String numero = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.autor.Autor toAutor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescricao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCep() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumero() {
        return null;
    }
    
    public AutorRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String descricao, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String cep, @org.jetbrains.annotations.NotNull()
    java.lang.String numero) {
        super();
    }
}