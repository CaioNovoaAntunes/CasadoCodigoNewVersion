package br.com.zup.autor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0017J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lbr/com/zup/autor/AutorController;", "", "autorRepository", "Lbr/com/zup/autor/AutorRepository;", "(Lbr/com/zup/autor/AutorRepository;)V", "getAutorRepository", "()Lbr/com/zup/autor/AutorRepository;", "alterarAutor", "Lio/micronaut/http/HttpResponse;", "id", "", "novoAutor", "Lautores/AutorUpdateRequest;", "buscaPorEmail", "email", "", "buscaPorID", "Lbr/com/zup/autor/Autor;", "buscaTudo", "", "deleta", "salvaAutor", "autorRequest", "Lbr/com/zup/autor/AutorRequest;", "casadocodigo5"})
@io.micronaut.http.annotation.Controller(value = "/autores")
@io.micronaut.validation.Validated()
public class AutorController {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.autor.AutorRepository autorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    @javax.transaction.Transactional()
    public br.com.zup.autor.Autor salvaAutor(@org.jetbrains.annotations.NotNull()
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
    @io.micronaut.http.annotation.Get(value = "/seila/{id}")
    public br.com.zup.autor.Autor buscaPorID(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/email")
    @javax.transaction.Transactional()
    public io.micronaut.http.HttpResponse<java.lang.Object> buscaPorEmail(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> alterarAutor(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    autores.AutorUpdateRequest novoAutor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/delet/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> deleta(@io.micronaut.http.annotation.PathVariable()
    long id) {
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