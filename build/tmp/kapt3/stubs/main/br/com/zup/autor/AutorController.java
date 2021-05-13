package br.com.zup.autor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0016\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/autor/AutorController;", "", "autorRepository", "Lbr/com/zup/autor/AutorRepository;", "(Lbr/com/zup/autor/AutorRepository;)V", "getAutorRepository", "()Lbr/com/zup/autor/AutorRepository;", "buscaTudo", "", "Lbr/com/zup/autor/Autor;", "cadastrarAutor", "autorRequest", "Lbr/com/zup/autor/AutorRequest;", "searchByEmail", "email", "", "casadocodigo5"})
@io.micronaut.http.annotation.Controller(value = "/autores")
@io.micronaut.validation.Validated()
public class AutorController {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.autor.AutorRepository autorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public br.com.zup.autor.Autor cadastrarAutor(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.autor.AutorRequest autorRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public java.util.List<br.com.zup.autor.Autor> buscaTudo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{email}")
    public br.com.zup.autor.Autor searchByEmail(@org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.autor.AutorRepository getAutorRepository() {
        return null;
    }
    
    public AutorController(@org.jetbrains.annotations.NotNull()
    br.com.zup.autor.AutorRepository autorRepository) {
        super();
    }
}