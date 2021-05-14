package br.com.zup.autor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/autor/Endereco;", "", "cep", "", "logradouro", "completo", "bairro", "localidade", "uf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBairro", "()Ljava/lang/String;", "getCep", "getCompleto", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLocalidade", "getLogradouro", "getUf", "toString", "casadocodigo5"})
@javax.persistence.Entity()
public final class Endereco {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cep = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logradouro = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String completo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bairro = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String localidade = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uf = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCep() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogradouro() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompleto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBairro() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalidade() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUf() {
        return null;
    }
    
    public Endereco(@org.jetbrains.annotations.Nullable()
    java.lang.String cep, @org.jetbrains.annotations.NotNull()
    java.lang.String logradouro, @org.jetbrains.annotations.Nullable()
    java.lang.String completo, @org.jetbrains.annotations.Nullable()
    java.lang.String bairro, @org.jetbrains.annotations.Nullable()
    java.lang.String localidade, @org.jetbrains.annotations.Nullable()
    java.lang.String uf) {
        super();
    }
}